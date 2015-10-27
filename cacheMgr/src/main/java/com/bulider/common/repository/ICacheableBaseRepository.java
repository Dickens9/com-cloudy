package com.bulider.common.repository;

import java.io.Serializable;
import java.util.List;

import com.bulider.common.entity.search.CacheableQuery;
import com.cloudy.common.repository.BaseRepository;

/**
 * 在基类中实现带缓存的检索机制
 */
public interface ICacheableBaseRepository<M, ID extends Serializable> extends BaseRepository<M, ID> {

    /**
     * 实现带缓存检索的单表查询方法，实现以下的SQL检索自动实别缓存的存在功能：
     *
     * select * from xxx where column1 = ? and column2= ? and ....
     *
     * @param query 条件组合
     * @return 对象结果集
     */
    List<M> findByConditions(CacheableQuery query);

    M findOneByConditions(CacheableQuery query);
}
