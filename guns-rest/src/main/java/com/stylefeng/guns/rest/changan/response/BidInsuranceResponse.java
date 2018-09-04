package com.stylefeng.guns.rest.changan.response;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 长安保险-确认投保响应参数
 * @author Administrator
 *
 */
@XStreamAlias("HEAD")
public class BidInsuranceResponse {

	/**
	 * 长安保险-确认投保响应参数
	 */
	@XStreamAlias("AffirmPropsalResultDto")
	private AffirmPropsalResultDto AffirmPropsalResultDto;

	public AffirmPropsalResultDto getAffirmPropsalResultDto() {
		return AffirmPropsalResultDto;
	}

	public void setAffirmPropsalResultDto(AffirmPropsalResultDto affirmPropsalResultDto) {
		AffirmPropsalResultDto = affirmPropsalResultDto;
	}
	
}
