package com.bulider.common.repository.support;

import java.io.Serializable;

import javax.persistence.EntityManager;

import org.springframework.beans.BeanUtils;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactoryBean;
import org.springframework.data.repository.core.RepositoryMetadata;
import org.springframework.data.repository.core.support.RepositoryFactorySupport;
import org.springframework.data.repository.query.QueryLookupStrategy;
import org.springframework.util.StringUtils;

import com.bulider.common.repository.ICacheableBaseRepository;
import com.cloudy.common.repository.callback.SearchCallback;
import com.cloudy.common.repository.support.annotation.SearchableQuery;

public class CacheableBaseRepositoryFactoryBean<R extends JpaRepository<M, ID>, M, ID extends Serializable>
         extends JpaRepositoryFactoryBean<R, M, ID> {
    public CacheableBaseRepositoryFactoryBean() {
    }

    protected RepositoryFactorySupport createRepositoryFactory(EntityManager entityManager) {
        return new CacheableBaseRepositoryFactory(entityManager);
    }
}



class CacheableBaseRepositoryFactory<M, ID extends Serializable> extends JpaRepositoryFactory {

    private EntityManager entityManager;

    public CacheableBaseRepositoryFactory(EntityManager entityManager) {
        super(entityManager);
        this.entityManager = entityManager;
    }

    protected Object getTargetRepository(RepositoryMetadata metadata) {
        Class<?> repositoryInterface = metadata.getRepositoryInterface();

        if (isBaseRepository(repositoryInterface)) {

            JpaEntityInformation<M, ID> entityInformation = getEntityInformation((Class<M>) metadata.getDomainType());
            CacheableBaseRepository repository = new CacheableBaseRepository<M, ID>(entityInformation, entityManager,repositoryInterface);

            SearchableQuery searchableQuery = AnnotationUtils.findAnnotation(repositoryInterface, SearchableQuery.class);
            if (searchableQuery != null) {
                String countAllQL = searchableQuery.countAllQuery();
                if (!StringUtils.isEmpty(countAllQL)) {
                    repository.setCountAllQL(countAllQL);
                }
                String findAllQL = searchableQuery.findAllQuery();
                if (!StringUtils.isEmpty(findAllQL)) {
                    repository.setFindAllQL(findAllQL);
                }
                Class<? extends SearchCallback> callbackClass = searchableQuery.callbackClass();
                if (callbackClass != null && callbackClass != SearchCallback.class) {
                    repository.setSearchCallback(BeanUtils.instantiate(callbackClass));
                }

                repository.setJoins(searchableQuery.joins());

            }

            return repository;
        }
        return super.getTargetRepository(metadata);
    }

    protected Class<?> getRepositoryBaseClass(RepositoryMetadata metadata) {
        if (isBaseRepository(metadata.getRepositoryInterface())) {
            return CacheableBaseRepository.class;
        }
        return super.getRepositoryBaseClass(metadata);
    }

    private boolean isBaseRepository(Class<?> repositoryInterface) {
        return ICacheableBaseRepository.class.isAssignableFrom(repositoryInterface);
    }

    @Override
    protected QueryLookupStrategy getQueryLookupStrategy(QueryLookupStrategy.Key key) {
        return super.getQueryLookupStrategy(key);
    }
}
