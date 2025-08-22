package com.iut.bus_booking.services;

import com.iut.bus_booking.entity.Seat;
import com.iut.bus_booking.repository.SeatRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SeatService {

    private final SeatRepository seatRepository;

    public List<Seat> findAll() {
        return seatRepository.findAll();
    }
}
