package com.stylefeng.guns.rest.changan.request;

import java.util.List;

/**
 * 请求体
 * @author Administrator
 *
 */
public class BodyVO {
	
	/**
	 *  投保基本信息
	 */
	private PrpTmainDto PrpTmainDto;
	/**
	 *  投保人信息
	 */
	private List<PrpTapplicantDto> PrpTapplicantDtoList;
	/**
	 * 被保险人信息
	 */
	private List<PrpTinsuredDto> PrpTinsuredDtoList;
	/**
	 * 险别信息
	 * 详见险别信息说明
	 */
	private List<PrpTitemKindDto> PrpTitemKindDtoList;
	/**
	 * 特别约定
	 * 根据具体业务要求
	 */
	private List<PrpTengageDto> PrpTengageDtoList;
	
	/**
	 *投保人企业信息
	 *此对象康存科技对接2007险种专用
     */
	private PrpTloanEnterpriseDto PrpTloanEnterpriseDto;
	/**
	 * 移动设备信息
	 * 此对象碎屏险0305险种对接第三方专用
	 */
	private List<PrpTEIitemDeviceDto> PrpTEIitemDeviceDtoList;
	/**
	 * 责任险承保信息
	 */
	private PrpTMainPropDto PrpTMainPropDto;
	/**
	 * 营业处所地址信息
	 */
	private PrpTaddressDto PrpTaddressDto;
	/**
	 * 限额免赔信息
	 * 根据具体业务要求，1557险种时必传
	 */
	private List<PrpTlimitDto> PrpTlimitDtoList;
	/**
	 * 保额保费信息
	 */
	private PrpTfeeDto PrpTfeeDto;
	
	/**
	 * 缴费计划信息
	 */
	private PrpTplanDto PrpTplanDto;
	/**
	 * 标的信息
	 */
	private List<PrpTSubjectDto> PrpTSubjectDtoList;
	/**
	 * 企业信息
	 * 此对象1560险种对接第三方专用
	 */
	private PrpTmainLiabDto PrpTmainLiabDto;
	/**
	 * 车辆信息
	 * 此对象1560、1557险种对接第三方专用
	 */
	private PrpTitemDeviceDto PrpTitemDeviceDto;
	/**
	 * 调整系数信息
	 * 此对象1560险种对接第三方专用
	 */
	private PrpTadjustmentDto PrpTadjustmentDto;
	/**
	 * 共保业务相关信息
	 */
	private List<PrpTcoinsDto> PrpTcoinsDtoList;
	public PrpTmainDto getPrpTmainDto() {
		return PrpTmainDto;
	}
	public void setPrpTmainDto(PrpTmainDto prpTmainDto) {
		PrpTmainDto = prpTmainDto;
	}
	public List<PrpTapplicantDto> getPrpTapplicantDtoList() {
		return PrpTapplicantDtoList;
	}
	public void setPrpTapplicantDtoList(List<PrpTapplicantDto> prpTapplicantDtoList) {
		PrpTapplicantDtoList = prpTapplicantDtoList;
	}
	public List<PrpTinsuredDto> getPrpTinsuredDtoList() {
		return PrpTinsuredDtoList;
	}
	public void setPrpTinsuredDtoList(List<PrpTinsuredDto> prpTinsuredDtoList) {
		PrpTinsuredDtoList = prpTinsuredDtoList;
	}
	public List<PrpTitemKindDto> getPrpTitemKindDtoList() {
		return PrpTitemKindDtoList;
	}
	public void setPrpTitemKindDtoList(List<PrpTitemKindDto> prpTitemKindDtoList) {
		PrpTitemKindDtoList = prpTitemKindDtoList;
	}
	public List<PrpTengageDto> getPrpTengageDtoList() {
		return PrpTengageDtoList;
	}
	public void setPrpTengageDtoList(List<PrpTengageDto> prpTengageDtoList) {
		PrpTengageDtoList = prpTengageDtoList;
	}
	public PrpTloanEnterpriseDto getPrpTloanEnterpriseDto() {
		return PrpTloanEnterpriseDto;
	}
	public void setPrpTloanEnterpriseDto(PrpTloanEnterpriseDto prpTloanEnterpriseDto) {
		PrpTloanEnterpriseDto = prpTloanEnterpriseDto;
	}
	public List<PrpTEIitemDeviceDto> getPrpTEIitemDeviceDtoList() {
		return PrpTEIitemDeviceDtoList;
	}
	public void setPrpTEIitemDeviceDtoList(List<PrpTEIitemDeviceDto> prpTEIitemDeviceDtoList) {
		PrpTEIitemDeviceDtoList = prpTEIitemDeviceDtoList;
	}
	public PrpTMainPropDto getPrpTMainPropDto() {
		return PrpTMainPropDto;
	}
	public void setPrpTMainPropDto(PrpTMainPropDto prpTMainPropDto) {
		PrpTMainPropDto = prpTMainPropDto;
	}
	public PrpTaddressDto getPrpTaddressDto() {
		return PrpTaddressDto;
	}
	public void setPrpTaddressDto(PrpTaddressDto prpTaddressDto) {
		PrpTaddressDto = prpTaddressDto;
	}
	public List<PrpTlimitDto> getPrpTlimitDtoList() {
		return PrpTlimitDtoList;
	}
	public void setPrpTlimitDtoList(List<PrpTlimitDto> prpTlimitDtoList) {
		PrpTlimitDtoList = prpTlimitDtoList;
	}
	public PrpTfeeDto getPrpTfeeDto() {
		return PrpTfeeDto;
	}
	public void setPrpTfeeDto(PrpTfeeDto prpTfeeDto) {
		PrpTfeeDto = prpTfeeDto;
	}
	public PrpTplanDto getPrpTplanDto() {
		return PrpTplanDto;
	}
	public void setPrpTplanDto(PrpTplanDto prpTplanDto) {
		PrpTplanDto = prpTplanDto;
	}
	public List<PrpTSubjectDto> getPrpTSubjectDtoList() {
		return PrpTSubjectDtoList;
	}
	public void setPrpTSubjectDtoList(List<PrpTSubjectDto> prpTSubjectDtoList) {
		PrpTSubjectDtoList = prpTSubjectDtoList;
	}
	public PrpTmainLiabDto getPrpTmainLiabDto() {
		return PrpTmainLiabDto;
	}
	public void setPrpTmainLiabDto(PrpTmainLiabDto prpTmainLiabDto) {
		PrpTmainLiabDto = prpTmainLiabDto;
	}
	public PrpTitemDeviceDto getPrpTitemDeviceDto() {
		return PrpTitemDeviceDto;
	}
	public void setPrpTitemDeviceDto(PrpTitemDeviceDto prpTitemDeviceDto) {
		PrpTitemDeviceDto = prpTitemDeviceDto;
	}
	public PrpTadjustmentDto getPrpTadjustmentDto() {
		return PrpTadjustmentDto;
	}
	public void setPrpTadjustmentDto(PrpTadjustmentDto prpTadjustmentDto) {
		PrpTadjustmentDto = prpTadjustmentDto;
	}
	public List<PrpTcoinsDto> getPrpTcoinsDtoList() {
		return PrpTcoinsDtoList;
	}
	public void setPrpTcoinsDtoList(List<PrpTcoinsDto> prpTcoinsDtoList) {
		PrpTcoinsDtoList = prpTcoinsDtoList;
	}
	
}
