package com.bridgelabz.HotelReservationSystem;


	import java.util.ArrayList;
	import java.time.LocalDate;
	import java.util.ArrayList;

	public interface HotelReservationII {

	     void addHotel(String hotelName,int rating, double weekDayRate,double weekendRate);
	     int getHotelListSize();
	     void printHotelList();
	     ArrayList<Hotel> getHotelList();
	     String getCheapestHotel(LocalDate startDate, LocalDate endDate);
	}
	
