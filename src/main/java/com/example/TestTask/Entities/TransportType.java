package com.example.TestTask.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tiptr")
@Getter
@Setter
public class TransportType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tname")
    private String tname;

    @OneToOne
    @JoinColumn(name = "vidt_id")
    private TransportKind transportKind;

    @Column(name = "prizngr")
    private String prizngr;

    // Getters and setters
}
