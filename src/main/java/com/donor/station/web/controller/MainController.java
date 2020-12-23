package com.donor.station.web.controller;

import com.donor.station.dao.entities.Blood_type;
import com.donor.station.dao.entities.Card;
import com.donor.station.service.OneService;
import com.donor.station.service.interfaces.BloodTypeService;
import com.donor.station.service.interfaces.CardService;
import com.donor.station.web.dto.basic.Meta;
import com.donor.station.web.dto.basic.Request;
import com.donor.station.web.dto.basic.Response;
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

    @Autowired
    BloodTypeService bloodTypes;

    @GetMapping( "get/{id}")
    public ResponseEntity<Response<Request>> getMethod(@PathVariable Long id) {
        try {
            return new ResponseEntity<>(new Response<>(new Meta(0, "All good"), service.OneServiceGetMethod(id)), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(new Response<>(new Meta(1, e.toString()), null), HttpStatus.CONFLICT);
        }
    }

    @GetMapping( "card")
    public ResponseEntity<Response<List<Card>>> getAll() {
        try {
            return new ResponseEntity<>(new Response<>(new Meta(0, "All good"), cards.getAll()), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(new Response<>(new Meta(1, e.toString()), null), HttpStatus.CONFLICT);
        }
    }

    @GetMapping( "card/{id}")
    public ResponseEntity<Response<List<Card>>> getCardById(@PathVariable Long id) {
        try {
            return new ResponseEntity<>(new Response<>(new Meta(0, "All good"), cards.getById(id)), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(new Response<>(new Meta(1, e.toString()), null), HttpStatus.CONFLICT);
        }
    }

    @GetMapping( "rh/{rh}")
    public ResponseEntity<Response<List<Card>>> getCardByName(@PathVariable int rh) {
        try {
            return new ResponseEntity<>(new Response<>(new Meta(0, "All good"), cards.getByRh(rh)), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(new Response<>(new Meta(1, e.toString()), null), HttpStatus.CONFLICT);
        }
    }

    @GetMapping( "blood_type")
    public ResponseEntity<Response<List<Blood_type>>> getCardByName() {
        try {
            return new ResponseEntity<>(new Response<>(new Meta(0, "All good"), bloodTypes.getAll()), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(new Response<>(new Meta(1, e.toString()), null), HttpStatus.CONFLICT);
        }
    }

}
