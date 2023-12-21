package com.example.TestTask.Entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
import java.time.ZonedDateTime;

@Entity
@Table(name="pts")
@Getter
@Setter
public class TransportData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long uin;

    @Column(name = "unts")
    private Integer unts;

    @ManyToOne
    @JoinColumn(name = "t_id")
    private TransportType tiptr;

    @ManyToOne
    @JoinColumn(name = "firm_id")
    private Firm firm;

    @Column(name = "grp")
    private Float grp;

    @Column(name = "normt")
    private Float normt;

    @Column(name = "datasp")
    private Timestamp datasp;

}
