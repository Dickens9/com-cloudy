package com.cloudy.common.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.cloudy.common.entity.AbstractEntity;
import com.cloudy.common.entity.search.Searchable;
import com.cloudy.common.repository.BaseRepository;

/** 
 * 基础Service层接口，针对单一PO对象提供的Service层接口
 * 对于复杂的Service层
 *
 * @author linjiarong
 * @date 2014年11月3日 下午5:11:52 
 * @version 0.0.1
 * 
 * @param <M>
 * @param <ID> 
 */
public interface BaseService<M extends AbstractEntity, ID extends Serializable> {

	public abstract void setBaseRepository(BaseRepository<M, ID> baseRepository);

	/**
	 * 保存单个实体
	 *
	 * @param m 实体
	 * @return 返回保存的实体
	 */
	public abstract M save(M m);

	public abstract M saveAndFlush(M m);

	/**
	 * 更新单个实体
	 *
	 * @param m 实体
	 * @return 返回更新的实体
	 */
	public abstract M update(M m);

	/**
	 * 根据主键删除相应实体
	 *
	 * @param id 主键
	 */
	public abstract void delete(ID id);

	/**
	 * 删除实体
	 *
	 * @param m 实体
	 */
	public abstract void delete(M m);

	/**
	 * 根据主键删除相应实体
	 *
	 * @param ids 实体
	 */
	public abstract void delete(ID[] ids);

	/**
	 * 按照主键查询
	 *
	 * @param id 主键
	 * @return 返回id对应的实体
	 */
	public abstract M findOne(ID id);

	/**
	 * 实体是否存在
	 *
	 * @param id 主键
	 * @return 存在 返回true，否则false
	 */
	public abstract boolean exists(ID id);

	/**
	 * 统计实体总数
	 *
	 * @return 实体总数
	 */
	public abstract long count();

	/**
	 * 查询所有实体
	 *
	 * @return
	 */
	public abstract List<M> findAll();

	/**
	 * 按照顺序查询所有实体
	 *
	 * @param sort
	 * @return
	 */
	public abstract List<M> findAll(Sort sort);

	/**
	 * 分页及排序查询实体
	 *
	 * @param pageable 分页及排序数据
	 * @return
	 */
	public abstract Page<M> findAll(Pageable pageable);

	/**
	 * 按条件分页并排序查询实体
	 *
	 * @param searchable 条件
	 * @return
	 */
	public abstract Page<M> findAll(Searchable searchable);

	/**
	 * 按条件不分页不排序查询实体
	 *
	 * @param searchable 条件
	 * @return
	 */
	public abstract List<M> findAllWithNoPageNoSort(Searchable searchable);

	/**
	 * 按条件排序查询实体(不分页)
	 *
	 * @param searchable 条件
	 * @return
	 */
	public abstract List<M> findAllWithSort(Searchable searchable);

	/**
	 * 按条件分页并排序统计实体数量
	 *
	 * @param searchable 条件
	 * @return
	 */
	public abstract Long count(Searchable searchable);

}