package com.donor.station.service.interfaces;

import com.donor.station.dao.entities.Card;

import java.util.List;

public interface CardService {

    Card addCard(Card card);
    void delete(long id);
    List<Card>  getByRh(int rh);
    List<Card> getById(long id);
    Card editCard(Card card);
    List<Card> getAll();

}
