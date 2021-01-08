package com.donor.station.mapper;

import com.donor.station.dao.entities.Result;
import com.donor.station.dao.entities.Result_type;
import com.donor.station.web.dto.ResultDto;
import com.donor.station.web.dto.ResultTypeDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper
public interface ResultMapper extends TestMapper{
    ResultDto ResultToDto (Result entity);

    @Mappings({
            @Mapping(source = "result_name", target = "result_title"),
            @Mapping(source = "id", target = "result_id")
    })
    ResultTypeDto ResultTypeToDto (Result_type entity);
}
