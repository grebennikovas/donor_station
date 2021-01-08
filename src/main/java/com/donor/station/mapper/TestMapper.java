package com.donor.station.mapper;

import com.donor.station.dao.entities.Test;
import com.donor.station.web.dto.TestDto;
import org.mapstruct.Mapper;

@Mapper
public interface TestMapper extends CardMapper {
    TestDto TestToDto(Test entity);

}
