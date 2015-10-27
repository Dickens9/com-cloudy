package com.bulider.common.entity.search;

import java.util.HashMap;
import java.util.Map;

import org.springframework.data.domain.Sort;

import com.cloudy.common.entity.search.Searchable;

/**
 * Created by lxd on 2014/11/24.
 * 构建一个可用于单表查询的条件，主要适用缓存查询时key的组成规则
 */
public class CacheableQuery {

    //用于存放条件与与条件值
    private Map<String,Object> conditions = new HashMap<>();

    //禁用外部使用new方法创建对象
    private CacheableQuery() {}

    /**
     * 实例化方法
     * @return
     */
    public static CacheableQuery newInstance(){
       return new CacheableQuery();
    }

    /**
     *
     * @param key 查询字段
     * @param value 字段值
     * @return
     */
    public CacheableQuery addQuery(String key,Object value){
        if(key == null){
            throw new RuntimeException("the key param is required! [ key=null ]");
        }
        conditions.put(key,value);
        return this;
    }

    /**
     * 将Conditions转换成Searchable对象
     * @return
     */
    public Searchable getSearchable() {
        Searchable searchable = Searchable.newSearchable();
        for (Map.Entry<String,Object> entry:conditions.entrySet()){
            searchable.addSearchParam(entry.getKey()+"_eq",entry.getValue());
        }
        searchable.addSort(Sort.Direction.ASC,"createDate");
        return searchable;
    }

    @Override
    public String toString() {
        StringBuilder bff = new StringBuilder();
        bff.append("CacheableQuery:[");
        for (Map.Entry<String,Object> entry:conditions.entrySet()){
            bff.append(entry.getKey()).append("=").append(entry.getValue().toString()).append(" ");
        }
        bff.append("]");
        return bff.toString();
    }

}


