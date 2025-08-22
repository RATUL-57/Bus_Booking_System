package com.iut.bus_booking.services;

import com.iut.bus_booking.entity.Schedule;
import com.iut.bus_booking.repository.ScheduleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ScheduleService {

    private final ScheduleRepository scheduleRepository;

    public List<Schedule> findAll() {
        return scheduleRepository.findAll();
    }

    public Schedule createSchedule(Schedule scheduleRequest) {
        return scheduleRepository.save(scheduleRequest);
    }

}
