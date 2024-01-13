package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Terain;
import com.example.demo.service.TerainService;

@RequestMapping("/api/terain")
@RestController
public class TerainController {
	
	@Autowired
	TerainService terainService;

	@PostMapping("/save")
	public void save(@RequestBody Terain entity) {
		terainService.save(entity);
	}

	@GetMapping("/all")
	public List<Terain> findAll() {
		return terainService.findAll();
	}

	@DeleteMapping("/delete/{id}")
	public void deleteById(@PathVariable Integer id) {
		terainService.deleteById(id);
	}

	

	@GetMapping("/findbycin/{cin}")
	public List<Terain> findByRedevableCin(@PathVariable String cin) {
		return terainService.findByRedevableCin(cin);
	}

	@PutMapping("/update/{id}")
	public Terain save(@RequestBody Terain p,@PathVariable int id) {
		Terain terain = terainService.findById(id);
		if (terain != null) {
			if (p.getNom() != null) {
				terain.setNom(p.getNom());

			}
			if (p.getDescription() != null) {
				terain.setDescription(p.getDescription());
			}

				terain.setSurface(p.getSurface());

			if(p.getRedevable() != null) {
				terain.setRedevable(p.getRedevable());
			}
			return terainService.save(terain);
		}
		return null;	}
	
	

}
