package com.shree.testflights.entity;

import java.util.Date;

public class TestJetRequest {
	private String from;
	private String to;
	private Date outboundDate;
	private Date inboundDate;
	private int numberOfAdults;
	/**
	 * @return the from
	 */
	public String getFrom() {
		return from;
	}
	/**
	 * @param from the from to set
	 */
	public void setFrom(String from) {
		this.from = from;
	}
	/**
	 * @return the to
	 */
	public String getTo() {
		return to;
	}
	/**
	 * @param to the to to set
	 */
	public void setTo(String to) {
		this.to = to;
	}
	/**
	 * @return the outboundDate
	 */
	public Date getOutboundDate() {
		return outboundDate;
	}
	/**
	 * @param outboundDate the outboundDate to set
	 */
	public void setOutboundDate(Date outboundDate) {
		this.outboundDate = outboundDate;
	}
	/**
	 * @return the inboundDate
	 */
	public Date getInboundDate() {
		return inboundDate;
	}
	/**
	 * @param inboundDate the inboundDate to set
	 */
	public void setInboundDate(Date inboundDate) {
		this.inboundDate = inboundDate;
	}
	/**
	 * @return the numberOfAdults
	 */
	public int getNumberOfAdults() {
		return numberOfAdults;
	}
	/**
	 * @param numberOfAdults the numberOfAdults to set
	 */
	public void setNumberOfAdults(int numberOfAdults) {
		this.numberOfAdults = numberOfAdults;
	}
}
