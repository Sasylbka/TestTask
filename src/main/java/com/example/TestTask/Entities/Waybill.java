package com.example.TestTask.Entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Table(name = "dnlavt")
public class Waybill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "uin")
    private TransportData pts;

    @Column(name = "serpl")
    private Integer serpl;

    @Column(name = "data")
    private LocalDateTime data;

    @Column(name = "dataret")
    private LocalDateTime dataret;

    @Column(name = "timeneg")
    private LocalTime timeneg;

    @Column(name = "timeend")
    private LocalTime timeend;

    // Add other properties based on your database structure

    // Getters and setters
}
