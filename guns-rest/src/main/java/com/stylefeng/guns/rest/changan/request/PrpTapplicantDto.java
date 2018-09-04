package com.stylefeng.guns.rest.changan.request;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 长安保险-确认投保请求参数
 * 投保人信息
 * @author Administrator
 *
 */
@XStreamAlias("PrpTapplicantDto")
public class PrpTapplicantDto {
	/**
	 * 投保单号
	 */
	private String ProposalNo;
	/**
	 * 语种标志（必填）
	 */
	private String Language;
	/**
	 * 序号（必填，15）
	 */
	private int SerialNo;
	/**
	 * 关系人类型（必填，1）
	 * 1.个人/2.单位
	 */
	private String InsuredType;
	/**
	 * 关系人名称（必填，150）
	 */
	private String InsuredName;
	/**
	 * 关系人性质（必填，12）
	 * 3.自然人/4.法人
	 */
	private String InsuredNature;
	/**
	 * 关系人标志 （必填）
	 * 2:投保人
	 */
	private String InsuredFlag;
	
	/**
	 * 与被保险人关系（必填）
	 * 见代码转义
	 */
	private String InsuredIdentity;
	/**
	 * 证件类型（必填）
	 * 01-身份证；02-户口本；03-护照；04-军官证；05-驾驶执照；06-返乡证；99-其它
	 */
	private String IdentifyType;
	/**
	 * 性别（必填）
	 * 1-男；2-女
	 */
	private String Sex;
	/**
	 * 年龄（必填）
	 */
	private int Age;
	/**
	 * 出生日期（必填）
	 */
	private String Birthdate;
	/**
	 * 移动电话
	 */
	private String Mobile;
	/**
	 * 联系电话
	 * 2021：税务登记电话
	 * 2021险种时该字段必传,代表税务登记电话
	 * 非2021险种必传
	 */
	private String PhoneNumber;
	
	/**
	 * 投保人邮箱
	 * 要求发邮件时必传
	 */
	private String Email;
	/**
	 * 地址
	 * 非2021险种
	 * 2021：经营地址
	 * 2021必传,含义为经营地址
	 */
	private String InsuredAddress;
	/**
	 * 邮编
	 */
	private String PostCode;
	
	/**
	 * 反洗钱客户风险等级
	 */
	private String AmlLevel;
	/**
	 * 客户编码
	 */
	private String ClientNum;
	/**
	 * 客户分级
	 */
	private String ClientLevel;
	/**
	 * 承保服务措施
	 */
	private String UnderMeasures;
	/**
	 * 理赔服务措施
	 */
	private String ClaiMmeasures;
	/**
	 * 纳税人类型（必填）
	 * 1. 一般纳税人；2. 小规模纳税人；3. 非增值税纳税人；4. 个人
	 */
	private String TaxpayerType;
	/**
	 * 发票类型（必填）
	 * 1. 增值税专用发票；2. 增值税普通发票；3. 增值税电子普通发票；4. 其他发票
	 */
	private String InvoiceType;
	/**
	 * 纳税人识别号
	 * 当开票人是企业时，该字段为必填项
	 */
	private String TaxNumber;
	/**
	 * 税务登记地址
	 * 当发票类型被选为“增值税专用发票”时，该字段为必填项
	 */
	private String TaxRegistAddress;
	/**
	 * 开户行
	 * 当发票类型被选为“增值税专用发票”时，该字段为必填项
	 */
	private String Bank;
	/**
	 * 账号
	 * 当发票类型被选为“增值税专用发票”时，该字段为必填项
	 */
	private String Account;
	/**
	 * 联系人名称
	 */
	private String LinkerName;
	/**
	 * 联系人地址
	 * 招标文件编号
	 */
	private String PostAddress;
	/**
	 * 组织机构代码/社会信用代码有效止期
	 * 企业经营起始日期
	 * 1572必传
	 * 2021必传投保人必传
	 */
	private String EnterManageTime;
	/**
	 * 企业编码
	 * 企业性质
	 * 见代码定义; 2021必传投保人必传
	 */
	private String CreditLevel;
	/**
	 * 行业类型
	 * 1572必传
	 */
	private String BusinessSource;
	
