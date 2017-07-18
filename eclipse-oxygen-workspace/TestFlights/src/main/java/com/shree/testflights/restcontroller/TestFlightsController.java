package com.shree.testflights.restcontroller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.shree.testflights.customexception.CustomException;
import com.shree.testflights.entity.TestFlightRequest;
import com.shree.testflights.entity.TestFlightResponse;
import com.shree.testflights.service.TestFlightsService;

@RestController
public class TestFlightsController {
	
	@Autowired 
	private TestFlightsService flightsService;
	
	
	@RequestMapping(value="/getflights",produces= {"application/json"})
	public ResponseEntity<List<TestFlightResponse>> getFlights(@RequestParam("origin") String origin,
													@RequestParam("destination") String destination,
													@RequestParam("departureDate") String departureDate,
													@RequestParam("returnDate") String returnDate,
													@RequestParam("numberOfPassengers") String numberOfPassengers) throws CustomException {
		
		validateRequest(origin,destination,departureDate, returnDate, numberOfPassengers);
		
		
		TestFlightRequest testFlightRequest = new TestFlightRequest();
		testFlightRequest.setOrigin(origin);
		testFlightRequest.setDestination(destination);
		testFlightRequest.setDepartureDate(new Date());
		testFlightRequest.setReturnDate(new Date());
		testFlightRequest.setNumberOfPassengers(Integer.parseInt(numberOfPassengers));
		
		
		
		List<TestFlightResponse> flightResponse = flightsService.getTestFlightResponse(testFlightRequest);
		
		
		return new ResponseEntity<List<TestFlightResponse>>(flightResponse, HttpStatus.OK);
	}
	
	/**
	 * validate the request
	 * @param origin
	 * @param destination
	 * @param departureDate
	 * @param returnDate
	 * @param numberOfPassengers
	 * @throws CustomException
	 */
    private void validateRequest(String origin, String destination, String departureDate, String returnDate, String numberOfPassengers) throws CustomException{
		
		if (StringUtils.isEmpty(origin)) {
			throw new CustomException("origin is required");
		}
		if (StringUtils.isEmpty(destination)) {
			throw new CustomException("destination is required");
		}
		if (numberOfPassengers.length()<=0) {
			throw new CustomException("Number of passenger must be > then 0");
		}
		if (StringUtils.isEmpty(departureDate)) {
			throw new CustomException("departureDate is required");
		}
		if (StringUtils.isEmpty(returnDate)) {
			throw new CustomException("returnDate is required");
		}
		
		
	}
	

}
