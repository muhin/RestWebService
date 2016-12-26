package com.softdaemon.rest.service.dao;

import java.util.List;

import com.softdaemon.rest.service.entity.Country;

public interface CountryDao {

	List<Country> getAllCountries();

	Country getCountry(int id);

	Country addCountry(Country country);

	Country updateCountry(Country country);

	boolean deleteCountry(int id);
}
