package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Taxe {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int tnbAnnee;
	private String description;
	private double montantBase;
	
	@ManyToOne
	private Category category;
	@ManyToOne
	private Redevable redevable;
	@ManyToOne
	private Terain terain;
	@ManyToOne
	private Taux taux;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTnbAnnee() {
		return tnbAnnee;
	}
	public void setTnbAnnee(int tnbAnnee) {
		this.tnbAnnee = tnbAnnee;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getMontantBase() {
		return montantBase;
	}
	public void setMontantBase(double montantBase) {
		this.montantBase = montantBase;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public Redevable getRedevable() {
		return redevable;
	}
	public void setRedevable(Redevable redevable) {
		this.redevable = redevable;
	}
	public Terain getTerain() {
		return terain;
	}
	public void setTerain(Terain terain) {
		this.terain = terain;
	}
	public Taux getTaux() {
		return taux;
	}
	public void setTaux(Taux taux) {
		this.taux = taux;
	}
	
	

}
