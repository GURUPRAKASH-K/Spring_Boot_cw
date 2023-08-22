package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.EmpMod;

public interface EmpRepo extends JpaRepository<EmpMod, Integer> {

}
