package com.softdaemon.rest.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.softdaemon.rest.service.entity.Country;
import com.softdaemon.rest.service.service.CountryService;

@RestController
public class CountryController {

	@Autowired
	CountryService countryService;
	
	@RequestMapping("/")
	  @ResponseBody
	  public String index() {
	    return "Hello World!!!";
	  }
	
	@RequestMapping(value = "/countries", method = RequestMethod.GET)
	public List<Country> getCountries() {
		List<Country> listOfCountries = countryService.getAllCountries();
		return listOfCountries;
	}

	@RequestMapping(value = "/country", params = "id", method = RequestMethod.GET)
	public Country getCountryById(@RequestParam("id") int id) {
		return countryService.getCountry(id);
	}

	@RequestMapping(value = "/countries", method = RequestMethod.POST)
	public Country addCountry(@RequestBody Country country) {
		return countryService.addCountry(country);
	}

	@RequestMapping(value = "/countries", method = RequestMethod.PUT)
	public Country updateCountry(@RequestBody Country country) {
		return countryService.updateCountry(country);

	}

	@RequestMapping(value = "/country", params = "id", method = RequestMethod.DELETE)
	public void deleteCountry(@RequestParam("id") int id) {
		countryService.deleteCountry(id);

	}	
}
