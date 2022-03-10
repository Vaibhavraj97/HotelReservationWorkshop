package com.bridgelabz.HotelReservationSystem;


	import java.util.ArrayList;

	
	public interface HotelReservationII {
		 void addHotel(String hotelName, double weekDayRate, double weekendRate);
		    int getHotelListSize();
		    void printHotelList();
		    ArrayList<Hotel> getHotelList();
	   
	}
