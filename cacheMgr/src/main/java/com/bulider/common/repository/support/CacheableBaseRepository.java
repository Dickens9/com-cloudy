package com.bulider.common.repository.support;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.data.jpa.repository.support.JpaEntityInformation;

import com.bulider.common.entity.search.CacheableQuery;
import com.bulider.common.repository.ICacheableBaseRepository;
import com.cloudy.common.repository.support.SimpleBaseRepository;

public class CacheableBaseRepository<M, ID extends Serializable> extends SimpleBaseRepository<M,ID> implements ICacheableBaseRepository<M,ID> {

    public CacheableBaseRepository(JpaEntityInformation entityInformation, EntityManager entityManager, Class<?> springDataRepositoryInterface) {
        super(entityInformation, entityManager,springDataRepositoryInterface);
    }

    /**
     * 实现带缓存的检索方法
     * @param query
     * @return
     */
    @Override
    public List<M> findByConditions(CacheableQuery query) {
        return findAll(query.getSearchable()).getContent();
    }

    @Override
    public M findOneByConditions(CacheableQuery query) {
        List<M> m = findByConditions(query);
        return m==null?null:(m.size()>0?m.get(0):null);
    }

}
