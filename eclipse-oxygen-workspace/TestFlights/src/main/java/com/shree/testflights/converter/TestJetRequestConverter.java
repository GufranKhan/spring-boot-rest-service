package com.shree.testflights.converter;

import org.springframework.stereotype.Component;

import com.shree.testflights.entity.TestAirRequest;
import com.shree.testflights.entity.TestFlightRequest;
import com.shree.testflights.entity.TestJetRequest;

@Component
public class TestJetRequestConverter {

public TestJetRequest getTestJetRequestConverter(final TestFlightRequest testFlightRequest) {
		
	TestJetRequest jetRequest = new TestJetRequest();
	    jetRequest.setFrom(testFlightRequest.getOrigin());
		jetRequest.setTo(testFlightRequest.getDestination());
		jetRequest.setOutboundDate(testFlightRequest.getDepartureDate());
		jetRequest.setInboundDate(testFlightRequest.getReturnDate());
		jetRequest.setNumberOfAdults(testFlightRequest.getNumberOfPassengers());
		
		return jetRequest;
		
	}
	
}
