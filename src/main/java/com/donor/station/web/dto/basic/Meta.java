package com.donor.station.web.dto.basic;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
@Getter
@Setter
public class Meta {
    private int code;
    private String desc;
    /*private String request_time;
    private String response_time;*/
}
