package com.donor.station.web.dto;

import com.donor.station.dao.entities.Test;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
@Getter
@Setter
public class ResultDto {
    Long id;
    Test test;
    String description;
    ResultTypeDto result;
}
