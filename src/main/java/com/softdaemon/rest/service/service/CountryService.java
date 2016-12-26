package com.softdaemon.rest.service.service;

import java.util.List;

import com.softdaemon.rest.service.entity.Country;

public interface CountryService {

	List<Country> getAllCountries();

	Country getCountry(int id);

	Country addCountry(Country country);

	Country updateCountry(Country country);

	boolean deleteCountry(int id);
}
