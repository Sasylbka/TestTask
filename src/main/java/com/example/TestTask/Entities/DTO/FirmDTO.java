package com.example.TestTask.Entities.DTO;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FirmDTO {
    private Long id;
    private String tlgr;
    private String disloc;
}
