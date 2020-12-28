package com.xworkz.xworkzapp.flight;

public class FlightInfoDTO {
	private String airplane_Code;
	private String company;
	private String starting_Point;
	private String destination;
	private int totalSeats;
	private boolean domestic;
	private double business_Class_Price;
	
	private double economy_Class_Price;
	public String getAirplane_Code() {
		return airplane_Code;
	}
	public void setAirplane_Code(String airplane_Code) {
		this.airplane_Code = airplane_Code;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getStarting_Point() {
		return starting_Point;
	}
	public void setStarting_Point(String starting_Point) {
		this.starting_Point = starting_Point;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getTotalSeats() {
		return totalSeats;
	}
	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}
	public boolean isDomestic() {
		return domestic;
	}
	public void setDomestic(boolean domestic) {
		this.domestic = domestic;
	}
	public double getBusiness_Class_Price() {
		return business_Class_Price;
	}
	public void setBusiness_Class_Price(double business_Class_Price) {
		this.business_Class_Price = business_Class_Price;
	}
	public double getEconomy_Class_Price() {
		return economy_Class_Price;
	}
	public void setEconomy_Class_Price(double economy_Class_Price) {
		this.economy_Class_Price = economy_Class_Price;
	}

}
