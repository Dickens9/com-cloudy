package com.cache.delivery.enumdata;

/**
 * 服务交付模块定义的业务异常
 * 
 * @author David
 *
 */
public enum EnumDeliveryBusinessException {
	// 业务类异常
	TOUR_GROUP_NUM_DUPLICATED("TOUR_GROUP_NUM_DUPLICATED", "团队编号重复"), TOUR_GROUP_NUM_NOT_EXISTED(
			"TOUR_GROUP_NUM_NOT_EXISTED", "团队编号不存在"), PLAN_QUERY_GROUP_NUM_RESOURCE_LIST_IS_NULL(
			"PLAN_QUERY_GROUP_NUM_RESOURCE_LIST_IS_NULL", "根据团号查询地接资源时,未获取到原数据"), PLAN_QUERY_RESOURCE_LIST_DETAIL_IS_NULL(
			"PLAN_QUERY_RESOURCE_LIST_DETAIL_IS_NULL", "查询地接资源明细时,未获取到原数据!"), PLAN_QUERY_RESOURCE_TYPE_IS_NULL(
			"PLAN_QUERY_RESOURCE_TYPE_IS_NULL", "查询地接资源时,获取安排类别为空"), PLAN_QUERY_RESOURCE_TRAFFIC_LIST_IS_NULL(
			"PLAN_QUERY_RESOURCE_TRAFFIC_LIST_IS_NULL", "查询交通安排时,未获取到原数据"), PLAN_QUERY_RESOURCE_DIET_LIST_IS_NULL(
			"PLAN_QUERY_RESOURCE_DIET_LIST_IS_NULL", "查询餐饮安排时,未获取到原数据"), PLAN_QUERY_RESOURCE_LODGING_LIST_IS_NULL(
			"PLAN_QUERY_RESOURCE_LODGING_LIST_IS_NULL", "查询住宿安排时,未获取到原数据"), PLAN_QUERY_RESOURCE_SCENIC_LIST_IS_NULL(
			"PLAN_QUERY_RESOURCE_SCENIC_LIST_IS_NULL", "查询景点安排时,未获取到原数据"),
	// add start by yanzhenluan
	GURATEE_TOURIST_ID_DUPLICATED("GURATEE_TOURIST_ID_DUPLICATED", "游客担保金生成记录已存在"), GURATEE_REFUND_OP_DUPLICATED(
			"GURATEE_REFUND_OP_DUPLICATED", "担保金缴纳明细重复退款，造成实收(应退)金额为负数"),
	// add end by yanzhenluan
	// start by suxiaojing
	COMMIT_ORDER_ACTIVITY("COMMIT_ORDER_ACTIVITY",""),UPDATE_ORDER_STATUS_EXCEPTION("UPDATE_ORDER_STATUS_EXCEPTION", "更新订单异常"), CHECK_TICKETED_EXCEPTION(
			"CHECK_TICKETED_EXCEPTION", "出票提交异常，该申请单下还有详情单未出票"), GET_TICKET_NO_EXCEPTION(
			"GET_TICKET_NO_EXCEPTION", "获取票号时异常"), GET_TOURIST_LIST_IS_NULL(
			"GET_TOURIST_LIST_IS_NULL", "根据订单id获取游客时，该订单游客为空"), AUTO_TICKETED_ORDER_STATUS_IS_NOT_TICKETED(
			"AUTO_TICKETED_ORDER_STATUS_IS_NOT_TICKETED", "自动出票时订单状态为未确认(资源未确认)暂不能出票"), TICKET_APP_DETAIL_ID_NOT_EXISTED(
			"TICKET_APP_DETAIL_ID_NOT_EXISTED", "出票申请详情 id 不存在"), TICKET_APP_DETAIL_PARAMS_IS_NULL(
			"TICKET_APP_DETAIL_PARAMS_IS_NULL", "出票详情对象内必要参数为空"), SAVE_TICKET_APP_AND_DETAIL_EXCEPTION(
			"SAVE_TICKET_APP_AND_DETAIL_EXCEPTION", "保存出票单和详情时出错"), SAVE_TICKET_APP_DETAIL_EXCEPTION(
			"SAVE_TICKET_APP_DETAIL_EXCEPTION", "保存出票详情时出错"), SAVE_TICKET_APP_EXCEPTION(
			"SAVE_TICKET_APP_EXCEPTION", "保存出票单时出错"), FIND_TICKET_APP_IS_NULL(
			"FIND_TICKET_APP_IS_NULL", "根据id查询ticketApp为空"), FIND_TICKET_APP_DETAIL_IS_NULL(
			"FIND_TICKET_APP_DETAIL_IS_NULL", "根据id查询ticketAppDetail为空"), GROUP_VISIT_APP_IS_NULL(
			"GROUP_VISIT_APP_IS_NULL", "查不到该团的回访申请"), GUIDE_APP_HAS_UNASSIGNED(
			"GUIDE_APP_HAS_UNASSIGNED", "该团的导游申请单还有导游未指派"),
	// end by suxiaojing

	PARENT_GROUP_NUM_IS_NULL("PARENT_GROUP_NUM_IS_NULL", "已分团组团的母团团号为空"),

	// 技术类异常
	REPOSITORY_ERROR("repository_error", "Impl调用 repository 层数据操作错误"), BUSINESS_ILLEGALACCESSEXCEPTION(
			"IllegalAccessException", "在对象反射时'无法访问指定类、字段、方法或构造方法的定义时抛出异常"), BUSINESS_INVOCATIONTARGETEXCEPTION(
			"InvocationTargetException", "在对象反射时'包装由调用方法或构造方法所抛出异常"), BUSINESS_CONVERSIONEXCEPTION(
			"ConversionException", "参数[不兼容/转化]异常"), DataIntegrityViolationException(
			"DataIntegrityViolationException", "'唯一性约束','不能插入空值','完整性约束失败'这种约束校验失效"), FIND_ENTITY_IS_NULL(
			"entityIsNull", "获取的POJO为空"), // 当业务逻辑中,获取的POJO为必填项时,但检索出来的POJO为NULL,会报此错误
	FIND_DATA_IS_NULL("dataIsNull", "获取的数据为空"), STRING_DATA_IS_NULL("StringIsNull", "字符串数据为空"), PARAMETER_MAJOR_IS_NULL(
			"parameterIsNull", "Parameter关键数据为NULL"), // 当传输参数为主要传输数据时,参数不能为null或""
	DATE_PARSE_ERROR("dateParseException", "解析日期错误");

	/**
	 * 异常代码
	 */
	private String code;

	/**
	 * 异常描述信息，面向前台用户信息
	 */
	private String message;

	private EnumDeliveryBusinessException(String code, String message) {
		this.code = code;
		this.message = message;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
