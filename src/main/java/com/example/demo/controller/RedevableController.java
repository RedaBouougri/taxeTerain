package com.example.demo.controller;

import java.util.List;

import com.example.demo.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Redevable;
import com.example.demo.entity.Terain;
import com.example.demo.service.RedevableService;

@RequestMapping("/api/redevable")
@RestController
@CrossOrigin("*")
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

	@PutMapping("/update/{id}")
	public Redevable save(@RequestBody Redevable p, @PathVariable int id) {
		Redevable redevable = redevableService.findById(id);
		if (redevable != null) {
			if (p.getNom() != null) {
				redevable.setNom(p.getNom());

			}
			if (p.getPrenom() != null) {
				redevable.setPrenom(p.getPrenom());
			}
			if (p.getCin() != null) {
				redevable.setCin(p.getCin());

			}

			redevableService.save(redevable);
		}
		return null;	}


	
	

}
