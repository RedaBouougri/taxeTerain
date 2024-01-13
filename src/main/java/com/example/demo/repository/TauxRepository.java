package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Taux;

public interface TauxRepository extends JpaRepository<Taux, Integer>{

	
	Taux findByCategoryLabel(String label);
}
