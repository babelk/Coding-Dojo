package com.codingdojo.actualizareliminar.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.actualizareliminar.models.Book;

//...
@Repository
public interface BookRepository extends CrudRepository<Book, Long>{
 //Este método recupera todos los libros de la base de datos
 List<Book> findAll();
 //Este método encuentra un libro por su descripción
 List<Book> findByDescriptionContaining(String search);
 //Este método cuenta cuántos libros contiene cierta cadena en el título
 Long countByTitleContaining(String search);
 //Este método borra un libro que empieza con un título específico
 Long deleteByTitleStartingWith(String search);
 
 Optional<Book> findById(Long id);
 
}
