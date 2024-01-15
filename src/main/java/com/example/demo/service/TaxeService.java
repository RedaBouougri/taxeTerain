package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Taux;
import com.example.demo.repository.TauxRepository;
import net.bytebuddy.implementation.bind.MethodDelegationBinder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Taxe;
import com.example.demo.repository.TaxeRepository;

@Service
public class TaxeService {
	
	@Autowired
	TaxeRepository taxeRepository;

	@Autowired
	TauxService tauxService;

	@Autowired
	KafkaConsumer kafkaConsumer;

	public void  save(Taxe entity) {
		Taux taux = tauxService.findByCategoryAndAnnee(entity.getTerain().getCategory(),entity.getTnbAnnee());
			System.out.println();
		double montant = entity.getTerain().getSurface()*taux.getMontant();
		entity.setMontantBase(montant);
		kafkaConsumer.queu().remove(entity);
		taxeRepository.save(entity);
	}


	public List<Taxe> findAll() {
		return taxeRepository.findAll();
	}

	public void deleteById(Integer id) {
		taxeRepository.deleteById(id);
	}

	public List<Taxe> findByRedevableCin(String cin) {
		return taxeRepository.findByRedevableCin(cin);
	}
}
