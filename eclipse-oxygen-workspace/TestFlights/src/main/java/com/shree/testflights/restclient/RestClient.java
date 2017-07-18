package com.shree.testflights.restclient;

import java.util.Arrays;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class RestClient {

	public static void main(String[] args) {

		final String uri ="http://localhost:9090/getflights?origin=&destination=del&departureDate=2017-08-12&returnDate=2017-09-12&numberOfPassengers=4";
		
		RestTemplate restTemplate = new RestTemplate();
		
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<>("parameters",httpHeaders);
		
		ResponseEntity<String> result = restTemplate.exchange(uri, HttpMethod.GET,entity,String.class);
		
		System.out.println(result);
	}

	}


