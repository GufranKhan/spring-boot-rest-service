package com.shree.testflights.entity;

import java.util.Date;

public class TestAirRequest {
	private String origin;
	private String destination;
	private Date departureDate;
	private Date returnDate;
	private int passengerCount;
	/**
	 * @return the origin
	 */
	public String getOrigin() {
		return origin;
	}
	/**
	 * @param origin the origin to set
	 */
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	/**
	 * @return the destination
	 */
	public String getDestination() {
		return destination;
	}
	/**
	 * @param destination the destination to set
	 */
	public void setDestination(String destination) {
		this.destination = destination;
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
	 * @return the returnDate
	 */
	public Date getReturnDate() {
		return returnDate;
	}
	/**
	 * @param returnDate the returnDate to set
	 */
	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}
	/**
	 * @return the passengerCount
	 */
	public int getPassengerCount() {
		return passengerCount;
	}
	/**
	 * @param passengerCount the passengerCount to set
	 */
	public void setPassengerCount(int passengerCount) {
		this.passengerCount = passengerCount;
	}
}
