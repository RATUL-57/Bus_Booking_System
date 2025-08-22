package com.iut.bus_booking.repository;

import com.iut.bus_booking.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {
    List<Booking> findByDateAndScheduleIdAndBusId(LocalDate date, Long scheduleId, Long busId);

}