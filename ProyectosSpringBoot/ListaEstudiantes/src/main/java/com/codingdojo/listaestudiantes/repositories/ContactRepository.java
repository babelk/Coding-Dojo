package com.codingdojo.listaestudiantes.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.listaestudiantes.models.Contact;

//...
@Repository
public interface ContactRepository extends CrudRepository<Contact, Long> {

	List<Contact> findAll();
	
	Integer countBy();

	Optional<Contact> findById(Long id);

}
