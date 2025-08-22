package com.iut.bus_booking.services;

import com.iut.bus_booking.entity.Booking;
import com.iut.bus_booking.entity.Seat;
import com.iut.bus_booking.repository.BookingRepository;
import com.iut.bus_booking.repository.SeatRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class SeatService {

    private final SeatRepository seatRepository;
    private final BookingRepository bookingRepository;

    public List<Seat> findAll() {
        return seatRepository.findAll();
    }

    public List<Seat> getAvailableSeats(LocalDate date, Long scheduleId, Long busId) {

        List<Seat> allSeats = seatRepository.findAll();

        List<Booking> bookedSeats = bookingRepository.findByDateAndScheduleIdAndBusId(date, scheduleId, busId);

        List<Long> bookedSeatIds = bookedSeats.stream()
                .map(b -> b.getSeat().getId())
                .toList();

        return allSeats.stream()
                .filter(seat -> !bookedSeatIds.contains(seat.getId()))
                .toList();
    }

}
