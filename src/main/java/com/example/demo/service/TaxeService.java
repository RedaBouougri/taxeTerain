package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Taxe;
import com.example.demo.repository.TaxeRepository;

@Service
public class TaxeService {
	
	@Autowired
	TaxeRepository taxeRepository;

	public void  save(Taxe entity) {
		 taxeRepository.save(entity);
	}

	public List<Taxe> findAll() {
		return taxeRepository.findAll();
	}

	public void deleteById(Integer id) {
		taxeRepository.deleteById(id);
	}
	
	

}
