package com.codingdojo.consultasyjoins.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.consultasyjoins.models.Country;

@Repository
public interface CountryRepository extends CrudRepository<Country, Long> {

		@Query("SELECT c,l FROM Country c JOIN c.languages l WHERE l.language = 'Slovene' ORDER BY l.percentage DESC")
	    List<Object[]> paisesQueHablanSloveno();
	    
	    @Query("SELECT co.name, count(ci.id) Ciudades FROM Country co JOIN co.cities ci \n"
	    		+ "GROUP BY co.name ORDER BY Ciudades DESC")
	    List<Object[]> totalCiudades();
	    
	    @Query("SELECT co.name, l.language, l.percentage\r\n"
	    		+ "FROM Country co \r\n"
	    		+ "JOIN co.languages l \r\n"
	    		+ "WHERE l.percentage>89 \r\n"
	    		+ "ORDER BY l.percentage DESC")
	    List<Object[]> idiomasMayorA89();
	    
	    @Query("SELECT c \r\n"
	    		+ "FROM Country c \r\n"
	    		+ "WHERE c.surface_area<501 and c.population>100000")
	    List<Country> areaInferior501();
	    
	    @Query("SELECT c \r\n"
	    		+ "FROM Country c \r\n"
	    		+ "WHERE c.government_form = 'Constitutional Monarchy' AND c.capital>200 AND c.life_expectancy>75")
	    List<Country> monarquia();
	    
	    @Query("SELECT co.region, count(co) Paises \r\n"
	    		+ "FROM Country co \r\n"
	    		+ "group by co.region \r\n"
	    		+ "ORDER BY Paises DESC")
	    List<Object[]> paisesPorRegion();
}
