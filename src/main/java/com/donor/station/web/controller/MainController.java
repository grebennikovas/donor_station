package com.donor.station.web.controller;

import com.donor.station.web.dto.*;
import com.donor.station.service.OneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/first")
public class MainController {
    @Autowired
    OneService service;

    @GetMapping("get-method")
    public ResponseEntity<Response<Request>> getMethod(@RequestParam Long id) {
        try {
            return new ResponseEntity<>(new Response<>(new Meta(0, "All good"), service.OneServiceGetMethod(id)), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(new Response<>(new Meta(1, e.toString()), null), HttpStatus.CONFLICT);
        }
    }

}
