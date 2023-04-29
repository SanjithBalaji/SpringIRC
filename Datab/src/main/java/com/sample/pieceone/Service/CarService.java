package com.sample.pieceone.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
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

//pagination
public List<sampleone> paginationAndSorting(int pageNu, int pageSize)
{
	Page<sampleone> p=crepo.findAll(PageRequest.of(pageNu, pageSize));
	return p.getContent();
}

//pagination and sorting
public List<sampleone> paginationAndSorting(int pageNu, int pageSize, String pname)
{
	Page<sampleone> p=crepo.findAll(PageRequest.of(pageNu, pageSize, Sort.by(pname).descending()));
	return p.getContent();
}
}
