package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Model;

public interface Repo extends JpaRepository<Model, Integer>{

	@Query(value = "select * from model where owners like :s%",nativeQuery = true)
	public List<Model> geto(@Param("s") int owners);
	@Query(value = "select * from model where address=:sn",nativeQuery =true)
	public List<Model> geti(@Param("sn") String address);
	
	@Query(value = "select * from model where car_name like %:nn",nativeQuery = true)
	public List<Model> geta(@Param("nn") String carName);
	
	@Query(value = "select * from model where owners=:sa and car_type=:sd",nativeQuery = true)
	public List<Model> gete(@Param("sa")int owners,@Param("sd") String cartype);
}

