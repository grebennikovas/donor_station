package com.donor.station.web.controller;

import com.donor.station.dao.entities.Card;
import com.donor.station.dao.entities.Donation;
import com.donor.station.dao.entities.Result;
import com.donor.station.dao.entities.Test;
import com.donor.station.mapper.CardMapper;
import com.donor.station.service.interfaces.CardService;
import com.donor.station.service.interfaces.DonationService;
import com.donor.station.service.interfaces.ResultService;
import com.donor.station.service.interfaces.TestService;
import com.donor.station.web.dto.CardDto;
import com.donor.station.web.dto.basic.Meta;
import com.donor.station.web.dto.basic.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// get(@RequestParam Long id) передача параметров гет-запроса

@RestController
@RequestMapping("api")
public class MainController {
    @Autowired
    CardService cards;
    @Autowired
    TestService tests;
    @Autowired
    ResultService results;
    @Autowired
    DonationService donations;

    @RequestMapping( value="/card", method = RequestMethod.GET)
    public ResponseEntity<Response<List<Card>>> getCards() {
        try {
            List<Card> list = cards.getAll();
            //List<CardDto> list = CardMapper.INSTANCE.CardListToDto(cards.getAll());
            return new ResponseEntity<>(new Response<>(new Meta(0, "All good"), list), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(new Response<>(new Meta(1, e.toString()), null), HttpStatus.CONFLICT);
        }
    }
    @RequestMapping( value="/test", method = RequestMethod.GET)
    public ResponseEntity<Response<List<Test>>> getTests() {
        try {
            List<Test> list = tests.getAll();
            //List<CardDto> list = CardMapper.INSTANCE.CardListToDto(cards.getAll());
            return new ResponseEntity<>(new Response<>(new Meta(0, "All good"), list), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(new Response<>(new Meta(1, e.toString()), null), HttpStatus.CONFLICT);
        }
    }
    @RequestMapping( value="/result", method = RequestMethod.GET)
    public ResponseEntity<Response<List<Result>>> getResults() {
        try {
            List<Result> list = results.getAll();
            //List<CardDto> list = CardMapper.INSTANCE.CardListToDto(cards.getAll());
            return new ResponseEntity<>(new Response<>(new Meta(0, "All good"), list), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(new Response<>(new Meta(1, e.toString()), null), HttpStatus.CONFLICT);
        }
    }
    @RequestMapping( value="/donation", method = RequestMethod.GET)
    public ResponseEntity<Response<List<Donation>>> getDonations() {
        try {
            List<Donation> list = donations.getAll();
            //List<CardDto> list = CardMapper.INSTANCE.CardListToDto(cards.getAll());
            return new ResponseEntity<>(new Response<>(new Meta(0, "All good"), list), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(new Response<>(new Meta(1, e.toString()), null), HttpStatus.CONFLICT);
        }
    }

    @RequestMapping( value="/card/{id}", method = RequestMethod.GET)
    public ResponseEntity<Response<List<CardDto>>> getCardById(@PathVariable Long id) {
        List<CardDto> list = CardMapper.INSTANCE.CardListToDto(cards.getById(id));
        try {
            return new ResponseEntity<>(new Response<>(new Meta(0, "All good"), list), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(new Response<>(new Meta(1, e.toString()), null), HttpStatus.CONFLICT);
        }
    }
    // нужно доделать
    @RequestMapping( value= "/card/filter", method = RequestMethod.GET)
    public ResponseEntity<Response<List<CardDto>>> getCardByName(@RequestParam Long rh, @RequestParam Long blood) {

        List<CardDto> list = CardMapper.INSTANCE.CardListToDto(cards.getByRh(rh));
        try {
            return new ResponseEntity<>(new Response<>(new Meta(0, "All good"), list), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(new Response<>(new Meta(1, e.toString()), null), HttpStatus.CONFLICT);
        }
    }


}
