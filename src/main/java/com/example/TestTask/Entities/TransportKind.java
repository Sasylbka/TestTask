package com.example.TestTask.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "vidtc")
@Getter
@Setter
public class TransportKind {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "shname")
    private String shname;

    @Column(name = "fullname")
    private String fullname;
}
