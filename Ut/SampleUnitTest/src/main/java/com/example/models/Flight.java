package com.example.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="flight")
public class Flight {

   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   private int flightId;
	private int flightNo;
	private String flightName;
	private String flightSource;
	private String destination;
	public String flightType;
	public String flightshift;
	private String flightDate;
	private int totalseats;
	private int flightduration;
	private double flightprice;
	
	public Flight() {
		super();
	}

	public Flight(int flightId, int flightNo, String flightName, String flightSource, String destination,
			String flightType, String flightshift, String flightDate, int totalseats, int flightduration,
			double flightprice) {
		super();
		this.flightId = flightId;
		this.flightNo = flightNo;
		this.flightName = flightName;
		this.flightSource = flightSource;
		this.destination = destination;
		this.flightType = flightType;
		this.flightshift = flightshift;
		this.flightDate = flightDate;
		this.totalseats = totalseats;
		this.flightduration = flightduration;
		this.flightprice = flightprice;
	}

	public int getFlightId() {
		return flightId;
	}

	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}

	public int getFlightNo() {
		return flightNo;
	}

	public void setFlightNo(int flightNo) {
		this.flightNo = flightNo;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public String getFlightSource() {
		return flightSource;
	}

	public void setFlightSource(String flightSource) {
		this.flightSource = flightSource;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getFlightType() {
		return flightType;
	}

	public void setFlightType(String flightType) {
		this.flightType = flightType;
	}

	public String getFlightshift() {
		return flightshift;
	}

	public void setFlightshift(String flightshift) {
		this.flightshift = flightshift;
	}

	public String getFlightDate() {
		return flightDate;
	}

	public void setFlightDate(String flightDate) {
		this.flightDate = flightDate;
	}

	public int getTotalseats() {
		return totalseats;
	}

	public void setTotalseats(int totalseats) {
		this.totalseats = totalseats;
	}

	public int getFlightduration() {
		return flightduration;
	}

	public void setFlightduration(int flightduration) {
		this.flightduration = flightduration;
	}

	public double getFlightprice() {
		return flightprice;
	}

	public void setFlightprice(double flightprice) {
		this.flightprice = flightprice;
	}

	@Override
	public String toString() {
		return "Flight [flightId=" + flightId + ", flightNo=" + flightNo + ", flightName=" + flightName
				+ ", flightSource=" + flightSource + ", destination=" + destination + ", flightType=" + flightType
				+ ", flightshift=" + flightshift + ", flightDate=" + flightDate + ", totalseats=" + totalseats
				+ ", flightduration=" + flightduration + ", flightprice=" + flightprice + "]";
	}
	
	
	
}
