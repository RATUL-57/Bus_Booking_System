package com.iut.bus_booking.controller;

import com.iut.bus_booking.entity.Booking;
import com.iut.bus_booking.services.BookingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/bookings")
public class BookingController {

    private final BookingService bookingService;

    @GetMapping("/getAll")
    public List<Booking> getAll() {
        return bookingService.findAll();
    }
}
