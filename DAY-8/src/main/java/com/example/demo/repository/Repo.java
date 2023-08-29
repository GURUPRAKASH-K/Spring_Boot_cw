package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Model;

public interface Repo extends JpaRepository<Model, Long>{

	@Query(value = "select * from start where bikename like :b%",nativeQuery = true)
	public List<Model> starts(@Param("b")String bikename);
	
	@Query(value = "select * from start where bikename like %:bn",nativeQuery = true)
	public List<Model> ends(@Param("bn") String name);
}
