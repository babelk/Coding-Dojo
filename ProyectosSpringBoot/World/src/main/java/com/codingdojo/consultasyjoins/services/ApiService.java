package com.codingdojo.consultasyjoins.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//...
import org.springframework.stereotype.Service;

import com.codingdojo.consultasyjoins.models.Country;
import com.codingdojo.consultasyjoins.repositories.CityRepository;
import com.codingdojo.consultasyjoins.repositories.CountryRepository;

@Service
public class ApiService {
	
	@Autowired
	private CountryRepository countryRepository;
	@Autowired
	private CityRepository cityRepository;




	// Custom queries for Country
	public List<Object[]> pasisesSloveno() {
		return countryRepository.paisesQueHablanSloveno();
	}
	
	public List<Object[]> totalCiudades() {
		return countryRepository.totalCiudades();
	}
	
	public List<Object[]> ciudadesMexico() {
		return cityRepository.ciudadesMexico();
	}
	public List<Object[]> idiomasMayorA89() {
		return countryRepository.idiomasMayorA89();
	}
	public List<Country> areaInferior501() {
		return countryRepository.areaInferior501();
	}
	public List<Country> monarquia() {
		return countryRepository.monarquia();
	}
	public List<Object[]> distritoBuenosAires() {
		return cityRepository.distritoBuenosAires();
	}
	public List<Object[]> paisesPorRegion() {
		return countryRepository.paisesPorRegion();
	}
}
