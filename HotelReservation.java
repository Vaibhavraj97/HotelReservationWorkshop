package com.bridgelabz.HotelReservationSystem;


import java.util.ArrayList;

public class HotelReservation implements HotelReservationII {

    ArrayList<Hotel> hotelList = new ArrayList<>();
    Hotel hotel ;

    public void addHotel(String hotelName, int rate, double weekdayRate, double weekndRate) {
        hotel = new Hotel();
        hotel.setHotelName(hotelName);
        hotel.setWeekDayRate(weekdayRate);
        hotel.setWeekendRate(weekndRate);
        hotelList.add(hotel);
    }

    @Override
    public void addHotel(String hotelName, double weekDayRate, double weekendRate) {

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

}