package za.ca.cput.domain;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ticketId;
    private LocalDateTime issuedDate;
    private Boolean isVerified;

    @OneToOne
    private QRCode qrCode;

    @ManyToOne
    private Booking booking;

    protected Ticket() {}

    private Ticket(Builder builder) {
        this.ticketId = builder.ticketId;
        this.issuedDate = builder.issuedDate;
        this.isVerified = builder.isVerified;
        this.qrCode = builder.qrCode;
        this.booking = builder.booking;
    }

    public Long getTicketId() { return ticketId; }

    public static class Builder {
        private Long ticketId;
        private LocalDateTime issuedDate;
        private Boolean isVerified;
        private QRCode qrCode;
        private Booking booking;

        public Builder setTicketId(Long ticketId) { this.ticketId = ticketId; return this; }
        public Builder setIssuedDate(LocalDateTime issuedDate) { this.issuedDate = issuedDate; return this; }
        public Builder setIsVerified(Boolean isVerified) { this.isVerified = isVerified; return this; }
        public Builder setQrCode(QRCode qrCode) { this.qrCode = qrCode; return this; }
        public Builder setBooking(Booking booking) { this.booking = booking; return this; }

        public Ticket build() { return new Ticket(this); }
    }
}
