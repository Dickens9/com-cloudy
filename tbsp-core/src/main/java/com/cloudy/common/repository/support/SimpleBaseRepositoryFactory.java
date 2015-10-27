package com.cloudy.common.repository.support;

import java.io.Serializable;

import javax.persistence.EntityManager;

import org.springframework.beans.BeanUtils;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;
import org.springframework.data.repository.core.RepositoryMetadata;
import org.springframework.data.repository.query.QueryLookupStrategy;
import org.springframework.util.StringUtils;

import com.cloudy.common.repository.BaseRepository;
import com.cloudy.common.repository.callback.SearchCallback;
import com.cloudy.common.repository.support.annotation.SearchableQuery;

class SimpleBaseRepositoryFactory<M, ID extends Serializable> extends JpaRepositoryFactory
{
  private EntityManager entityManager;

  public SimpleBaseRepositoryFactory(EntityManager entityManager)
  {
    super(entityManager);
    this.entityManager = entityManager;
  }

  protected Object getTargetRepository(RepositoryMetadata metadata) {
    Class repositoryInterface = metadata.getRepositoryInterface();

    if (isBaseRepository(repositoryInterface))
    {
      JpaEntityInformation entityInformation = getEntityInformation(metadata.getDomainType());
      SimpleBaseRepository repository = new SimpleBaseRepository(entityInformation, this.entityManager, repositoryInterface);

      SearchableQuery searchableQuery = (SearchableQuery)AnnotationUtils.findAnnotation(repositoryInterface, SearchableQuery.class);
      if (searchableQuery != null) {
        String countAllQL = searchableQuery.countAllQuery();
        if (!StringUtils.isEmpty(countAllQL)) {
          repository.setCountAllQL(countAllQL);
        }
        String findAllQL = searchableQuery.findAllQuery();
        if (!StringUtils.isEmpty(findAllQL)) {
          repository.setFindAllQL(findAllQL);
        }
        Class callbackClass = searchableQuery.callbackClass();
        if ((callbackClass != null) && (callbackClass != SearchCallback.class)) {
          repository.setSearchCallback((SearchCallback)BeanUtils.instantiate(callbackClass));
        }

        repository.setJoins(searchableQuery.joins());
      }

      return repository;
    }
    return super.getTargetRepository(metadata);
  }

  protected Class<?> getRepositoryBaseClass(RepositoryMetadata metadata) {
    if (isBaseRepository(metadata.getRepositoryInterface())) {
      return SimpleBaseRepository.class;
    }
    return super.getRepositoryBaseClass(metadata);
  }

  private boolean isBaseRepository(Class<?> repositoryInterface) {
    return BaseRepository.class.isAssignableFrom(repositoryInterface);
  }

  protected QueryLookupStrategy getQueryLookupStrategy(QueryLookupStrategy.Key key)
  {
    return super.getQueryLookupStrategy(key);
  }
}