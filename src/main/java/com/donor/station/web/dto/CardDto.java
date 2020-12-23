package com.donor.station.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Data
@AllArgsConstructor
@Getter
@Setter
public class CardDto {

    long id;
    String f_name;
    String l_name;
    String p_name;
    Date birthday;
    int pas_series;
    int pas_number;
    int rh_id;
    int blood_id;

}
