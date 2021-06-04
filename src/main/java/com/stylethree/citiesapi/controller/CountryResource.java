package com.stylethree.citiesapi.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stylethree.citiesapi.model.Country;

@RestController //informa para o spring que é um controller rest
@RequestMapping("/countries")
public class CountryResource {
	
	public ResponseEntity<List<Country>> getCountries() {
		return null;
	
	}
	//parei na parte 5 minuto 5
}
