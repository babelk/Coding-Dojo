package com.codingdojo.productosycategorias.services;

import java.util.List;

//...
import org.springframework.stereotype.Service;

import com.codingdojo.productosycategorias.models.Category;
import com.codingdojo.productosycategorias.models.Product;
import com.codingdojo.productosycategorias.repositories.CategoryRepository;

@Service
public class CategoryService {
	// Agregando el book al repositorio como una dependencia
	private final CategoryRepository categoryRepository;

	public CategoryService(CategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}

	public List<Category> allCategories() {
		return categoryRepository.findAll();
	}

	public List<Category> categoriasnulas(Product product) {
		return categoryRepository.findByProductsNotContains(product);
	}
	

	public Category createCategory(Category b) {
		return categoryRepository.save(b);
	}

	public Category encontrarCategoryPorId(Long id) {
		return categoryRepository.findById(id).get();
	}

}
