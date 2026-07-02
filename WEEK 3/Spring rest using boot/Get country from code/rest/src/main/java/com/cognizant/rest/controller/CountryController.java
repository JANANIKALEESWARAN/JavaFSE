package com.cognizant.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.cognizant.rest.Country;
import com.cognizant.rest.service.CountryService;

@RestController
public class CountryController {

    @Autowired
    CountryService countryService;

    @GetMapping("/countries/{code}")
    public Country getCountry(@PathVariable String code) {

        return countryService.getCountry(code);

    }

}