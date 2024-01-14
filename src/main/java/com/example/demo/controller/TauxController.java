package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Category;
import com.example.demo.entity.Redevable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Taux;
import com.example.demo.service.TauxService;

@RestController
@CrossOrigin("*")
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
		return tauxService.findById(id);
	}

	@DeleteMapping("/delete/{id}")
	public void deleteById(@PathVariable Integer id) {
		tauxService.deleteById(id);
	}

	@PutMapping("/update/{id}")
	public Taux save(@RequestBody Taux p, @PathVariable int id) {
		Taux red = tauxService.findById(id);
		if (red != null) {
			if (p.getMontant() != 0) {
				red.setMontant(p.getMontant());

			}
			if (p.getAnnee() != 0) {
				red.setAnnee(p.getAnnee());
			}

			if (p.getCategory() != null) {
				red.setCategory(p.getCategory());
			}


			tauxService.save(red);
		}
		return null;	}

}
