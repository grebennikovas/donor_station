package com.donor.station.mapper;

import com.donor.station.dao.entities.Blood_type;
import com.donor.station.dao.entities.Card;
import com.donor.station.dao.entities.Rh_type;
import com.donor.station.web.dto.BloodTypeDto;
import com.donor.station.web.dto.CardDto;
import com.donor.station.web.dto.RhTypeDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CardMapper {
    CardMapper INSTANCE = Mappers.getMapper( CardMapper.class );

    //@Named("CardToDto")
    @Mappings({
            @Mapping(source = "cardDao.id", target = "card_id"),
            @Mapping(source = "cardDao.blood_type", target = "blood"),
            @Mapping(source = "cardDao.rh_type", target = "rh")
    })
    CardDto CardToDto(Card cardDao);

    @Mappings({
            @Mapping(source = "blood_name", target = "blood_title"),
            @Mapping(source = "id", target = "blood_id")
    })
    BloodTypeDto BloodToDto(Blood_type blood_type);

    @Mappings({
            @Mapping(source = "rh_name", target = "rh_title"),
            @Mapping(source = "id", target = "rh_id")
    })
    RhTypeDto RhToDto(Rh_type entity);

    List<CardDto> CardListToDto(List<Card> list);
}
