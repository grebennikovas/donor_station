package com.donor.station.web.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    @JsonIgnore
    int pas_series;
    @JsonIgnore
    int pas_number;
    RhTypeDto rh;
    BloodTypeDto blood;

}
