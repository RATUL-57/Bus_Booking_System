package com.iut.bus_booking.controller;

import com.iut.bus_booking.entity.Seat;
import com.iut.bus_booking.services.SeatService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/seats")
public class SeatController {

    private final SeatService seatService;

    @GetMapping("/getAll")
    public List<Seat> getAll() {
        return seatService.findAll();
    }
}
