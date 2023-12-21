package com.example.TestTask.Entities.DTO;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
import java.time.ZonedDateTime;
import java.util.Date;

@Getter
@Setter
public class TransportDataDTO {
    private Long uin;
    private Integer unts;
    private String tiptrName;
    private String firm;
    private Float grp;
    private Float normt;
    private Timestamp datasp;
}
