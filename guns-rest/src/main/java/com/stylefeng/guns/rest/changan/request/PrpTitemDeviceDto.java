package com.stylefeng.guns.rest.changan.request;

/**
 * 长安保险-确认投保请求参数 
 * 车辆信息 
 * 此对象1560、1557险种对接第三方专用
 * 
 * @author Administrator
 *
 */
public class PrpTitemDeviceDto {
	/**
	 * 险种代码
	 */
	private String RiskCode;
	/**
	 * 序号（必填） 
	 * 无值时传空节点
	 */
	private String Itemno;
	/**
	 * 车辆号牌（必填） 
	 * 无值时传空节点
	 */
	private String Deviceno;
	/**
	 * 厂牌型号（必填） 
	 * 无值时传空节点
	 */
	private String Model;
	/**
	 * 车辆号牌底色（必填） 
	 * 见代码定义
	 */
	private String Makefactory;
	/**
	 * 使用性质（必填） 
	 * 见代码定义
	 */
	private String Makeyear;
	/**
	 * 行驶证车主（必填） 
	 * 无值时传空节点
	 */
	private String FuelName;
	/**
	 * 基本保费（必填） 
	 * 无值时传空节点
	 */
	private double PreusetemPerature;
	/**
	 * 每次事故每人赔偿限额（必填） 
	 * 无值时传空节点
	 */
	private double RealusetemPerature;
	/**
	 * 核定载客人数（必填）
	 * 无值时传空节点
	 */
	private String Capacity;
	/**
	 * 经营范围（必填） 
	 * 见代码定义
	 */
	private String Usage;
	/**
	 * 车架号/VIN码（必填） 
	 * 无值时传空节点
	 */
	private String Remark;
	/**
	 * 发动机号（必填） 
	 * 无值时传空节点
	 */
	private String DeviceName;
	/**
	 * 基本险总保额（必填） 
	 * 无值时传空节点
	 */
	private double ItemAmout;
	/**
	 * 基本险总保费（必填）
	 *  无值时传空节点
	 */
	private double ItemPremium;
	/**
	 * 标志（必填） 
	 * 无值时传空节点
	 */
	private String Flag;
	public String getRiskCode() {
		return RiskCode;
	}
	public void setRiskCode(String riskCode) {
		RiskCode = riskCode;
	}
	public String getItemno() {
		return Itemno;
	}
	public void setItemno(String itemno) {
		Itemno = itemno;
	}
	public String getDeviceno() {
		return Deviceno;
	}
	public void setDeviceno(String deviceno) {
		Deviceno = deviceno;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public String getMakefactory() {
		return Makefactory;
	}
	public void setMakefactory(String makefactory) {
		Makefactory = makefactory;
	}
	public String getMakeyear() {
		return Makeyear;
	}
	public void setMakeyear(String makeyear) {
		Makeyear = makeyear;
	}
	public String getFuelName() {
		return FuelName;
	}
	public void setFuelName(String fuelName) {
		FuelName = fuelName;
	}
	public double getPreusetemPerature() {
		return PreusetemPerature;
	}
	public void setPreusetemPerature(double preusetemPerature) {
		PreusetemPerature = preusetemPerature;
	}
	public double getRealusetemPerature() {
		return RealusetemPerature;
	}
	public void setRealusetemPerature(double realusetemPerature) {
		RealusetemPerature = realusetemPerature;
	}
	public String getCapacity() {
		return Capacity;
	}
	public void setCapacity(String capacity) {
		Capacity = capacity;
	}
	public String getUsage() {
		return Usage;
	}
	public void setUsage(String usage) {
		Usage = usage;
	}
	public String getRemark() {
		return Remark;
	}
	public void setRemark(String remark) {
		Remark = remark;
	}
	public String getDeviceName() {
		return DeviceName;
	}
	public void setDeviceName(String deviceName) {
		DeviceName = deviceName;
	}
	public double getItemAmout() {
		return ItemAmout;
	}
	public void setItemAmout(double itemAmout) {
		ItemAmout = itemAmout;
	}
	public double getItemPremium() {
		return ItemPremium;
	}
	public void setItemPremium(double itemPremium) {
		ItemPremium = itemPremium;
	}
	public String getFlag() {
		return Flag;
	}
	public void setFlag(String flag) {
		Flag = flag;
	}
}
