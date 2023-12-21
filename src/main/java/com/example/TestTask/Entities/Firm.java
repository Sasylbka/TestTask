package com.example.TestTask.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "v_firm")
@Getter
@Setter
public class Firm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tlgr")
    private String tlgr;

    @Column(name = "disloc")
    private String disloc;
}
