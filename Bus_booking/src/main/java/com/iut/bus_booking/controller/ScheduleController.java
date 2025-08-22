package com.iut.bus_booking.controller;

import com.iut.bus_booking.entity.Schedule;
import com.iut.bus_booking.services.ScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/schedules")
public class ScheduleController {

    private final ScheduleService scheduleService;

    @GetMapping("/getAll")
    public List<Schedule> getAll() {
        return scheduleService.findAll();
    }

    @PostMapping("/createSchedule")
    public Schedule createSchedule(@RequestBody Schedule scheduleRequest) {
        return scheduleService.createSchedule(scheduleRequest);
    }


}
