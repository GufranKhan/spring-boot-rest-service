package com.shree.testflights.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shree.testflights.converter.TestAirRequestConverter;
import com.shree.testflights.converter.TestJetRequestConverter;
import com.shree.testflights.entity.TestAirRequest;
import com.shree.testflights.entity.TestAirResponse;
import com.shree.testflights.entity.TestFlightRequest;
import com.shree.testflights.entity.TestFlightResponse;
import com.shree.testflights.entity.TestJetRequest;
import com.shree.testflights.entity.TestJetResponse;
import com.shree.testflights.stubdata.TestAirStubData;
import com.shree.testflights.stubdata.TestJetStubData;

@Service
public class TestFlightsService {
	
	
	@Autowired 
	private TestAirRequestConverter airRequestCoverter;
	
	@Autowired 
	private TestJetRequestConverter jetRequestConverter;
	
	
	public List<TestFlightResponse> getTestFlightResponse(final TestFlightRequest testFlightRequest) {
		
        TestAirRequest testAirRequest = airRequestCoverter.getTestAirRequestConverter(testFlightRequest);
		
		TestJetRequest jetRequest = jetRequestConverter.getTestJetRequestConverter(testFlightRequest);

		
		List<TestAirResponse> airResponse = TestAirStubData.getTestAirStub(testAirRequest);
		
		
		List<TestJetResponse> jetResponse = TestJetStubData.getTestJetStub(jetRequest);
		
		return getAggregatedTestFlight(airResponse, jetResponse);		
	}
	
	
	private List<TestFlightResponse> getAggregatedTestFlight(List<TestAirResponse> airResponses, List<TestJetResponse> jetResponses){
		List<TestFlightResponse> flightResponses = new ArrayList<>();
		
		for(TestAirResponse airLine: airResponses) {
			TestFlightResponse flightResponse = new TestFlightResponse();
			flightResponse.setAirLine(airLine.getAirline());
			flightResponse.setFare(airLine.getPrice());
			flightResponses.add(flightResponse);
		}
		
		for(TestJetResponse jetAirLine: jetResponses) {
			TestFlightResponse flightResponse = new TestFlightResponse();
			flightResponse.setAirLine(jetAirLine.getCarrier());
			flightResponse.setFare(jetAirLine.getBasePrice().add(jetAirLine.getTax()).subtract(jetAirLine.getDiscount()));
			flightResponses.add(flightResponse);
		}
		
		
		
		 flightResponses.sort((o1,o2)->o1.getFare().compareTo(o2.getFare()));
		 return flightResponses;
	}
}
