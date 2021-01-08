package com.donor.station.web.dto;

import lombok.*;

import java.sql.Date;

@Data
@AllArgsConstructor
@Getter
@Setter
@Builder
public class CardDto {

    Long card_id;
    String f_name;
    String l_name;
    String p_name;
    Date birthday;
    int pas_series;
    int pas_number;
    RhTypeDto rh;
    BloodTypeDto blood;

}