	/**
	 * 企业资质(见代码定义)（必填）
	 * 见代码定义; 2021必传投保人必传
	 */
	private String BenefitFlag;
	/**
	 * 注册资本（必填）
	 * 2021必传投保人必传
	 */
	private double RegisterCaptial;
	/**
	 * 上年销售额（必填）
	 * 2021必传投保人必传
	 */
	private double LastYearSalesVolume;
	/**
	 * 投保前财务状况是否良好(1:是，0：：否)（必填）
	 * 1:是，0：否 (2021必传投保人必传)
	 */
	private String HealthFlag;
	public String getProposalNo() {
		return ProposalNo;
	}
	public void setProposalNo(String proposalNo) {
		ProposalNo = proposalNo;
	}
	public String getLanguage() {
		return Language;
	}
	public void setLanguage(String language) {
		Language = language;
	}
	public int getSerialNo() {
		return SerialNo;
	}
	public void setSerialNo(int serialNo) {
		SerialNo = serialNo;
	}
	public String getInsuredType() {
		return InsuredType;
	}
	public void setInsuredType(String insuredType) {
		InsuredType = insuredType;
	}
	public String getInsuredName() {
		return InsuredName;
	}
	public void setInsuredName(String insuredName) {
		InsuredName = insuredName;
	}
	public String getInsuredNature() {
		return InsuredNature;
	}
	public void setInsuredNature(String insuredNature) {
		InsuredNature = insuredNature;
	}
	public String getInsuredFlag() {
		return InsuredFlag;
	}
	public void setInsuredFlag(String insuredFlag) {
		InsuredFlag = insuredFlag;
	}
	public String getInsuredIdentity() {
		return InsuredIdentity;
	}
	public void setInsuredIdentity(String insuredIdentity) {
		InsuredIdentity = insuredIdentity;
	}
	public String getIdentifyType() {
		return IdentifyType;
	}
	public void setIdentifyType(String identifyType) {
		IdentifyType = identifyType;
	}
	public String getSex() {
		return Sex;
	}
	public void setSex(String sex) {
		Sex = sex;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getBirthdate() {
		return Birthdate;
	}
	public void setBirthdate(String birthdate) {
		Birthdate = birthdate;
	}
	public String getMobile() {
		return Mobile;
	}
	public void setMobile(String mobile) {
		Mobile = mobile;
	}
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getInsuredAddress() {
		return InsuredAddress;
	}
	public void setInsuredAddress(String insuredAddress) {
		InsuredAddress = insuredAddress;
	}
	public String getPostCode() {
		return PostCode;
	}
	public void setPostCode(String postCode) {
		PostCode = postCode;
	}
	public String getAmlLevel() {
		return AmlLevel;
	}
	public void setAmlLevel(String amlLevel) {
		AmlLevel = amlLevel;
	}
	public String getClientNum() {
		return ClientNum;
	}
	public void setClientNum(String clientNum) {
		ClientNum = clientNum;
	}
	public String getClientLevel() {
		return ClientLevel;
	}
	public void setClientLevel(String clientLevel) {
		ClientLevel = clientLevel;
	}
	public String getUnderMeasures() {
		return UnderMeasures;
	}
	public void setUnderMeasures(String underMeasures) {
		UnderMeasures = underMeasures;
	}
	public String getClaiMmeasures() {
		return ClaiMmeasures;
	}
	public void setClaiMmeasures(String claiMmeasures) {
		ClaiMmeasures = claiMmeasures;
	}
	public String getTaxpayerType() {
		return TaxpayerType;
	}
	public void setTaxpayerType(String taxpayerType) {
		TaxpayerType = taxpayerType;
	}
	public String getInvoiceType() {
		return InvoiceType;
	}
	public void setInvoiceType(String invoiceType) {
		InvoiceType = invoiceType;
	}
	public String getTaxNumber() {
		return TaxNumber;
	}
	public void setTaxNumber(String taxNumber) {
		TaxNumber = taxNumber;
	}
	public String getTaxRegistAddress() {
		return TaxRegistAddress;
	}
	public void setTaxRegistAddress(String taxRegistAddress) {
		TaxRegistAddress = taxRegistAddress;
	}
	public String getBank() {
		return Bank;
	}
	public void setBank(String bank) {
		Bank = bank;
	}
	public String getAccount() {
		return Account;
	}
	public void setAccount(String account) {
		Account = account;
	}
	public String getLinkerName() {
		return LinkerName;
	}
	public void setLinkerName(String linkerName) {
		LinkerName = linkerName;
	}
	public String getPostAddress() {
		return PostAddress;
	}
	public void setPostAddress(String postAddress) {
		PostAddress = postAddress;
	}
	public String getEnterManageTime() {
		return EnterManageTime;
	}
	public void setEnterManageTime(String enterManageTime) {
		EnterManageTime = enterManageTime;
	}
	public String getCreditLevel() {
		return CreditLevel;
	}
	public void setCreditLevel(String creditLevel) {
		CreditLevel = creditLevel;
	}
	public String getBusinessSource() {
		return BusinessSource;
	}
	public void setBusinessSource(String businessSource) {
		BusinessSource = businessSource;
	}
	public String getBenefitFlag() {
		return BenefitFlag;
	}
	public void setBenefitFlag(String benefitFlag) {
		BenefitFlag = benefitFlag;
	}
	public double getRegisterCaptial() {
		return RegisterCaptial;
	}
	public void setRegisterCaptial(double registerCaptial) {
		RegisterCaptial = registerCaptial;
	}
	public double getLastYearSalesVolume() {
		return LastYearSalesVolume;
	}
	public void setLastYearSalesVolume(double lastYearSalesVolume) {
		LastYearSalesVolume = lastYearSalesVolume;
	}
	public String getHealthFlag() {
		return HealthFlag;
	}
	public void setHealthFlag(String healthFlag) {
		HealthFlag = healthFlag;
	}
}
