package com.sample.pieceone.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.sample.pieceone.Repository.CarRepo;
import com.sample.pieceone.sanjith.sampleone;

@Service
public class CarService {
 @Autowired
 public CarRepo crepo;

//post 
public sampleone saveInfo(sampleone sm) {
	
	return crepo.save(sm);
}

//get
public List<sampleone> getDet()
{
	return crepo.findAll();
}

//update
public sampleone updateInfo(sampleone iu)
{
	return crepo.saveAndFlush(iu);
}

//delete
public void deleteInfo(int cid)
{
	crepo.deleteById(cid);
}

//sort by ascending
public List<sampleone> sortAsc(String brand)
{
	return crepo.findAll(Sort.by(brand).ascending());
}
}
