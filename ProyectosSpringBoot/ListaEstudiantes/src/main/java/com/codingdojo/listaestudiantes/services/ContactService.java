package com.codingdojo.listaestudiantes.services;

import java.util.List;

//...
import org.springframework.stereotype.Service;

import com.codingdojo.listaestudiantes.models.Contact;
import com.codingdojo.listaestudiantes.repositories.ContactRepository;

@Service
public class ContactService {
	// Agregando el licencia al repositorio como una dependencia
	private final ContactRepository contactRepository;

	public ContactService(ContactRepository contactRepository) {
		this.contactRepository = contactRepository;
	}

	
	public List<Contact> allContact() {
		return contactRepository.findAll();
	}


	public Contact createContact(Contact b) {
		return contactRepository.save(b);
	}

}
