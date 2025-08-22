package com.iut.bus_booking.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingDto {
    private Long id;
    private Long userId;
    private String userName;
    private Long busId;
    private String busName;
    private Long seatId;
    private String seatName;
    private Long scheduleId;
    private LocalDate date;
    private boolean isAvailable;
}
