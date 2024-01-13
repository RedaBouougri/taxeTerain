package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Redevable;
import com.example.demo.entity.Terain;
import com.example.demo.repository.RedevableRepository;

@Service
public class RedevableService {
	
	@Autowired
	RedevableRepository redevableRepository;
	
	public void save(Redevable entity) {

		redevableRepository.save(entity);
	}

	public List<Redevable> findAll() {
		
		return redevableRepository.findAll();
	}

	public void deleteById(Integer id) {
		
		redevableRepository.deleteById(id);
	}

	public Redevable findByCin(String cin) {
		return redevableRepository.findByCin(cin);
	}

	
	

}
