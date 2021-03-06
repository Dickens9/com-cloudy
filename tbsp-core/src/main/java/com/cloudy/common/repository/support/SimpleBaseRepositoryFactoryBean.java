package com.cloudy.common.repository.support;

import java.io.Serializable;
import javax.persistence.EntityManager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactoryBean;
import org.springframework.data.repository.core.support.RepositoryFactorySupport;

public class SimpleBaseRepositoryFactoryBean<R extends JpaRepository<M, ID>, M, ID extends Serializable> extends JpaRepositoryFactoryBean<R, M, ID>
{
  protected RepositoryFactorySupport createRepositoryFactory(EntityManager entityManager)
  {
    return new SimpleBaseRepositoryFactory(entityManager);
  }
}