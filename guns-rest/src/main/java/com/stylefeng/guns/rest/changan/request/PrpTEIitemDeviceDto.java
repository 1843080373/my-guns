package com.stylefeng.guns.rest.changan.request;

/**
 * 长安保险-确认投保请求参数 
 * 移动设备信息 
 * 此对象碎屏险0305险种对接第三方专用
 * 
 * @author Administrator
 *
 */
public class PrpTEIitemDeviceDto {
	/**
	 * 险种代码
	 */
	private String RiskCode;
	/**
	 * 姓名（必填）
	 */
	private String CarOwerName;
	/**
	 *手机号（必填）
	 */
	private String CarOwerPhone;
	/**
	 * 标的类型（必填）
	 * 手机、Ipad及其他平板电脑、笔记本电脑、其他
	 */
	private String RemarkID;
	/**
	 * 品牌型号（必填）
	 */
	private String ModelID;
	/**
	 * 设备标识码（必填）
	 */
	private String EngineID;
	/**
	 * 保险起期（必填）
	 */
	private String ExinsureServStartDay;
	/**
	 * 保险止期（必填）
	 */
	private String ExinsureServEndDay;
	/**
	 * 累计赔偿限额（必填）
	 */
	private double AccumLimitFee;
	/**
	 * 每次赔偿限额（必填）
	 */
	private double CurrentMileages;
	/**
	 * 年费率‰（必填）
	 */
	private String ExtensionCode2;
	/**
	 * 短期费率方式（必填）
	 */
	private String DeviceNoID;
	/**
	 * 保费（必填）
	 */
	private double ExinsurePremium;
	/**
	 * 免赔额
	 */
	private double ExinsureServEndMileages;
	/**
	 * 免赔率
	 */
	private double ExtensionCode3;
	public String getRiskCode() {
		return RiskCode;
	}
	public void setRiskCode(String riskCode) {
		RiskCode = riskCode;
	}
	public String getCarOwerName() {
		return CarOwerName;
	}
	public void setCarOwerName(String carOwerName) {
		CarOwerName = carOwerName;
	}
	public String getCarOwerPhone() {
		return CarOwerPhone;
	}
	public void setCarOwerPhone(String carOwerPhone) {
		CarOwerPhone = carOwerPhone;
	}
	public String getRemarkID() {
		return RemarkID;
	}
	public void setRemarkID(String remarkID) {
		RemarkID = remarkID;
	}
	public String getModelID() {
		return ModelID;
	}
	public void setModelID(String modelID) {
		ModelID = modelID;
	}
	public String getEngineID() {
		return EngineID;
	}
	public void setEngineID(String engineID) {
		EngineID = engineID;
	}
	public String getExinsureServStartDay() {
		return ExinsureServStartDay;
	}
	public void setExinsureServStartDay(String exinsureServStartDay) {
		ExinsureServStartDay = exinsureServStartDay;
	}
	public String getExinsureServEndDay() {
		return ExinsureServEndDay;
	}
	public void setExinsureServEndDay(String exinsureServEndDay) {
		ExinsureServEndDay = exinsureServEndDay;
	}
	public double getAccumLimitFee() {
		return AccumLimitFee;
	}
	public void setAccumLimitFee(double accumLimitFee) {
		AccumLimitFee = accumLimitFee;
	}
	public double getCurrentMileages() {
		return CurrentMileages;
	}
	public void setCurrentMileages(double currentMileages) {
		CurrentMileages = currentMileages;
	}
	public String getExtensionCode2() {
		return ExtensionCode2;
	}
	public void setExtensionCode2(String extensionCode2) {
		ExtensionCode2 = extensionCode2;
	}
	public String getDeviceNoID() {
		return DeviceNoID;
	}
	public void setDeviceNoID(String deviceNoID) {
		DeviceNoID = deviceNoID;
	}
	public double getExinsurePremium() {
		return ExinsurePremium;
	}
	public void setExinsurePremium(double exinsurePremium) {
		ExinsurePremium = exinsurePremium;
	}
	public double getExinsureServEndMileages() {
		return ExinsureServEndMileages;
	}
	public void setExinsureServEndMileages(double exinsureServEndMileages) {
		ExinsureServEndMileages = exinsureServEndMileages;
	}
	public double getExtensionCode3() {
		return ExtensionCode3;
	}
	public void setExtensionCode3(double extensionCode3) {
		ExtensionCode3 = extensionCode3;
	}
	
}
