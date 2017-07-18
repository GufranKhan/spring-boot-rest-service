package com.shree.testflights.stubdata;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.shree.testflights.entity.TestJetRequest;
import com.shree.testflights.entity.TestJetResponse;

public class TestJetStubData {
	public static List<TestJetResponse> getTestJetStub(TestJetRequest jetRequest) {
		
		
		// Set dummy data. But in real scenario should fetch from DB.
		TestJetResponse testJetResponse = new TestJetResponse();
		testJetResponse.setDepartureAirportName("LHR");
		testJetResponse.setArrivalAirportName("OTP");
		testJetResponse.setCarrier("AI");
		testJetResponse.setOutboundDateTime(new Date());
		testJetResponse.setInboundDateTime(new Date());
		testJetResponse.setBasePrice(BigDecimal.TEN);
		testJetResponse.setTax(BigDecimal.ONE);
		testJetResponse.setDiscount(BigDecimal.ZERO);
		
		TestJetResponse testJetResponseOne = new TestJetResponse();
		testJetResponseOne.setDepartureAirportName("LHR");
		testJetResponseOne.setArrivalAirportName("OTP");
		testJetResponseOne.setCarrier("AI");
		testJetResponseOne.setOutboundDateTime(new Date());
		testJetResponseOne.setInboundDateTime(new Date());
		testJetResponseOne.setBasePrice(BigDecimal.TEN);
		testJetResponseOne.setTax(BigDecimal.TEN);
		testJetResponseOne.setDiscount(BigDecimal.ONE);
		
		List<TestJetResponse> jetResponses = new ArrayList<>();
		jetResponses.add(testJetResponse);
		jetResponses.add(testJetResponseOne);
		
		
		return jetResponses;
	}

}
