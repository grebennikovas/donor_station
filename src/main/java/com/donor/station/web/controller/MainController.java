package com.donor.station.web.controller;

import com.donor.station.dao.entities.Card;
import com.donor.station.dao.entities.Test;
import com.donor.station.mapper.DonorMapper;
import com.donor.station.service.interfaces.CardService;
import com.donor.station.service.interfaces.DonationService;
import com.donor.station.service.interfaces.ResultService;
import com.donor.station.service.interfaces.TestService;
import com.donor.station.web.dto.CardDto;
import com.donor.station.web.dto.DonationDto;
import com.donor.station.web.dto.ResultDto;
import com.donor.station.web.dto.TestDto;
import com.donor.station.web.dto.basic.Meta;
import com.donor.station.web.dto.basic.Response;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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

    @ApiOperation(
            value = "Мед-карты",
            notes = "Позволяет получить список всех карт донации"
    )
    @RequestMapping(value="/card", method = RequestMethod.GET)
    public ResponseEntity<Response<List<CardDto>>> getCards() {
        try {
            List<CardDto> list = DonorMapper.INSTANCE.CardListToDto(cards.getAll());
            return new ResponseEntity<>(new Response<>(new Meta(0, "All good"), list), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(new Response<>(new Meta(1, e.toString()), null), HttpStatus.CONFLICT);
        }
    }

    @RequestMapping(value="/card", method = RequestMethod.POST)
    public ResponseEntity<Response<CardDto>> addCard(@RequestBody CardDto card) {
        try {
            Long id = cards.addCard(DonorMapper.INSTANCE.CardToDao(card)).getId();
            CardDto new_card =  DonorMapper.INSTANCE.CardToDto(cards.getById(id));
            //List<CardDto> list = DonorMapper.INSTANCE.CardListToDto(cards.getAll());
            return new ResponseEntity<>(new Response<>(new Meta(HttpStatus.CREATED.value(), "Мед-карта добавлена"),new_card), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(new Response<>(new Meta(1, e.toString()), null), HttpStatus.CONFLICT);
        }
    }

    @ApiOperation(
            value = "Тесты",
            notes = "Позволяет получить список всех тестов перед процедурой донации"
    )
    @RequestMapping(value="/test", method = RequestMethod.GET)
    public ResponseEntity<Response<List<TestDto>>> getTests() {
        try {
            List<TestDto> list = DonorMapper.INSTANCE.TestListToDto(tests.getAll());
            return new ResponseEntity<>(new Response<>(new Meta(0, "All good"), list), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(new Response<>(new Meta(1, e.toString()), null), HttpStatus.CONFLICT);
        }
    }

    @ApiOperation(
            value = "Результаты тестирования",
            notes = "Позволяет получить список всех результатов тестирования перед роцедурой донации"
    )
    @RequestMapping(value="/result", method = RequestMethod.GET)
    public ResponseEntity<Response<List<ResultDto>>> getResults() {
        try {
            List<ResultDto> list = DonorMapper.INSTANCE.ResultListToDto(results.getAll());
            return new ResponseEntity<>(new Response<>(new Meta(0, "All good"), list), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(new Response<>(new Meta(1, e.toString()), null), HttpStatus.CONFLICT);
        }
    }

    @ApiOperation(
            value = "Донации",
            notes = "Позволяет получить список всех донаций"
    )
    @RequestMapping(value="/donation", method = RequestMethod.GET)
    public ResponseEntity<Response<List<DonationDto>>> getDonations() {
        try {
            List<DonationDto> list = DonorMapper.INSTANCE.DonationListToDto(donations.getAll());
            return new ResponseEntity<>(new Response<>(new Meta(0, "All good"), list), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(new Response<>(new Meta(1, e.toString()), null), HttpStatus.CONFLICT);
        }
    }
    /* Получение DAO Card */
    @RequestMapping( value="/card_dao", method = RequestMethod.GET)
    public ResponseEntity<Response<List<Card>>> getCardsDAO() {
        try {
            List<Card> list = cards.getAll();
            return new ResponseEntity<>(new Response<>(new Meta(0, "All good"), list), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(new Response<>(new Meta(1, e.toString()), null), HttpStatus.CONFLICT);
        }
    }
    /* Получение DAO Test */
    @RequestMapping(value="/test_dao", method = RequestMethod.GET)
    public ResponseEntity<Response<List<Test>>> getTestsDAO() {
        try {
            List<Test> list = tests.getAll();
            return new ResponseEntity<>(new Response<>(new Meta(0, "All good"), list), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(new Response<>(new Meta(1, e.toString()), null), HttpStatus.CONFLICT);
        }
    }
}
