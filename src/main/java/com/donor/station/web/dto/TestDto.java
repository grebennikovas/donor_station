package com.donor.station.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@Getter
@Setter
public class TestDto {
    Long id;
    LocalDateTime test_time;
    CardDto card;
}
