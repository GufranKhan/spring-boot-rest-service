package com.shree.testflights.entity;

import java.math.BigDecimal;
import java.util.Date;

public class TestJetResponse {
	private String carrier;
	private BigDecimal basePrice;
	private BigDecimal tax;
	private BigDecimal discount;
	private String departureAirportName;
	private String arrivalAirportName;
	private Date outboundDateTime;
	private Date inboundDateTime;
	/**
	 * @return the carrier
	 */
	public String getCarrier() {
		return carrier;
	}
	/**
	 * @param carrier the carrier to set
	 */
	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}
	/**
	 * @return the basePrice
	 */
	public BigDecimal getBasePrice() {
		return basePrice;
	}
	/**
	 * @param basePrice the basePrice to set
	 */
	public void setBasePrice(BigDecimal basePrice) {
		this.basePrice = basePrice;
	}
	/**
	 * @return the tax
	 */
	public BigDecimal getTax() {
		return tax;
	}
	/**
	 * @param tax the tax to set
	 */
	public void setTax(BigDecimal tax) {
		this.tax = tax;
	}
	/**
	 * @return the discount
	 */
	public BigDecimal getDiscount() {
		return discount;
	}
	/**
	 * @param discount the discount to set
	 */
	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}
	/**
	 * @return the departureAirportName
	 */
	public String getDepartureAirportName() {
		return departureAirportName;
	}
	/**
	 * @param departureAirportName the departureAirportName to set
	 */
	public void setDepartureAirportName(String departureAirportName) {
		this.departureAirportName = departureAirportName;
	}
	/**
	 * @return the arrivalAirportName
	 */
	public String getArrivalAirportName() {
		return arrivalAirportName;
	}
	/**
	 * @param arrivalAirportName the arrivalAirportName to set
	 */
	public void setArrivalAirportName(String arrivalAirportName) {
		this.arrivalAirportName = arrivalAirportName;
	}
	/**
	 * @return the outboundDateTime
	 */
	public Date getOutboundDateTime() {
		return outboundDateTime;
	}
	/**
	 * @param outboundDateTime the outboundDateTime to set
	 */
	public void setOutboundDateTime(Date outboundDateTime) {
		this.outboundDateTime = outboundDateTime;
	}
	/**
	 * @return the inboundDateTime
	 */
	public Date getInboundDateTime() {
		return inboundDateTime;
	}
	/**
	 * @param inboundDateTime the inboundDateTime to set
	 */
	public void setInboundDateTime(Date inboundDateTime) {
		this.inboundDateTime = inboundDateTime;
	}

}
