package com.cloudy.common.repository.support;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.LockModeType;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.hibernate.Filter;
import org.hibernate.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.query.QueryUtils;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.LockMetadataProvider;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import com.cloudy.common.entity.search.Searchable;
import com.cloudy.common.exception.BusinessException;
import com.cloudy.common.plugin.entity.LogicDeleteable;
import com.cloudy.common.repository.BaseRepository;
import com.cloudy.common.repository.RepositoryHelper;
import com.cloudy.common.repository.callback.SearchCallback;
import com.cloudy.common.repository.hibernate.filter.EntityFilter;
import com.cloudy.common.repository.hibernate.filter.FilterQuery;
import com.cloudy.common.repository.support.annotation.QueryJoin;
import com.cloudy.common.utils.SpringUtils;

public class SimpleBaseRepository<M extends Object, ID extends Serializable> extends SimpleJpaRepository<M, ID>
  implements BaseRepository<M, ID>
{
  protected Logger logger = LoggerFactory.getLogger(super.getClass());
  public static final String LOGIC_DELETE_ALL_QUERY_STRING = "update %s x set x.isDeleted='1', x.updateDate = ?2, x.updateBy = ?3 where x.%s in (?1)";
  public static final String LOGIC_DELETE_QUERY_STRING = "update %s x set x.isDeleted='1', x.updateDate = ?2, x.updateBy = ?3 where x.%s in (?1)";
  public static final String DELETE_ALL_QUERY_STRING = "delete from %s x where x.%s in (?1)";
  public static final String FIND_QUERY_STRING = "from %s x where x.isDeleted='0' ";
  public static final String COUNT_QUERY_STRING = "select count(x) from %s x where x.isDeleted='0' ";
  private final EntityManager em;
  private final JpaEntityInformation<M, ID> entityInformation;
  private final RepositoryHelper repositoryHelper;
  private LockMetadataProvider lockMetadataProvider;
  private Class<M> entityClass;
  private String entityName;
  private String idName;
  private Class<?> springDataRepositoryInterface;
  private String findAllQL;
  private String countAllQL;
  private QueryJoin[] joins;
  private SearchCallback searchCallback = SearchCallback.DEFAULT;

  public SimpleBaseRepository(JpaEntityInformation<M, ID> entityInformation, EntityManager entityManager, Class<?> springDataRepositoryInterface) {
    super(entityInformation, entityManager);

    this.entityInformation = entityInformation;
    this.entityClass = this.entityInformation.getJavaType();
    this.entityName = this.entityInformation.getEntityName();
    this.idName = ((String)this.entityInformation.getIdAttributeNames().iterator().next());
    this.em = entityManager;
    this.springDataRepositoryInterface = springDataRepositoryInterface;

    this.repositoryHelper = new RepositoryHelper(this.entityClass);

    this.findAllQL = String.format("from %s x where x.isDeleted='0' ", new Object[] { this.entityName });
    this.countAllQL = String.format("select count(x) from %s x where x.isDeleted='0' ", new Object[] { this.entityName });
  }

  public void setLockMetadataProvider(LockMetadataProvider lockMetadataProvider)
  {
    super.setLockMetadataProvider(lockMetadataProvider);
    this.lockMetadataProvider = lockMetadataProvider;
  }

  public void setSearchCallback(SearchCallback searchCallback)
  {
    this.searchCallback = searchCallback;
  }

  public void setFindAllQL(String findAllQL)
  {
    this.findAllQL = findAllQL;
  }

  public void setCountAllQL(String countAllQL)
  {
    this.countAllQL = countAllQL;
  }

  public void setJoins(QueryJoin[] joins) {
    this.joins = joins;
  }

  @Transactional
  public void delete(ID id)
  {
    M m = findOne(id);
    delete(m);
  }
@Transactional
  public void delete(M m)
  {
    if (m == null) {
      return;
    }
    if (m instanceof LogicDeleteable)
      try {
        String ql = String.format("update %s x set x.isDeleted='1', x.updateDate = ?2, x.updateBy = ?3 where x.%s in (?1)", new Object[] { this.entityName, this.idName });
        Serializable id = BeanUtils.getProperty(m, this.idName);
        this.repositoryHelper.batchUpdate(ql, new Object[] { id, new Date(), getCurrentAuditor() });
      } catch (Exception e) {
        this.logger.error("逻辑删除失败", e);
        throw new BusinessException("逻辑删除失败", e);
      }
    else
      super.delete(m);
  }

  @Transactional
  public void delete(Serializable[] ids)
  {
    if (ArrayUtils.isEmpty(ids)) {
      return;
    }

    List idList = new ArrayList();
    for (Serializable id : ids) {
      idList.add(id);
    }

    boolean logicDeleteableEntity = LogicDeleteable.class.isAssignableFrom(this.entityClass);

    if (logicDeleteableEntity) {
      String ql = String.format("update %s x set x.isDeleted='1', x.updateDate = ?2, x.updateBy = ?3 where x.%s in (?1)", new Object[] { this.entityName, this.idName });
      this.repositoryHelper.batchUpdate(ql, new Object[] { idList, new Date(), getCurrentAuditor() });
    } else {
      String ql = String.format("delete from %s x where x.%s in (?1)", new Object[] { this.entityName, this.idName });
      this.repositoryHelper.batchUpdate(ql, new Object[] { idList });
    }
  }

  private String getCurrentAuditor() {
    AuditorAware auditorAware = (AuditorAware)SpringUtils.getBean(AuditorAware.class);
    if (auditorAware == null) {
      return "SYSTEM";
    }
    return (String)auditorAware.getCurrentAuditor();
  }

  @Transactional
  public void deleteInBatch(Iterable<M> entities)
  {
    Iterator iter = entities.iterator();
    if ((entities == null) || (!iter.hasNext())) {
      return;
    }
    Serializable[] ids = null;
    while (iter.hasNext()) {
      try {
        ids = (Serializable[])(Serializable[])ArrayUtils.add(ids, BeanUtils.getProperty(iter.next(), this.idName));
      } catch (Exception e) {
        e.printStackTrace();
      }
    }

    delete(ids);
  }
  @Transactional
  public M findOne(ID id)
  {
    if (id == null) {
      return null;
    }
    if ((id instanceof Integer) && (((Integer)id).intValue() == 0)) {
      return null;
    }
    if ((id instanceof Long) && (((Long)id).longValue() == 0L)) {
      return null;
    }
    return super.findOne(id);
  }

  public M findOne(Specification<M> spec)
  {
    try
    {
      return getQuery(spec, (Sort)null).getSingleResult(); } catch (NoResultException e) {
    }
    return null;
  }

  public List<M> findAll(Iterable<ID> ids)
  {
    return getQuery(new Specification() {
		@Override
		public Predicate toPredicate(Root root, CriteriaQuery query,
				CriteriaBuilder cb) {
			 Path path = root.get(SimpleBaseRepository.this.entityInformation.getIdAttribute());
		        return path.in(new Expression[] { cb.parameter(Iterable.class, "ids") });
		}
    }
    , (Sort)null).setParameter("ids", ids).getResultList();
  }

  public List<M> findAll(Specification<M> spec)
  {
    return getQuery(spec, (Sort)null).getResultList();
  }

  public Page<M> findAll(Specification<M> spec, Pageable pageable)
  {
    TypedQuery query = getQuery(spec, pageable);
    return (pageable == null) ? new PageImpl(query.getResultList()) : readPage(query, pageable, spec);
  }

  public List<M> findAll(Specification<M> spec, Sort sort)
  {
    return getQuery(spec, sort).getResultList();
  }

  public long count(Specification<M> spec)
  {
    return ((Long)getCountQuery(spec).getSingleResult()).longValue();
  }

  private Page<M> readPage(TypedQuery<M> query, Pageable pageable, Specification<M> spec)
  {
    query.setFirstResult(pageable.getOffset());
    query.setMaxResults(pageable.getPageSize());

    Long total = QueryUtils.executeCountQuery(getCountQuery(spec));
    List content = (total.longValue() > pageable.getOffset()) ? query.getResultList() : Collections.emptyList();

    return new PageImpl(content, pageable, total.longValue());
  }

  private TypedQuery<Long> getCountQuery(Specification<M> spec)
  {
    CriteriaBuilder builder = this.em.getCriteriaBuilder();
    CriteriaQuery query = builder.createQuery(Long.class);

    Root root = applySpecificationToCriteria(spec, query);

    if (query.isDistinct())
      query.select(builder.countDistinct(root));
    else {
      query.select(builder.count(root));
    }

    TypedQuery q = this.em.createQuery(query);
    this.repositoryHelper.applyEnableQueryCache(q);
    return q;
  }

  private TypedQuery<M> getQuery(Specification<M> spec, Pageable pageable)
  {
    Sort sort = (pageable == null) ? null : pageable.getSort();
    return getQuery(spec, sort);
  }

  private TypedQuery<M> getQuery(Specification<M> spec, Sort sort)
  {
    CriteriaBuilder builder = this.em.getCriteriaBuilder();
    CriteriaQuery query = builder.createQuery(this.entityClass);

    Root root = applySpecificationToCriteria(spec, query);

    query.select(root);

    applyJoins(root);

    if (sort != null) {
      query.orderBy(QueryUtils.toOrders(sort, root, builder));
    }

    TypedQuery q = this.em.createQuery(query);

    this.repositoryHelper.applyEnableQueryCache(q);

    return applyLockMode(q);
  }

  private void applyJoins(Root<M> root) {
    if (this.joins == null) {
      return;
    }

    for (QueryJoin join : this.joins)
      root.join(join.property(), join.joinType());
  }

  private <S> Root<M> applySpecificationToCriteria(Specification<M> spec, CriteriaQuery<S> query)
  {
    Assert.notNull(query);
    Root root = query.from(this.entityClass);

    if (spec == null) {
      return root;
    }

    CriteriaBuilder builder = this.em.getCriteriaBuilder();
    Predicate predicate = spec.toPredicate(root, query, builder);

    if (predicate != null) {
      query.where(predicate);
    }

    return root;
  }

  private TypedQuery<M> applyLockMode(TypedQuery<M> query) {
    LockModeType type = (this.lockMetadataProvider == null) ? null : this.lockMetadataProvider.getLockModeType();
    return (type == null) ? query : query.setLockMode(type);
  }

  public List<M> findAll()
  {
    return this.repositoryHelper.findAll(this.findAllQL, new Object[0]);
  }

  public List<M> findAll(Sort sort)
  {
    return this.repositoryHelper.findAll(this.findAllQL, sort, new Object[0]);
  }

  public Page<M> findAll(Pageable pageable)
  {
    return new PageImpl(this.repositoryHelper.findAll(this.findAllQL, pageable, new Object[0]), pageable, this.repositoryHelper.count(this.countAllQL, new Object[0]));
  }

  public long count()
  {
    return this.repositoryHelper.count(this.countAllQL, new Object[0]);
  }

  public Page<M> findAll(Searchable searchable)
  {
    List list = this.repositoryHelper.findAll(this.findAllQL, searchable, this.searchCallback);
    long total = list.size();
    return new PageImpl(list, searchable.getPage(), total);
  }

  public long count(Searchable searchable)
  {
    return this.repositoryHelper.count(this.countAllQL, searchable, this.searchCallback);
  }

  public boolean exists(ID id)
  {
    return findOne(id) != null;
  }

  public void enableFilter(String filterName, Map<String, Object> filterParams)
  {
    Filter filter;
    if (filterName != null) {
      filter = ((Session)this.em.unwrap(Session.class)).enableFilter(filterName);

      if (filterParams == null)
        return;
      for (String filterParamName : filterParams.keySet()) {
        Object filterParamValue = filterParams.get(filterParamName);
        filter.setParameter(filterParamName, filterParamValue);
      }
    }
  }

  public void disableFilter(String filterName)
  {
    if (filterName != null)
      ((Session)this.em.unwrap(Session.class)).disableFilter(filterName);
  }

  public List<M> doQueryWithFilter(String filterName, String filterQueryName, Map inFilterParams, Map inQueryParams)
  {
    if (BaseRepository.class.isAssignableFrom(this.springDataRepositoryInterface)) {
      Annotation entityFilterAnn = this.springDataRepositoryInterface.getAnnotation(EntityFilter.class);

      if (entityFilterAnn != null) {
        EntityFilter entityFilter = (EntityFilter)entityFilterAnn;
        FilterQuery[] filterQuerys = entityFilter.filterQueries();
        for (FilterQuery fQuery : filterQuerys) {
          if (StringUtils.equals(filterQueryName, fQuery.name())) {
            String jpql = fQuery.jpql();
            Filter filter = ((Session)this.em.unwrap(Session.class)).enableFilter(filterName);

            for (Iterator i$ = inFilterParams.keySet().iterator(); i$.hasNext(); ) { Object key = i$.next();
              String filterParamName = key.toString();
              Object filterParamValue = inFilterParams.get(key);
              filter.setParameter(filterParamName, filterParamValue); }


            Query query = this.em.createQuery(jpql);
            for (Iterator i$ = inQueryParams.keySet().iterator(); i$.hasNext(); ) { Object key = i$.next();
              String queryParamName = key.toString();
              Object queryParamValue = inQueryParams.get(key);
              query.setParameter(queryParamName, queryParamValue); }

            return query.getResultList();
          }
        }
      }
    }
    return null;
  }

  public EntityManager getEntityManager()
  {
    return this.em;
  }
}