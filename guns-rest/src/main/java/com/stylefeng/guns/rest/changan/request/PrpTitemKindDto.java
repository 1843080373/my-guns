package com.stylefeng.guns.rest.changan.request;

/**
 * 长安保险-确认投保请求参数
 * 险别信息
 * 
 * @author Administrator
 *
 */
public class PrpTitemKindDto {
	/**
	 * 险别序号（必填）
	 */
	private int ItemKindNo;
	/**
	 * 险别代码（必填） 见险种责任代码
	 */
	private String KindCode;
	/**
	 * 险别名称（必填）
	 */
	private String KindName;
	/**
	 * 起保日期（必填） YYYY-MM-DD
	 */
	private String StartDate;
	/**
	 * 起保小时（必填）
	 */
	private String StartHour;
	/**
	 * 终保日期（必填） YYYY-MM-DD
	 */
	private String EndDate;
	/**
	 * 终保小时
	 */
	private String EndHour;
	/**
	 * 币别代码 参见代码定义（默认人名币）
	 */
	private String Currency;
	/**
	 * 
	 * 标的序号
	 */
	private int ItemNo;
	/**
	 * 标的代码
	 */
	private String ItemCode;
	/**
	 * 预付卡号/营业场所名称 康存科技时必传，其他对接不必传
	 */
	private String ItemDetailName;
	/**
	 * 语种标志（必填）
	 */
	private double UnitAmount;
	/**
	 * 数量
	 */
	private double Quantity;
	/**
	 * 备用字段
	 */
	private String ModeCode;
	/**
	 * 保险价值
	 */
	private double Value;
	/**
	 * 保额（必填）
	 */
	private double Amount;
	/**
	 * 保额是否计入总保额（必填） Y-是 N-否；附加险传N
	 */
	private String CalculateFlag;
	/**
	 * 标志位（必填） 至少2位,没有说明的位置请使用空格 [2]-主附险标志:1.主险;2.附加险 [5]-是否不计免赔:0.否;1.是
	 */
	private String Flag;
	/**
	 * 标准保费
	 */
	private double BenchMarkPremium;
	/**
	 * 折扣
	 */
	private double Discount;
	/**
	 * 实交保费（必填）
	 */
	private double Premium;
	/**
	 * 费率（必填）
	 */
	private double Rate;
	/**
	 * 短期费率方式（必填） 1.不计；2.按日;4.按月；默认为不计
	 */
	private String ShortRateFlag;
	/**
	 * 短期费率（必填）
	 */
	private double ShortRate;
	/**
	 * 基础保费
	 */
	private double BasePremium;
	/**
	 * 调整系数
	 */
	private double AdjustRate;
	/**
	 * 免赔额
	 */
	private double Deductible;
	/**
	 * 免赔率(%)
	 */
	private String DeductibleRate;
	/**
	 * 备用字段
	 */
	private String ProfitScale;
	/**
	 * 地址序号
	 */
	private int AddressNo;
	/**
	 * 分户名称
	 */
	private String FamilyName;
	/**
	 * 投保方式名称
	 */
	private String ModeName;
	/**
	 * 规格型号
	 */
	private String Model;
	/**
	 * 险别扩展字段1
	 */
	private String PrpTitemKindExt1;
	/**
	 * 险别扩展字段2
	 */
	private String PrpTitemKindExt2;
	/**
	 * 险别扩展字段3
	 */
	private String PrpTitemKindExt3;
	/**
	 * 险别扩展字段4
	 */
	private String PrpTitemKindExt4;
	/**
	 * 险别扩展字段5
	 */
	private String PrpTitemKindExt5;

	public int getItemKindNo() {
		return ItemKindNo;
	}

	public void setItemKindNo(int itemKindNo) {
		ItemKindNo = itemKindNo;
	}

	public String getKindCode() {
		return KindCode;
	}

	public void setKindCode(String kindCode) {
		KindCode = kindCode;
	}

	public String getKindName() {
		return KindName;
	}

	public void setKindName(String kindName) {
		KindName = kindName;
	}

	public String getStartDate() {
		return StartDate;
	}

	public void setStartDate(String startDate) {
		StartDate = startDate;
	}

	public String getStartHour() {
		return StartHour;
	}

	public void setStartHour(String startHour) {
		StartHour = startHour;
	}

	public String getEndDate() {
		return EndDate;
	}

	public void setEndDate(String endDate) {
		EndDate = endDate;
	}

	public String getEndHour() {
		return EndHour;
	}

	public void setEndHour(String endHour) {
		EndHour = endHour;
	}

	public String getCurrency() {
		return Currency;
	}

	public void setCurrency(String currency) {
		Currency = currency;
	}

	public int getItemNo() {
		return ItemNo;
	}

