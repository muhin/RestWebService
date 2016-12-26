package com.softdaemon.rest.service.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.softdaemon.rest.service.entity.Country;

@Repository
@Transactional
public class CountryDaoImpl implements CountryDao {
	
	@PersistenceContext
    private EntityManager em;

	public List<Country> getAllCountries() {
		List<Country> employees = em.createQuery("Select a From Country a", Country.class).getResultList();
        return employees;
	}

	public Country getCountry(int id) {
		return em.find(Country.class, id);
	}

	public Country addCountry(Country country) {
		em.persist(country);
		return country;
	}

	public Country updateCountry(Country country) {
		em.merge(country);
		return country;
	}

	public boolean deleteCountry(int id) {
		em.remove(em.find(Country.class, id));
		return true;
	}

}
