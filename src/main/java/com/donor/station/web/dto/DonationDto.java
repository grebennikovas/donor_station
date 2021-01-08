package com.donor.station.web.dto;

import com.donor.station.dao.entities.Result;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
@Getter
@Setter
public class DonationDto {
    Long id;
    DonationTypeDto type;
    Result result;
}
