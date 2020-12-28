package com.xworkz.xworkzapp.util;

import com.xworkz.xworkzapp.flight.FlightInfoDTO;
import com.xworkz.xworkzapp.flight.FlightBookingOperation;
public class FlightBookingInfoUtil {
public static void main(String[] args) {
	FlightBookingOperation fbu=new FlightBookingOperation();
	
	FlightInfoDTO fdto=new FlightInfoDTO();
	
	fdto.setAirplane_Code("123abcd");
	fdto.setCompany("indigo");
	fdto.setStarting_Point("banglore");
	fdto.setDestination("mumbai");
	fdto.setTotalSeats(80);
	fdto.setDomestic(true);
	fdto.setBusiness_Class_Price(190930.90);
	fdto.setEconomy_Class_Price(123444.09);
	
	FlightInfoDTO fdto1=new FlightInfoDTO();
	fdto1.setAirplane_Code("xysamre90");
	fdto1.setCompany("Spicejet");
	fdto1.setStarting_Point("maldives");
	fdto1.setDestination("delhi");
	fdto1.setTotalSeats(70);
	fdto1.setDomestic(true);
	fdto1.setBusiness_Class_Price(999.90);
	fdto1.setEconomy_Class_Price(100.09); 
	
	fbu.addflightBooking(fdto);
	fbu.addflightBooking(fdto1);
	
	
	
	fbu.searchByStartingPoint("mumbai");
	fbu.showFlightBookingInfo();
	

	
	

}


}
