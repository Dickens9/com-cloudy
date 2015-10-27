package com.cloudy.uam.basedata.remote;

import java.math.BigDecimal;

import com.cloudy.uam.basedata.remote.vo.Dict;
/**
 * 
 * 基础数据服务 
 *
 * @author ruiguo
 * @date 2014年11月5日 下午11:18:32 
 * @version 0.0.1
 * 
 */
public interface UamBasedataService {

	/**
	 * 
	 * 根据类型查找字典，包括子节点，父节点为类型
	 * @param dictType
	 * @return 
	 * @return Dict    返回类型
	 */
	public Dict findDictByType(String dictType);
	
	/**
	 * 
	 * 根据字典类型和代码获取字典，包括子节点
	 * @param dictType 字典类型
	 * @param dictType 字典编码
	 * @return 如果根据dictType,dictCode找不到字典，返回null
	 */
	public Dict findDictByTypeAndCode(String dictType, String dictCode);
	
	/**
	 * 
	 * 根据字典类型和代码获取字典，包括子节点
	 * @param dictType 字典类型
	 * @param dictType 字典编码
	 * @return 如果根据dictType,dictCode找不到字典，返回null
	 */
	public String getDictValue(String dictType, String dictCode);
	
	
	
	/**
	 * 
	 * 根据dictId查询，包括子节点
	 * @param dictId
	 * @return 
	 * @return Dict    返回类型
	 */
	public Dict findDictById(String dictId);
	
	/**
	 * 
	 * 根据序列生成下一个值 
	 * @param seqCode
	 * @return 
	 * @return String    返回类型
	 */
	public String nextSeqVal(String seqCode, Object... params);
	
	/**
	 * 
	 * 获取序列当前值,不产生新的序列
	 * @param seqCode
	 * @param params
	 * @return 
	 * @return String    返回类型
	 */
	public String curSeqVal(String seqCode, Object... params);
	
	/**
	 * 将序列归1,并返回归1后的序列。
	 * @param seqCode 
	 * @return void    返回类型
	 */
	public String resetSeqVal(String seqCode, Object... params);
	
	/**
	 * 
	 * 卖出汇率：从本位币转换为交易方币种的汇率(单位：交易货币:本位币)
	 * @since 2014年12月5日
	 * @param exchangCurrency 交易货币
	 * @return 
	 * @return BigDecimal    返回类型
	 */
	public BigDecimal getSellingRate(String exchangCurrency);
		
	/**
	 * 
	 * 买入汇率：从交易方币种转换为本位币的汇率(单位：本位币:交易货币)
	 * @since 2014年12月5日
	 * @param exchangCurrency 交易货币
	 * @return 
	 * @return BigDecimal    返回类型
	 */
	public BigDecimal getBuyingRate(String exhcangCurrency);
		
	/**
	 * 
	 * 获取公司的本位币种
	 * @since 2014年12月5日
	 * @param companyId
	 * @return 
	 * @return String    返回类型
	 */
	public String getStdCurrency();
	
}
