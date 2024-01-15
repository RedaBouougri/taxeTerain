package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Taux;
import com.example.demo.repository.TauxRepository;

@Service
public class TauxService {
	
	@Autowired
	TauxRepository tauxRepository;

	public Taux findByCategoryLabel(String label) {
		return tauxRepository.findByCategoryLabel(label);
	}

	public void save(Taux entity) {
		 tauxRepository.save(entity);
	}

	public List<Taux> findAll() {
		return tauxRepository.findAll();
	}

	public Taux findById(Integer id) {
		return tauxRepository.findById(id).get();
	}

	public void deleteById(Integer id) {
		tauxRepository.deleteById(id);
	}

	public Taux findByCategoryAndAnnee(Category category, int annee) {
		return tauxRepository.findByCategoryAndAnnee(category, annee);
	}
}
