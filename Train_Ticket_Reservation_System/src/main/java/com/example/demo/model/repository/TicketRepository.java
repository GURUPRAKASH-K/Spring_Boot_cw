package com.example.demo.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.TicketEntity;

public interface TicketRepository extends JpaRepository<TicketEntity, Long>{

}
