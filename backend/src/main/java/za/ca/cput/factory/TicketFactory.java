package za.ca.cput.factory;

import za.ca.cput.domain.*;

import java.time.LocalDateTime;

public class TicketFactory {
    public static Ticket createTicket(QRCode qrCode, Booking booking) {
        return new Ticket.Builder()
                .setIssuedDate(LocalDateTime.now())
                .setIsVerified(false)
                .setQrCode(qrCode)
                .setBooking(booking)
                .build();
    }
}
