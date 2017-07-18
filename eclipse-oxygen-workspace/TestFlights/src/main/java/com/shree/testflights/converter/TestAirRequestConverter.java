package com.shree.testflights.converter;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.shree.testflights.entity.TestAirRequest;
import com.shree.testflights.entity.TestFlightRequest;

@Component
public class TestAirRequestConverter {

	public TestAirRequest getTestAirRequestConverter(final TestFlightRequest testFlightRequest) {
		
		TestAirRequest airRequest = new TestAirRequest();
		airRequest.setOrigin(testFlightRequest.getOrigin());
		airRequest.setDestination(testFlightRequest.getDestination());
		airRequest.setDepartureDate(testFlightRequest.getDepartureDate());
		airRequest.setReturnDate(testFlightRequest.getReturnDate());
		airRequest.setPassengerCount(testFlightRequest.getNumberOfPassengers());
		
		return airRequest;
		
	}
}
