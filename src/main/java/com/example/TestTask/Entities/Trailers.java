package com.example.TestTask.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "dmapr")
public class Trailers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "uin_pts")
    private TransportData uinPts;

    @Column(name = "pergr")
    private Float pergr;

    @ManyToOne
    @JoinColumn(name = "dml_id")
    private Waybill dml;

    // Getters and setters
}
