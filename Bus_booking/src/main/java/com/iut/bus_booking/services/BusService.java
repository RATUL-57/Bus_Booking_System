package com.iut.bus_booking.services;

import com.iut.bus_booking.entity.Bus;
import com.iut.bus_booking.repository.BusRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BusService {

    private final BusRepository busRepository;

    public List<Bus> findAll() {
        return busRepository.findAll();
    }
}
