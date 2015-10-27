package com.cloudy.common.repository.hibernate.filter;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface FilterQuery
{
  public abstract String name();

  public abstract String jpql();
}