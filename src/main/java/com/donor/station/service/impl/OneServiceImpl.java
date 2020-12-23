package com.donor.station.service.impl;

import com.donor.station.service.OneService;
import com.donor.station.web.dto.basic.Request;
import org.springframework.stereotype.Service;

@Service
public class OneServiceImpl implements OneService {

    @Override
    public Request OneServiceGetMethod(Long id) {
        return new Request();
    }

    @Override
    public String OneServicePostMethod(Request request) {
//        RequestDao requestDao = RequestMapper.PUSH_REQUEST_MAPPER.requestDtoToRequestDao(requestDto);
//        if (requestRepository.findById(requestDao.getId()).isPresent()) {
//            throw new AlreadyExistException();
//        }
//        requestRepository.save(requestDao);

            return "Successfully inserted!";
    }
}
