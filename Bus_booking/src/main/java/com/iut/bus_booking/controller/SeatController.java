package com.iut.bus_booking.controller;

import com.iut.bus_booking.entity.Seat;
import com.iut.bus_booking.services.SeatService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
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

    @GetMapping("/getAvailableSeats/{date}/{scheduleId}/{busId}")
    public List<Seat> getAvailableSeats(@PathVariable String date,
                                        @PathVariable Long scheduleId,
                                        @PathVariable Long busId) {
        return seatService.getAvailableSeats(LocalDate.parse(date), scheduleId, busId);
    }

}
