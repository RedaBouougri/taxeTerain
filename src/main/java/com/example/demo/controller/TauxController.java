package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Taux;
import com.example.demo.service.TauxService;

@RestController
@RequestMapping("/api/taux")
public class TauxController {
	@Autowired
	TauxService tauxService;

	@GetMapping("/findbylabel/{label}")
	public Taux findByCategoryLabel(@PathVariable String label) {
		return tauxService.findByCategoryLabel(label);
	}

	@PostMapping("/save")
	public void save(@RequestBody Taux entity) {
		tauxService.save(entity);
	}

	@GetMapping("/all")
	public List<Taux> findAll() {
		return tauxService.findAll();
	}

	@GetMapping("/findbyid/{id}")
	public Taux findById(@PathVariable Integer id) {
		return tauxService.findById(id).get();
	}

	@DeleteMapping("/delete/{id}")
	public void deleteById(@PathVariable Integer id) {
		tauxService.deleteById(id);
	}

}
