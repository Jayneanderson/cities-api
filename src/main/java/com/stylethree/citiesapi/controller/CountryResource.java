package com.stylethree.citiesapi.controller;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stylethree.citiesapi.model.Country;
import com.stylethree.citiesapi.repository.CountryRepository;

@RestController //informa para o spring que é um controller rest
@RequestMapping("/countries")
public class CountryResource {
	
	private CountryRepository repository;
	
	public CountryResource(CountryRepository repository) {
		this.repository = repository;
	}

	@GetMapping
	public ResponseEntity<Page<Country>> getCountries(Pageable page) {
		return ResponseEntity.ok(repository.findAll(page));  //Serve para criar uma páginação do banco de dados
	
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Country> getOne(@PathVariable("id") Long id) {
		
		return ResponseEntity.ok(repository.findById(id).get());
	}
	
//	Não apsse adiante a
	
}