	public void setItemNo(int itemNo) {
		ItemNo = itemNo;
	}

	public String getItemCode() {
		return ItemCode;
	}

	public void setItemCode(String itemCode) {
		ItemCode = itemCode;
	}

	public String getItemDetailName() {
		return ItemDetailName;
	}

	public void setItemDetailName(String itemDetailName) {
		ItemDetailName = itemDetailName;
	}

	public double getUnitAmount() {
		return UnitAmount;
	}

	public void setUnitAmount(double unitAmount) {
		UnitAmount = unitAmount;
	}

	public double getQuantity() {
		return Quantity;
	}

	public void setQuantity(double quantity) {
		Quantity = quantity;
	}

	public String getModeCode() {
		return ModeCode;
	}

	public void setModeCode(String modeCode) {
		ModeCode = modeCode;
	}

	public double getValue() {
		return Value;
	}

	public void setValue(double value) {
		Value = value;
	}

	public double getAmount() {
		return Amount;
	}

	public void setAmount(double amount) {
		Amount = amount;
	}

	public String getCalculateFlag() {
		return CalculateFlag;
	}

	public void setCalculateFlag(String calculateFlag) {
		CalculateFlag = calculateFlag;
	}

	public String getFlag() {
		return Flag;
	}

	public void setFlag(String flag) {
		Flag = flag;
	}

	public double getBenchMarkPremium() {
		return BenchMarkPremium;
	}

	public void setBenchMarkPremium(double benchMarkPremium) {
		BenchMarkPremium = benchMarkPremium;
	}

	public double getDiscount() {
		return Discount;
	}

	public void setDiscount(double discount) {
		Discount = discount;
	}

	public double getPremium() {
		return Premium;
	}

	public void setPremium(double premium) {
		Premium = premium;
	}

	public double getRate() {
		return Rate;
	}

	public void setRate(double rate) {
		Rate = rate;
	}

	public String getShortRateFlag() {
		return ShortRateFlag;
	}

	public void setShortRateFlag(String shortRateFlag) {
		ShortRateFlag = shortRateFlag;
	}

	public double getShortRate() {
		return ShortRate;
	}

	public void setShortRate(double shortRate) {
		ShortRate = shortRate;
	}

	public double getBasePremium() {
		return BasePremium;
	}

	public void setBasePremium(double basePremium) {
		BasePremium = basePremium;
	}

	public double getAdjustRate() {
		return AdjustRate;
	}

	public void setAdjustRate(double adjustRate) {
		AdjustRate = adjustRate;
	}

	public double getDeductible() {
		return Deductible;
	}

	public void setDeductible(double deductible) {
		Deductible = deductible;
	}

	public String getDeductibleRate() {
		return DeductibleRate;
	}

	public void setDeductibleRate(String deductibleRate) {
		DeductibleRate = deductibleRate;
	}

	public String getProfitScale() {
		return ProfitScale;
	}

	public void setProfitScale(String profitScale) {
		ProfitScale = profitScale;
	}

	public int getAddressNo() {
		return AddressNo;
	}

	public void setAddressNo(int addressNo) {
		AddressNo = addressNo;
	}

	public String getFamilyName() {
		return FamilyName;
	}

	public void setFamilyName(String familyName) {
		FamilyName = familyName;
	}

	public String getModeName() {
		return ModeName;
	}

	public void setModeName(String modeName) {
		ModeName = modeName;
	}

	public String getModel() {
		return Model;
	}

	public void setModel(String model) {
		Model = model;
	}

	public String getPrpTitemKindExt1() {
		return PrpTitemKindExt1;
	}

	public void setPrpTitemKindExt1(String prpTitemKindExt1) {
		PrpTitemKindExt1 = prpTitemKindExt1;
	}

	public String getPrpTitemKindExt2() {
		return PrpTitemKindExt2;
	}

	public void setPrpTitemKindExt2(String prpTitemKindExt2) {
		PrpTitemKindExt2 = prpTitemKindExt2;
	}

	public String getPrpTitemKindExt3() {
		return PrpTitemKindExt3;
	}

	public void setPrpTitemKindExt3(String prpTitemKindExt3) {
		PrpTitemKindExt3 = prpTitemKindExt3;
	}

	public String getPrpTitemKindExt4() {
		return PrpTitemKindExt4;
	}

	public void setPrpTitemKindExt4(String prpTitemKindExt4) {
		PrpTitemKindExt4 = prpTitemKindExt4;
	}

	public String getPrpTitemKindExt5() {
		return PrpTitemKindExt5;
	}

	public void setPrpTitemKindExt5(String prpTitemKindExt5) {
		PrpTitemKindExt5 = prpTitemKindExt5;
	}

}
