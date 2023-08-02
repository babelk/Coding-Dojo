package com.codingdojo.productosycategorias.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.codingdojo.productosycategorias.models.Category;
import com.codingdojo.productosycategorias.models.CategoryProduct;
import com.codingdojo.productosycategorias.models.Product;
import com.codingdojo.productosycategorias.services.CategoryProductService;
import com.codingdojo.productosycategorias.services.CategoryService;
import com.codingdojo.productosycategorias.services.ProductService;

import jakarta.validation.Valid;

@Controller
public class CategoryProductController {
	
	private final ProductService productService;
	private final CategoryService categoryService;
	private final CategoryProductService categoryProductService;

	public CategoryProductController(ProductService productService, CategoryService categoryService,CategoryProductService categoryProductService) {
		this.productService = productService;
		this.categoryService = categoryService;
		this.categoryProductService = categoryProductService;
	}

	@RequestMapping("/products/new")
	public String newProduct(Model model, @Valid @ModelAttribute("product") Product product) {
//		List<Persona> personas = categoryService.obetenerPersonaSinLicencia();
		model.addAttribute("product", product);
		return "/views/product.jsp";
	}
	
	@RequestMapping("/categories/new")
	public String newCategory(@Valid @ModelAttribute("category") Category category) {
		return "/views/category.jsp";
	}


	@RequestMapping(value = "/products/new", method = RequestMethod.POST)
	public String createProduct(@Valid @ModelAttribute("product") Product product, BindingResult result) {
		if (result.hasErrors()) {
			return "/views/product.jsp";
		} else {

	        productService.createProduct(product);
	        return "redirect:/products/new";
		}
	}
	
	@RequestMapping(value = "/categories/new", method = RequestMethod.POST)
	public String createCategory(@Valid @ModelAttribute("category") Category category, BindingResult result) {
		if (result.hasErrors()) {
			return "/views/category.jsp";
		} else {
			categoryService.createCategory(category);
			return "redirect:/categories/new";
		}
	}
	@GetMapping("/products/{id}")
	public String showProduct( @ModelAttribute("category_product") CategoryProduct categoryproduct, @PathVariable("id") Long id, Model model) {
		Product product = productService.encontrarProductPorId(id);
		List<Category> categories = categoryService.categoriasnulas(product);
		model.addAttribute("categories", categories);
		model.addAttribute("product", product);
		return "/views/showproduct.jsp";
	}
	
	@RequestMapping(value = "/product_category/{id1}", method = RequestMethod.POST)
	public String createProduct(@ModelAttribute("category_product") CategoryProduct categoryproduct, @PathVariable("id1") Long id, BindingResult result) {
		if (result.hasErrors()) {
			return "/views/product.jsp";
		} else {
			categoryProductService.createCategoryProduct(categoryproduct);
	        return "redirect:/products/"+id;
		}
	}
	@GetMapping("/categories/{id}")
	public String showCategory( @ModelAttribute("category_product") CategoryProduct categoryproduct, @PathVariable("id") Long id, Model model) {
		Category category = categoryService.encontrarCategoryPorId(id);
		List<Product> products = productService.productsNull(category);
		model.addAttribute("products", products);
		model.addAttribute("category", category);
		return "/views/showcategory.jsp";
	}
	
	@RequestMapping(value = "/category_product/{id1}", method = RequestMethod.POST)
	public String createCategory(@ModelAttribute("category_product") CategoryProduct categoryproduct, @PathVariable("id1") Long id, BindingResult result) {
		if (result.hasErrors()) {
			return "/views/category.jsp";
		} else {
			categoryProductService.createCategoryProduct(categoryproduct);
	        return "redirect:/categories/"+id;
		}
	}
}