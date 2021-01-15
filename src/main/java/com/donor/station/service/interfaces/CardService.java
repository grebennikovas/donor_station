package com.donor.station.service.interfaces;

import com.donor.station.dao.entities.Card;

import java.util.List;

public interface CardService {

    Card addCard(Card card);
    void delete(long id);
    List<Card>  getByRh(Long rh);
    public List<Card> getByBlood(Long blood);
    Card getById(Long id);
    Card editCard(Card card);
    List<Card> getAll();

}
