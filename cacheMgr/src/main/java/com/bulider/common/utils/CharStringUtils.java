/*package com.bulider.common.utils;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.Column;

import org.apache.commons.lang.StringUtils;
import com.gzl.b2c.decorate.entity.CmRotateAds;
*//**
 * 
 * @author mtm
 *
 *//*
public class CharStringUtils {
	*//**
	 * 获取某一个字段对应注解
	 * @param filed
	 * @return
	 * @throws Exception
	 *//*
	public static Integer  getFileAnnotationLength(String filed) throws Exception{
		Column annotation=CmRotateAds.class.getDeclaredField(filed).getAnnotation(Column.class);
		if(annotation==null){
			return null;
		}
		return annotation.length();
	}
	public static String addString(String param,Integer length){
		if(StringUtils.isEmpty(param)){
			return null;
		}
		StringBuilder builder=new StringBuilder(param);
		for(int i=0;i<(length-param.length());i++){
			builder.append(" ");
		}
		return builder.toString();
	}
	
	public static String  getFileAnnotationMap(Class<?> cls) throws Exception{
		Field[] fields = cls.getDeclaredFields();
		Map fieldMap=new HashMap();
		for(Field field:fields){
			Column annotation=field.getAnnotation(Column.class);
			fieldMap.put(field.getName(), annotation.length());
		}
		return JsonUtils.toJson(fieldMap);
	}
}
*/