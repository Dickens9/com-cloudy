package com.cloudy.uam.template.remote;

import java.util.List;
import java.util.Map;

import com.cloudy.uam.template.remote.vo.TemplateVariable;

/** 
 * 模板管理合并接口
 *
 * @author linjiarong
 * @date 2014年11月6日 下午2:50:56 
 * @version 0.0.1
 *  
 */
public interface UamTemplateService {
	
	/**
	 * 
	 * 合并模板
	 * @param templateCode 模板编码
	 * @param variableAndValue 传入变量与值，只需要传入依赖的变量根结点，如果可以自动生成的变量同时传入，其优先级高于变量库中的变量。
	 * @return 
	 * @return 如果为PDF返回路径，如果是文本直接返回合并结果
	 */
	public String mergeTemplate(String templateCode, Map<String, Object> variableAndValue);
	
	/**
	 * 根据模板CODE返回模板定义的变量
	 * @param templateCode
	 * @return
	 */
	public List<TemplateVariable> findVariableByTemplateCode(String templateCode);

}
