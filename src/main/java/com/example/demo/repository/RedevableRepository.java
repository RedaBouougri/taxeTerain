package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Redevable;

public interface RedevableRepository extends JpaRepository<Redevable, Integer>{

	Redevable findByCin(String cin);
}
