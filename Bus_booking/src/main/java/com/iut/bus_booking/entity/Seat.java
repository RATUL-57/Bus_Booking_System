package com.iut.bus_booking.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "seats", indexes = {
        @Index(name = "idx_seat_name_unique", columnList = "name", unique = true)
})
public class Seat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // e.g., A1, B1, C1, D1, A2, ...
    @Column(nullable = false, length = 10, unique = true)
    private String name;
}
