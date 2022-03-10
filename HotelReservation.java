package com.bridgelabz.HotelReservationSystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;
import java.util.Scanner;


	    public class HotelReservation implements HotelReservationII {
	        String hotelName;
	        int rate;
	        double regularCustomerRate;
	        Scanner sc = new Scanner(System.in);
	        ArrayList<Hotel> hotelList = new ArrayList<Hotel>();
	        Hotel hotel;
	        public void addHotel() {
	            System.out.println("How many hotels you want to add");
	            int numOfHotels = sc.nextInt();
	            while(numOfHotels > 0) {
	                System.out.println("Enter hotel name:");
	                hotelName = sc.next();
	                System.out.println("Enter hotel rate:");
	                rate = sc.nextInt();
	                System.out.println("Enter regular customer rate:");
	                regularCustomerRate = sc.nextDouble();
	                hotel = new Hotel(hotelName, rate,regularCustomerRate);
	                hotelList.add(hotel);
	                numOfHotels--;
	            }
	        }
	        public int getHotelListSize() {
	            return hotelList.size();
	        }

	        public void printHotelList() {
	            System.out.println(hotelList);
	        }
	        public ArrayList<Hotel> getHotelList(){
	            return hotelList;
	        }

	        public Hotel getCheapestHotel(LocalDate startDate, LocalDate endDate) {

	            Optional<Hotel> resultList = hotelList.stream().min(Comparator.comparing(Hotel::getRegularCustomerCost));
	            return resultList.get();
	        }

	    }

	    
	
