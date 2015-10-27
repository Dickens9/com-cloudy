package com.bulider.common.utils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Created by lxd on 2014/12/4.
 */
public class JsonUtils {
    private static Logger logger = LoggerFactory.getLogger(JsonUtils.class);

    private static ObjectMapper mapper = new ObjectMapper();



    /**
     * 如果JSON字符串为Null或"null"字符串,返回Null.
     * 如果JSON字符串为"[]",返回空集合.
     * 如果需要返回数组，使用数据类型如Product[].class
     * <p/>
     */
    public static <T> T toBean(String jsonString, Class<T> clazz) {
        if (StringUtils.isEmpty(jsonString)) {
            return null;
        }
        try {
            return mapper.readValue(jsonString, clazz);
        } catch (IOException e) {
            logger.warn("parse json string error:" + jsonString, e);
            return null;
        }
    }

    /**
     * 如果对象为Null,返回"null".
     * 如果集合为空集合,返回"[]".
     */
    public static String toJson(Object object) {

        try {
            return mapper.writeValueAsString(object);
        } catch (IOException e) {
            logger.warn("write to json string error:" + object, e);
            return null;
        }
    }

    /**
     * 取出Mapper做进一步的设置或使用其他序列化API.
     */
    public static ObjectMapper getMapper() {
        return mapper;
    }
    /**
     * 获取泛型的Collection Type  
     * @param collectionClass
     * @param elementClasses
     * @return
     */
    private static JavaType getCollectionType(Class<?> collectionClass, Class<?>... elementClasses) {   
           return mapper.getTypeFactory().constructParametricType(collectionClass, elementClasses);   
    }   
    public static <T> List <T> getBeanList(String jsonString,Class<T> beanClass){
    	 JavaType javaType = getCollectionType(ArrayList.class, beanClass); 
    	 try {
			List<T> lst =  (List<T>)mapper.readValue(jsonString, javaType);
			return lst;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			logger.warn("write to json string error:" + jsonString, e);
			return null;
		} 
    }
}
