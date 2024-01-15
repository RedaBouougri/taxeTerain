package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Taxe;

import java.util.List;

public interface TaxeRepository extends JpaRepository<Taxe, Integer>{

    List<Taxe> findByRedevableCin(String cin);
}
