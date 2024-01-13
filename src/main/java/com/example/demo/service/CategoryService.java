package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Category;
import com.example.demo.entity.Redevable;
import com.example.demo.repository.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	CategoryRepository categoryRepository;
	
	public void save(Category entity) {

		categoryRepository.save(entity);
	}

	public List<Category> findAll() {
		
		return categoryRepository.findAll();
	}

	public void deleteById(Integer id) {
		
		categoryRepository.deleteById(id);
	}

}
