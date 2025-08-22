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
@Table(name = "schedules", indexes = {
        @Index(name = "idx_schedule_bus_date", columnList = "bus_id,date", unique = true)
})
public class Schedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "bus_id", nullable = false,
            foreignKey = @ForeignKey(name = "fk_schedule_bus"))
    private Bus bus;

    @Column(name = "date", nullable = false)
    private LocalDate date;
}