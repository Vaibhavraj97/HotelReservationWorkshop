package com.bridgelabz.HotelReservationSystem;

import java.time.LocalDate;
import java.time.Month;

public class HotelReservationMain {
    public static void main(String[] args) {

        System.out.println(" Welcome To Hotel Reservation");
        HotelReservationII hotelReservation = new HotelReservation();
        hotelReservation.addHotel("Lakewood", 3, 110,90,80,80);
        hotelReservation.addHotel("Bridgewood", 4, 150,50,110,50);
        hotelReservation.addHotel("Ridgewood", 5, 220,150,100,40);
        hotelReservation.printHotelList();
        LocalDate startDate = LocalDate.of(2020, Month.SEPTEMBER, 10);
        LocalDate endDate = LocalDate.of(2020, Month.SEPTEMBER, 11);
        hotelReservation.getCheapestHotel(startDate, endDate);
        hotelReservation.getBestRatedHotel(startDate, endDate);
    }
}