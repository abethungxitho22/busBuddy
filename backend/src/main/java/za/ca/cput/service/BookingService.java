package za.ca.cput.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ca.cput.domain.Booking;
import za.ca.cput.repository.BookingRepository;

import java.util.List;

@Service
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
    public boolean delete(Long bookingId) {
        if (bookingRepository.existsById(bookingId)) {
            bookingRepository.deleteById(bookingId);
            return true;
        }
        return false;
    }

    @Override
    public List<Booking> getAll() {
        return this.bookingRepository.findAll();
    }

}
