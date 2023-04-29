package com.sample.pieceone.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sample.pieceone.sanjith.model;

public interface reposit extends JpaRepository<model, Integer> {
	model findByuname(String name);
}
