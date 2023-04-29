package com.sample.pieceone.Repository;



import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.sample.pieceone.sanjith.sampleone;
@Repository
public interface CarRepo extends JpaRepository<sampleone, Integer> {

	
	
}
