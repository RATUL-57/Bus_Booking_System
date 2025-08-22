package com.iut.bus_booking.controller;

import com.iut.bus_booking.entity.Bus;
import com.iut.bus_booking.services.BusService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/buses")
public class BusController {

    private final BusService busService;

    @GetMapping("/getAll")
    public List<Bus> getAll() {
        return busService.findAll();
    }
}
