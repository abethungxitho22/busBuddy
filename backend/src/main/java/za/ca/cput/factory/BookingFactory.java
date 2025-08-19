package za.ca.cput.factory;

import za.ca.cput.domain.Booking;

import java.time.LocalDateTime;

public class BookingFactory {

    public static Booking createBooking(LocalDateTime bookingTime) {
     if(bookingTime == null){
         return null;
     }
        return new Booking.Builder()
                .setBookingTime(bookingTime)
                .build();
    }


}
