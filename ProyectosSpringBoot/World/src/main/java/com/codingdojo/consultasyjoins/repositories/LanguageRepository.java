package com.codingdojo.consultasyjoins.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.consultasyjoins.models.Language;

@Repository
public interface LanguageRepository extends CrudRepository<Language, Long> {
	
	
	
}

