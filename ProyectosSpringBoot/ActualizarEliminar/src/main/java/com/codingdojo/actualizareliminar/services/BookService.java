package com.codingdojo.actualizareliminar.services;

import java.util.List;
import java.util.Optional;

//...
import org.springframework.stereotype.Service;

import com.codingdojo.actualizareliminar.models.Book;
import com.codingdojo.actualizareliminar.repositories.BookRepository;

@Service
public class BookService {
	// Agregando el book al repositorio como una dependencia
	private final BookRepository bookRepository;

	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	// Devolviendo todos los libros.
	public List<Book> allBooks() {
		return bookRepository.findAll();
	}

	// Creando un libro.
	public Book createBook(Book b) {
		return bookRepository.save(b);
	}

	// Obteniendo la información de un libro
	public Book findBook(Long id) {
		Optional<Book> optionalBook = bookRepository.findById(id);
		if (optionalBook.isPresent()) {
			return optionalBook.get();
		} else {
			return null;
		}
	}

	public Book updateBook(Long id, String title, String desc, String lang, int numOfPages) {
		Optional<Book> optionalBook = bookRepository.findById(id);
		Book book = optionalBook.get();
		book.setTitle(title);
		book.setDescription(desc);
		book.setLanguage(lang);
		book.setNumberOfPages(numOfPages);
		return bookRepository.save(book);
	}

	public void deleteBook(Long id) {
		bookRepository.deleteById(id);
	}
}
