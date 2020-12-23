package com.donor.station.mapper;

import com.donor.station.dao.entities.Blood_type;
import com.donor.station.web.dto.BloodTypeDto;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BloodTypeMapper {

    BloodTypeMapper INSTANCE = Mappers.getMapper( BloodTypeMapper.class );

    @Named ("BloodToDto")
    @Mappings({
            @Mapping(source = "blood_name", target = "blood"),
    })
    BloodTypeDto BloodToDto(Blood_type blood_type);

    @InheritInverseConfiguration
    Blood_type BloodToDao(BloodTypeDto bloodTypeDto);
}
