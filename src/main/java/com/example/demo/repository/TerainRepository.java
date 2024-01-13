package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Terain;

public interface TerainRepository extends JpaRepository<Terain, Integer>{
	
	List<Terain> findBySurface(double surface);
	
	
	List<Terain> findByRedevableCin(String cin);

}
