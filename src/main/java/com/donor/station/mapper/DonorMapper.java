package com.donor.station.mapper;

import com.donor.station.dao.entities.*;
import com.donor.station.web.dto.*;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface DonorMapper {
    DonorMapper INSTANCE = Mappers.getMapper( DonorMapper.class );

    // Card
    @Mappings({
            @Mapping(source = "cardDao.id", target = "card_id"),
            @Mapping(source = "cardDao.blood_type", target = "blood"),
            @Mapping(source = "cardDao.rh_type", target = "rh")
    })
    CardDto CardToDto(Card cardDao);
    List<CardDto> CardListToDto(List<Card> list);

    // Blood
    @Mappings({
            @Mapping(source = "blood_name", target = "blood_title"),
            @Mapping(source = "id", target = "blood_id"),
    })
    BloodTypeDto BloodToDto(Blood_type blood_type);

    // Rh
    @Mappings({
            @Mapping(source = "rh_name", target = "rh_title"),
            @Mapping(source = "id", target = "rh_id")
    })
    RhTypeDto RhToDto(Rh_type entity);

    // Test
    TestDto TestToDto(Test entity);
    List<TestDto> TestListToDto(List<Test> list);

    // Result_type
    @Mappings({
            @Mapping(source = "result_name", target = "result_title"),
            @Mapping(source = "id", target = "result_id")
    })
    ResultTypeDto ResultTypeToDto (Result_type entity);
    List<ResultTypeDto> ResultTypeListToDto (List<Result_type> list);

    //Result
    @Mappings({
            @Mapping(source = "result_type", target = "result")
    })
    ResultDto ResultToDto (Result entity);
    List<ResultDto> ResultListToDto (List<Result> list);

    //Donation_type
    @Mappings({
            @Mapping(source = "donation_name", target = "donation_title"),
            @Mapping(source = "id", target = "donation_id")
    })
    DonationTypeDto DonationTypeToDto(Donation_type entity);

    //Donation
    @Mappings({
            @Mapping(source = "donation_type", target = "type")
    })
    DonationDto DonationToDto(Donation entity);
    List<DonationDto> DonationListToDto (List<Donation> list);
}
