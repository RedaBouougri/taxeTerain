package com.example.demo.controller;

import java.util.List;

import com.example.demo.entity.Terain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Category;

import com.example.demo.service.CategoryService;


@RequestMapping("/api/category")
@RestController
@CrossOrigin("*")
public class CategoryController {
	
	@Autowired
	CategoryService categoryService;
	
	
	@PostMapping("/save")
	public void save(@RequestBody Category entity) {
		categoryService.save(entity);
	}

	@GetMapping("/all")
	public List<Category> findAll() {
		return categoryService.findAll();
	}

	@DeleteMapping("/delete/{id}")
	public void deleteById(@PathVariable Integer id) {
		categoryService.deleteById(id);
	}

	@PutMapping("/update/{id}")
	public Category save(@RequestBody Category p, @PathVariable int id) {
		Category category = categoryService.findById(id);
		if (category != null) {
			if (p.getLabel() != null) {
				category.setLabel(p.getLabel());

			}
			if (p.getDescription() != null) {
				category.setDescription(p.getDescription());
			}


			categoryService.save(category);
		}
		return null;	}

}
