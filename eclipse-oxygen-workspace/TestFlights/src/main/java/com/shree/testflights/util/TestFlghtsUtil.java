package com.shree.testflights.util;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.shree.testflights.entity.TestFlightRequest;

public class TestFlghtsUtil implements Validator {

	@Override
	public boolean supports(Class<?> arg0) {
		
		return TestFlightRequest.class.equals(arg0);
	}

	@Override
	public void validate(Object arg0, Errors arg1) {
		ValidationUtils.rejectIfEmpty(arg1, "origin", "origin.required");
		
	}

}
