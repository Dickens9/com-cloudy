package com.cache.product.enumdata;

import com.cache.sales.enumdata.FeeType;

/**
 * 
 * @ClassName: PdType 
 * @Description: TODO(产品类型) 
 * @author luocc
 * @date 2014年12月4日 上午9:59:50
 */
public enum PdType {
	SK("SK", "散客团", FeeType.TourFee),
	DZ("DZ", "定制团", FeeType.TourFee),
	YL("YL", "邮轮", FeeType.AccommodationFee),
	GZ("GZ", "固定自由行", FeeType.TourFee),
	BZ("BZ", "半自由行", FeeType.TourFee),
	WZ("WZ", "完全自由行", FeeType.TourFee),
	JP("JP", "机票", FeeType.Airfare),
	JD("JD", "酒店", FeeType.RoomFee),
	QZ("QZ", "签证", FeeType.VisaFee),
	PQ("PQ", "票劵", FeeType.TicketFee),
	TY("TY", "通用产品", FeeType.TourFee);
	private String code;
	private String value;
	private FeeType feeType;
	private PdType(String code,String value, FeeType feeType){
		this.code = code;
		this.value = value;
		this.feeType = feeType;
	}
	public String getCode() {
		return code;
	}
	public String getValue() {
		return value;
	}
	public FeeType getFeeType() {
		return feeType;
	}
}
