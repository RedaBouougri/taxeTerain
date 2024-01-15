package com.example.demo.repository;

import com.example.demo.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Taux;

public interface TauxRepository extends JpaRepository<Taux, Integer>{

	
	Taux findByCategoryLabel(String label);

	Taux findByCategoryAndAnnee(Category category,int annee);
}
