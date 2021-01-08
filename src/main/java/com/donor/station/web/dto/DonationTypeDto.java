package com.donor.station.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
@Getter
@Setter
public class DonationTypeDto {
    Long donation_id;
    String donation_title;
}
