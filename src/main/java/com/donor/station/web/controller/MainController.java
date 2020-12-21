package com.donor.station.web.controller;

import com.donor.station.dao.entities.Card;
import com.donor.station.service.OneService;
import com.donor.station.service.interfaces.CardService;
import com.donor.station.web.dto.Meta;
import com.donor.station.web.dto.Request;
import com.donor.station.web.dto.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// get(@RequestParam Long id) передача параметров гет-запроса

@RestController
@RequestMapping("api/first")
public class MainController {
    @Autowired
    OneService service;

    @Autowired
    CardService cards;

    @GetMapping( "get/{id}")
    public ResponseEntity<Response<Request>> getMethod(@PathVariable Long id) {
        try {
            return new ResponseEntity<>(new Response<>(new Meta(0, "All good"), service.OneServiceGetMethod(id)), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(new Response<>(new Meta(1, e.toString()), null), HttpStatus.CONFLICT);
        }
    }

    @GetMapping( "card/{id}")
    public ResponseEntity<Response<List<Card>>> getCardById(@PathVariable Long id) {
        try {
            return new ResponseEntity<>(new Response<>(new Meta(0, "All good"), cards.getAll()), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(new Response<>(new Meta(1, e.toString()), null), HttpStatus.CONFLICT);
        }
    }

}
