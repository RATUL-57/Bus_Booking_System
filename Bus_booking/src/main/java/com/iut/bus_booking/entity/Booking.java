package com.iut.bus_booking.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "bookings", indexes = {
        @Index(name = "idx_booking_schedule_seat", columnList = "schedule_id,seat_id", unique = true)
})
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Manual entry for now
    @Column(name = "user_id", nullable = false)
    private Long userId;

    @Column(name = "user_name", nullable = false, length = 120)
    private String userName;

    // FK → Bus.id (denormalized convenience reference)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "bus_id", nullable = false,
            foreignKey = @ForeignKey(name = "fk_booking_bus"))
    private Bus bus;

    // FK → Seat.id
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "seat_id", nullable = false,
            foreignKey = @ForeignKey(name = "fk_booking_seat"))
    private Seat seat;

    // FK → Schedule.id
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "schedule_id", nullable = false,
            foreignKey = @ForeignKey(name = "fk_booking_schedule"))
    private Schedule schedule;

    // Stored for convenience/reporting; should match schedule.date
    @Column(name = "date", nullable = false)
    private LocalDate date;

    // Represents availability state of this seat in this booking context
    @Column(name = "is_available", nullable = false)
    private boolean isAvailable;
}

