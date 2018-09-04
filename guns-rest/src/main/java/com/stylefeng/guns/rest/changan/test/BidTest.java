package com.stylefeng.guns.rest.changan.test;

import java.util.ArrayList;
import java.util.List;

import com.stylefeng.guns.rest.changan.request.BidInsuranceRequest;
import com.stylefeng.guns.rest.changan.request.BodyVO;
import com.stylefeng.guns.rest.changan.request.ChannelVO;
import com.stylefeng.guns.rest.changan.request.HeadVO;
import com.stylefeng.guns.rest.changan.request.PrpTapplicantDto;
import com.stylefeng.guns.rest.changan.request.PrpTmainDto;
import com.stylefeng.guns.rest.changan.request.XMLUtil;

public class BidTest {

	public static void main(String[] args) {
		BidInsuranceRequest bidInsuranceRequest=new BidInsuranceRequest();
		ChannelVO channelVO=new ChannelVO();
		channelVO.setChannelCode("123");
		channelVO.setChannelAreaCode("123");
		channelVO.setChannelComCode("123");
		channelVO.setChannelProductCode("123");
		channelVO.setChannelTradeCode("123");
		channelVO.setChannelTradeDate("123");
		channelVO.setChannelTradeSerialNo("123");
		HeadVO headVO=new HeadVO();
		headVO.setPolicyNo("123");
		headVO.setProposalNo("123");
		headVO.setRequestType("123");
		headVO.setSourceType("123");
		BodyVO bodyVO=new BodyVO();

		/**
		 *  投保基本信息
		 */
		PrpTmainDto prpTmainDto=new PrpTmainDto();
		prpTmainDto.setProposalNo("123");
		prpTmainDto.setRiskCode("122");
		/**
		 *  投保人信息
		 */
		List<PrpTapplicantDto> prpTapplicantDtoList=new ArrayList<PrpTapplicantDto>();
		PrpTapplicantDto prpTapplicantDto01=new PrpTapplicantDto();
		prpTapplicantDto01.setLanguage("eng");
		prpTapplicantDto01.setProposalNo("123");
		prpTapplicantDtoList.add(prpTapplicantDto01);
		PrpTapplicantDto prpTapplicantDto02=new PrpTapplicantDto();
		prpTapplicantDto02.setLanguage("eng");
		prpTapplicantDto02.setProposalNo("123");
		prpTapplicantDtoList.add(prpTapplicantDto02);
		bodyVO.setPrpTmainDto(prpTmainDto);
		bodyVO.setPrpTapplicantDtoList(prpTapplicantDtoList);
		bidInsuranceRequest.setChannelVO(channelVO);
		bidInsuranceRequest.setHeadVO(headVO);
		bidInsuranceRequest.setBodyVO(bodyVO);
		String xml=XMLUtil.messageToXml(bidInsuranceRequest)				
		        .replaceAll("/PACKET type=\"REQUEST\" version=\"1.0\"", "/PACKET");
		System.out.println(xml);
	}
}
