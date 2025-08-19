package za.ca.cput.service;

import org.springframework.beans.factory.annotation.Autowired;
import za.ca.cput.domain.Booking;
import za.ca.cput.repository.BookingRepository;

import java.util.List;

public class BookingService implements IBookingService {

    private final BookingRepository bookingRepository;

   @Autowired
    public BookingService(BookingRepository repository) {
        this.bookingRepository = repository;
    }

    @Override
    public Booking create(Booking booking) {
        return bookingRepository.save(booking);
    }

    @Override
    public Booking read(Long bookingId) {
        return bookingRepository.findById(bookingId).orElse(null);
    }

    @Override
    public Booking update(Booking booking) {
        return bookingRepository.save(booking);
    }

    @Override
    public void delete(Long bookingId) {
        bookingRepository.deleteById(bookingId);
    }

    @Override
    public List<Booking> getAll() {
        return this.bookingRepository.findAll();
    }

}
