package com.codingdojo.consultasyjoins.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.consultasyjoins.models.City;

@Repository
public interface CityRepository extends CrudRepository<City, Long> {
    
	@Query("SELECT ci.name, ci.population, ci.country.id \r\n"
			+ "FROM City ci \r\n"
			+ "WHERE ci.country.id = 136 AND ci.population>500000")
    List<Object[]> ciudadesMexico();
    
    @Query("SELECT co,ci \r\n"
    		+ "FROM City ci \r\n"
    		+ "JOIN ci.country co \r\n"
    		+ "Where ci.district='Buenos Aires' AND ci.population>500000")
    List<Object[]> distritoBuenosAires();
}

