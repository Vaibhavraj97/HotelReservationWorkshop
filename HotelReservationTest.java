package com.bridgelabz.HotelReservationSystem;




import org.junit.Assert;
import org.junit.Test;

public class HotelReservationTest {
	 @Test
	    public void givenHotelList_WhenAdded_shouldReturnProperHotelName(){
	        HotelReservationII hotelReservation = new HotelReservation();
	        hotelReservation.addHotel("Bridgewood", 4, 160);
	        String hotelName = hotelReservation.getHotelList().get(0).getHotelName();
	        Assert.assertEquals("Bridgewood", hotelName);
	    }
	
	    @Test
	    public void givenHotelDetails_WhenSizeMatches_ShoulReturnTrue()
	    {
	    	HotelReservationII hotelReservation = new HotelReservation();
	        hotelReservation.addHotel("Lakewood", 3, 110);
	        hotelReservation.addHotel("Bridgewood", 4, 160);
	        hotelReservation.addHotel("Ridgewood", 5, 220);
	        int hotelListSize = hotelReservation.getHotelListSize();
	        System.out.println(hotelListSize);
	        Assert.assertEquals(3, hotelListSize);
	    }

	  
	}
	   