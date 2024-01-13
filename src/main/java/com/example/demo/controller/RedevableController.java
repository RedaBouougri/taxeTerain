package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Redevable;
import com.example.demo.entity.Terain;
import com.example.demo.service.RedevableService;

@RequestMapping("/api/redevable")
@RestController
public class RedevableController {
	
	@Autowired
	RedevableService redevableService;
	
	@PostMapping("/save")
	public void save(@RequestBody Redevable entity) {
		redevableService.save(entity);
	}

	@GetMapping("/all")
	public List<Redevable> findAll() {
		return redevableService.findAll();
	}

	@DeleteMapping("/delete/{id}")
	public void deleteById(@PathVariable Integer id) {
		redevableService.deleteById(id);
	}
	@GetMapping("/findbycin/{cin}")
	public Redevable findByCin(@PathVariable String cin) {
		return redevableService.findByCin(cin);
	}
	
	

}
