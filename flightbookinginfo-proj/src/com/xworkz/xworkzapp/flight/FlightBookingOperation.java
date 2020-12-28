package com.xworkz.xworkzapp.flight;

public class FlightBookingOperation {
	public FlightInfoDTO[] flightbook = new FlightInfoDTO[2];
	public int index;

	public FlightBookingOperation(int size) {
		flightbook = new FlightInfoDTO[size];
	}
public FlightBookingOperation() {
		super();
		// TODO Auto-generated constructor stub
	}
public void addflightBooking(FlightInfoDTO flightbook) {
		if (flightbook.getAirplane_Code() != null || flightbook.getCompany() != null	
				|| flightbook.getBusiness_Class_Price() != 0.00 || flightbook.getStarting_Point() != null
				|| flightbook.getBusiness_Class_Price() >= 1000) {
			System.out.println("Adding flight detail");
			this.flightbook[index++] = flightbook;
			System.out.println(flightbook.getAirplane_Code() + " " + flightbook.getCompany() + " "
					+ flightbook.getStarting_Point() + " " + flightbook.getDestination() + " "
					+ flightbook.getTotalSeats() + " " + flightbook.isDomestic() + " "
					+ flightbook.getBusiness_Class_Price() + " " + flightbook.getEconomy_Class_Price());

			System.out.println("Added all flight detail");
		}
	}
public void searchByStartingPoint(String starting_Point) {
		boolean point = false;
		for (int i = 0; i < flightbook.length; i++) {
			if (flightbook != null) {
				if (flightbook[i].getStarting_Point().equals(starting_Point)) {
					point= true;
					System.out.println(flightbook[i].getAirplane_Code() + " " + flightbook[i].getCompany() + " "
							+ flightbook[i].getStarting_Point() + " " + flightbook[i].getDestination() + " "
							+ flightbook[i].getTotalSeats() + " " + flightbook[i].isDomestic() + " "
							+ flightbook[i].getBusiness_Class_Price() + " " + flightbook[i].getEconomy_Class_Price());
				} else {
					point = false;
				}
			}
	}if (point == false) {
			System.out.println("enter the valid starting point");
		}
  }
public void showFlightBookingInfo() {
    for (FlightInfoDTO flightInfoDTO : flightbook) {
			if (flightInfoDTO != null) {
				System.out.println(flightInfoDTO.getAirplane_Code() + " " + flightInfoDTO.getStarting_Point() + " "
						+ flightInfoDTO.getBusiness_Class_Price() + " " + flightInfoDTO.getCompany() + " "
						+ flightInfoDTO.getDestination() + " " + flightInfoDTO.getEconomy_Class_Price() + " "
						+ flightInfoDTO.getTotalSeats() + " " + flightInfoDTO.isDomestic());
			}
		}
	}
}
