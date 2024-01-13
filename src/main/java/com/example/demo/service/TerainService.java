package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Terain;
import com.example.demo.repository.TerainRepository;

@Service
public class TerainService {

	@Autowired
	TerainRepository terainRepository;

	public Terain save(Terain entity) {

		return terainRepository.save(entity);
	}

	public Terain findById(Integer integer) {
		return terainRepository.findById(integer).get();
	}

	public List<Terain> findAll() {
		return terainRepository.findAll();
	}

	public void deleteById(Integer id) {
		terainRepository.deleteById(id);
	}

	public List<Terain> findBySurface(double surface) {
		
		return terainRepository.findBySurface(surface);
	}

	

	public List<Terain> findByRedevableCin(String cin) {
		return terainRepository.findByRedevableCin(cin);
	}
	
	
	
	
	
	
	
	

}
