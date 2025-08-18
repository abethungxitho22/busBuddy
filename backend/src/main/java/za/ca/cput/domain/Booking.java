package za.ca.cput.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "bookings")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookingId;
    private LocalDateTime bookingTime;
    @ManyToOne
    @JoinColumn(name = "shuttleId", nullable = false)
    private Shuttle shuttle;

    protected Booking() {}

    public Booking(Builder builder) {
        this.bookingId = builder.bookingId;
        this.bookingTime = builder.bookingTime;

    }

    public LocalDateTime getBookingTime() {
        return bookingTime;
    }

    public Long getBookingId() {
        return bookingId;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId=" + bookingId +
                ", bookingTime=" + bookingTime +
                '}';
    }

    public static class Builder {

        private Long bookingId;
        private LocalDateTime bookingTime;

        public Builder setBookingId(Long bookingId) {
            this.bookingId = bookingId;
            return this;
        }

        public Builder setBookingTime(LocalDateTime bookingTime) {
            this.bookingTime = bookingTime;
            return this;
        }

        public Builder copy(Booking booking) {
            this.bookingId = booking.bookingId;
            this.bookingTime = booking.bookingTime;
            return this;
        }

        public Booking build() {
            return new Booking(this);
        }
    }
}

