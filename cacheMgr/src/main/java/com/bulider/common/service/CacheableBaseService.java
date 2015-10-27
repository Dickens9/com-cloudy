package com.bulider.common.service;

import java.io.Serializable;
import java.util.List;

import com.bulider.common.entity.search.CacheableQuery;
import com.cloudy.common.entity.AbstractEntity;
import com.cloudy.common.service.BaseService;

public interface CacheableBaseService<M extends AbstractEntity, ID extends Serializable> extends BaseService<M,ID> {
    List<M> findByConditions(CacheableQuery query);
    M findOneByConditions(CacheableQuery query);
}
