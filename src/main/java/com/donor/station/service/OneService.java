package com.donor.station.service;

import com.donor.station.web.dto.basic.Request;

public interface OneService {

    Request OneServiceGetMethod(Long id);
    String OneServicePostMethod(Request request);

}
