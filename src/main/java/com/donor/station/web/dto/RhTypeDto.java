package com.donor.station.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
@Getter
@Setter
public class RhTypeDto {
    public Long rh_id;
    public String rh_title;
}
