package com.shree.testflights.entity;

import java.math.BigDecimal;
import java.util.Date;

public class TestFlightResponse {
	private String airLine;
	private String supplier;
	private String departureAirportCode;
	private String destinationAirportCode;
	private Date departureDate;
	private Date arrivalDate;
	private BigDecimal fare;
	
	
	public void setFare(BigDecimal fare) {
		this.fare = fare;
	}
	public BigDecimal getFare() {
		return fare;
	}
	/**
	 * @return the airLine
	 */
	public String getAirLine() {
		return airLine;
	}
	/**
	 * @param airLine the airLine to set
	 */
	public void setAirLine(String airLine) {
		this.airLine = airLine;
	}
	/**
	 * @return the supplier
	 */
	public String getSupplier() {
		return supplier;
	}
	/**
	 * @param supplier the supplier to set
	 */
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}
	/**
	 * @return the departureAirportCode
	 */
	public String getDepartureAirportCode() {
		return departureAirportCode;
	}
	/**
	 * @param departureAirportCode the departureAirportCode to set
	 */
	public void setDepartureAirportCode(String departureAirportCode) {
		this.departureAirportCode = departureAirportCode;
	}
	/**
	 * @return the destinationAirportCode
	 */
	public String getDestinationAirportCode() {
		return destinationAirportCode;
	}
	/**
	 * @param destinationAirportCode the destinationAirportCode to set
	 */
	public void setDestinationAirportCode(String destinationAirportCode) {
		this.destinationAirportCode = destinationAirportCode;
	}
	/**
	 * @return the departureDate
	 */
	public Date getDepartureDate() {
		return departureDate;
	}
	/**
	 * @param departureDate the departureDate to set
	 */
	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}
	/**
	 * @return the arrivalDate
	 */
	public Date getArrivalDate() {
		return arrivalDate;
	}
	/**
	 * @param arrivalDate the arrivalDate to set
	 */
	public void setArrivalDate(Date arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
	
}
