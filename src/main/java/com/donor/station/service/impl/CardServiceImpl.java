package com.donor.station.service.impl;

import com.donor.station.dao.entities.Card;
import com.donor.station.dao.repos.CardRepository;
import com.donor.station.service.interfaces.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class CardServiceImpl implements CardService {

    @Autowired
    private CardRepository cardRepository;

    @Override
    public Card addCard(Card card) {
        Card newCard = cardRepository.saveAndFlush(card);
        return newCard;
    }

    @Override
    public void delete(long id) {
        cardRepository.deleteById(id);
    }

    /*@Override
    public Card getByName(String f_name,String l_name) {
        return cardRepository.findByName(f_name, l_name);
    }*/

    @Override
    public List<Card> getById(long id) {
        return cardRepository.findAllById(Collections.singleton(id));
    }

    @Override
    public Card editCard(Card card) {
        return cardRepository.saveAndFlush(card);
    }

    @Override
    public List<Card> getAll() {
        return cardRepository.findAll();
    }


}
