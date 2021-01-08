package com.donor.station.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@Getter
@Setter
public class TestDto {
    Long id;
    Timestamp test_time;
    CardDto card;
}
