package com.codingdojo.productosycategorias.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.productosycategorias.models.Category;
import com.codingdojo.productosycategorias.models.Product;

//...
@Repository
public interface ProductRepository extends CrudRepository<Product, Long>{
 //Este método recupera todos los libros de la base de datos
 List<Product> findAll();
 
 Optional<Product> findById(Long id);
 
 List<Product> findByCategoriesNotContains(Category category);
 
}
