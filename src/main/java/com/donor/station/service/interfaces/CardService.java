package com.donor.station.service.interfaces;

import com.donor.station.dao.entities.Card;

import java.util.List;

public interface CardService {

    Card addCard(Card card);
    void delete(long id);
    //Card getByName(String f_name, String l_name);
    List<Card> getById(long id);
    Card editCard(Card card);
    List<Card> getAll();

}
