package com.shree.testflights.stubdata;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.shree.testflights.entity.TestAirRequest;
import com.shree.testflights.entity.TestAirResponse;

public class TestAirStubData {
	public static List<TestAirResponse> getTestAirStub(TestAirRequest airRequest) {
		
		// Set dummy data. But in real scenario should fetch from DB based on request
		TestAirResponse testAirResponse = new TestAirResponse();
		testAirResponse.setDepartureAirportCode("LHR");
		testAirResponse.setDestinationAirportCode("OTP");
		testAirResponse.setAirline("Air India");
		testAirResponse.setDepartureDate(new Date());
		testAirResponse.setArrivalDate(new Date());
		testAirResponse.setPrice(BigDecimal.TEN);
		testAirResponse.setCabinClass("E");
		
		TestAirResponse testAirResponseOne = new TestAirResponse();
		testAirResponseOne.setDepartureAirportCode("MAN");
		testAirResponseOne.setDestinationAirportCode("DEL");
		testAirResponseOne.setAirline("Go India");
		testAirResponseOne.setDepartureDate(new Date());
		testAirResponseOne.setArrivalDate(new Date());
		testAirResponseOne.setPrice(BigDecimal.ONE);
		testAirResponseOne.setCabinClass("B");
		
		List<TestAirResponse> airResponses = new ArrayList<>();
		
		airResponses.add(testAirResponse);
		airResponses.add(testAirResponseOne);

		
		return airResponses;
	}
}
