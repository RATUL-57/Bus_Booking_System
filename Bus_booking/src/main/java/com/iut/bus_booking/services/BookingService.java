package com.iut.bus_booking.services;

import com.iut.bus_booking.entity.Booking;
import com.iut.bus_booking.repository.BookingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookingService {

    private final BookingRepository bookingRepository;

    public List<Booking> findAll() {
        return bookingRepository.findAll();
    }

    public Booking createBooking(Booking bookingRequest) {
        return bookingRepository.save(bookingRequest);
    }

}
