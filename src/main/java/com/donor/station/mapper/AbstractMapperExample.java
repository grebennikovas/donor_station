package com.donor.station.mapper;

import org.mapstruct.Mapper;

// Пример рабочего маппера на основе абстрактного классе
@Mapper
abstract public class AbstractMapperExample {
    /*public static CardMapper2 INSTANCE = Mappers.getMapper( CardMapper2.class );

    public CardDto CardToDto(Card card){
        RhTypeDto d = new RhTypeDto(card.getRh_type().getId(),card.getRh_type().getRh_name());
        EN_BloodTypeDto b = EN_BloodTypeDto.I;
        CardDto c = new CardDto(card.getId(),card.getF_name(), card.getL_name(), card.getP_name(),
                card.getBirthday(), card.getPas_series(), card.getPas_number(),d,b);
        return c;
    }

    public abstract List<CardDto> CardListToDto(List<Card> list);*/
}
