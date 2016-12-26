package com.softdaemon.rest.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softdaemon.rest.service.dao.CountryDao;
import com.softdaemon.rest.service.entity.Country;

@Service
public class CountryServiceImpl implements CountryService {

	@Autowired
	CountryDao countryDao;

	public List<Country> getAllCountries() {
		return countryDao.getAllCountries();
	}

	public Country getCountry(int id) {
		return countryDao.getCountry(id);
	}

	public Country addCountry(Country country) {
		return countryDao.addCountry(country);
	}

	public Country updateCountry(Country country) {
		return countryDao.updateCountry(country);

	}

	public boolean deleteCountry(int id) {
		return countryDao.deleteCountry(id);
	}

}
