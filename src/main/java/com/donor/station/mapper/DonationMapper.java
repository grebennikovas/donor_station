package com.donor.station.mapper;

import com.donor.station.dao.entities.Donation;
import com.donor.station.dao.entities.Donation_type;
import com.donor.station.web.dto.DonationDto;
import com.donor.station.web.dto.DonationTypeDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper
public interface DonationMapper extends ResultMapper  {
    DonationDto DonationToDto(Donation entity);

    @Mappings({
            @Mapping(source = "donation_name", target = "donation_title"),
            @Mapping(source = "id", target = "donation_id")
    })
    DonationTypeDto DonationTypeToDto(Donation_type entity);
}
