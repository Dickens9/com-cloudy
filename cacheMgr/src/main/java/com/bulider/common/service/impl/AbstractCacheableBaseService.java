package com.bulider.common.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.bulider.common.entity.search.CacheableQuery;
import com.bulider.common.repository.ICacheableBaseRepository;
import com.bulider.common.service.CacheableBaseService;
import com.cloudy.common.entity.AbstractEntity;
import com.cloudy.common.entity.search.Searchable;
import com.cloudy.common.repository.BaseRepository;
import com.google.common.collect.Lists;
import com.sun.xml.bind.v2.model.core.ID;

/**
 */
public abstract class AbstractCacheableBaseService<M extends AbstractEntity, ID extends Serializable>  implements CacheableBaseService<M,ID>{

    protected ICacheableBaseRepository<M, ID> baseRepository;

    @Autowired
    public void setBaseRepository(BaseRepository<M, ID> baseRepository) {
        this.baseRepository = (ICacheableBaseRepository)baseRepository;
    }

    @Override
    public List<M> findByConditions(CacheableQuery query) {
        return baseRepository.findByConditions(query);
    }

    public M findOneByConditions(CacheableQuery query){
        return baseRepository.findOneByConditions(query);
    }

    /**
     * 
     * @param m
     * @return
     * @see com.ibm.common.service.BaseService#save(M)
     */
    @Override
    public M save(M m) {
        return baseRepository.save(m);
    }

    /**
     * 
     * @param m
     * @return
     * @see com.ibm.common.service.BaseService#saveAndFlush(M)
     */
    @Override
    public M saveAndFlush(M m) {
        m = save(m);
        baseRepository.flush();
        return m;
    }

    /**
     * 
     * @param m
     * @return
     * @see com.ibm.common.service.BaseService#update(M)
     */
    @Override
    public M update(M m) {
        return baseRepository.save(m);
    }

    /**
     * 
     * @param id
     * @see com.ibm.common.service.BaseService#delete(ID)
     */
    @Override
    public void delete(ID id) {
        baseRepository.delete(id);
    }

    /**
     * 
     * @param m
     * @see com.ibm.common.service.BaseService#delete(M)
     */
    @Override
    public void delete(M m) {
        baseRepository.delete(m);
    }

    /**
     * 
     * @param ids
     * @see com.ibm.common.service.BaseService#delete(ID[])
     */
    @Override
    public void delete(ID[] ids) {
        baseRepository.delete(ids);
    }


    /**
     * 
     * @param id
     * @return
     * @see com.ibm.common.service.BaseService#findOne(ID)
     */
    @Override
    public M findOne(ID id) {
        return baseRepository.findOne(id);
    }

    /**
     * 
     * @param id
     * @return
     * @see com.ibm.common.service.BaseService#exists(ID)
     */
    @Override
    public boolean exists(ID id) {
        return baseRepository.exists(id);
    }

    /**
     * 
     * @return
     * @see com.ibm.common.service.BaseService#count()
     */
    @Override
    public long count() {
        return baseRepository.count();
    }

    /**
     * 
     * @return
     * @see com.ibm.common.service.BaseService#findAll()
     */
    @Override
    public List<M> findAll() {
        return baseRepository.findAll();
    }

    /**
     * 
     * @param sort
     * @return
     * @see com.ibm.common.service.BaseService#findAll(org.springframework.data.domain.Sort)
     */
    @Override
    public List<M> findAll(Sort sort) {
        return baseRepository.findAll(sort);
    }

    /**
     * 
     * @param pageable
     * @return
     * @see com.ibm.common.service.BaseService#findAll(org.springframework.data.domain.Pageable)
     */
    @Override
    public Page<M> findAll(Pageable pageable) {
        return baseRepository.findAll(pageable);
    }

    /**
     * 
     * @param searchable
     * @return
     * @see com.ibm.common.service.BaseService#findAll(com.ibm.common.entity.search.Searchable)
     */
    @Override
    public Page<M> findAll(Searchable searchable) {
        return baseRepository.findAll(searchable);
    }

    /**
     * 
     * @param searchable
     * @return
     * @see com.ibm.common.service.BaseService#findAllWithNoPageNoSort(com.ibm.common.entity.search.Searchable)
     */
    @Override
    public List<M> findAllWithNoPageNoSort(Searchable searchable) {
        searchable.removePageable();
        searchable.removeSort();
        return Lists.newArrayList(baseRepository.findAll(searchable).getContent());
    }

    /**
     * 
     * @param searchable
     * @return
     * @see com.ibm.common.service.BaseService#findAllWithSort(com.ibm.common.entity.search.Searchable)
     */
    @Override
    public List<M> findAllWithSort(Searchable searchable) {
        searchable.removePageable();
        return Lists.newArrayList(baseRepository.findAll(searchable).getContent());
    }


    /**
     * 
     * @param searchable
     * @return
     * @see com.ibm.common.service.BaseService#count(com.ibm.common.entity.search.Searchable)
     */
    @Override
    public Long count(Searchable searchable) {
        return baseRepository.count(searchable);
    }
}