package com.sample.pieceone.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sample.pieceone.Repository.CarRepo;
import com.sample.pieceone.Service.CarService;
import com.sample.pieceone.sanjith.sampleone;

@RestController
public class CarController {
  @Autowired
  public CarService cserv;
  public CarRepo cre;
  @PostMapping("/saveJdm")
  public sampleone addDetails(@RequestBody sampleone sm)
  {
	  return cserv.saveInfo(sm);
  }
  
  @GetMapping("/getJdm")
  public List<sampleone> getDetails()
  {
	  return cserv.getDet();
  }
  
  @PutMapping("/updateJdm")
  public sampleone updateDetails(@RequestBody sampleone jd)
  {
	  return cserv.updateInfo(jd);
  }
  
  @DeleteMapping("/deleteJdm/{jdslip}")
  public String deleteDetails(@PathVariable("jdslip")int cid)
  {
	  cserv.deleteInfo(cid);
	  return "Car ID "+cid+" Deleted";
  }
  
  //sort
  @GetMapping("/sortAsc/{brand}")
  public List<sampleone> sortCar(@PathVariable("brand")String brand)
  {
	  return cserv.sortAsc(brand);
  }
  
  //pagination
  @GetMapping("/pagi/{pnu}/{psize}")
  public List<sampleone> paginationData(@PathVariable("pnu") int pnu, @PathVariable("psize") int psize)
  {
	  return cserv.paginationAndSorting(pnu, psize);
  }
  
  //pagination and sorting
  @GetMapping("/paginationSorting/{pnu}/{psize}/{pname}")
  public List<sampleone> paginationSorting(@PathVariable("pnu") int pnu, @PathVariable("psize") int psize, @PathVariable("pname") String pname)
  {
	  return cserv.paginationAndSorting(pnu, psize, pname);
  }
  //
  /*
  @GetMapping("/getRepo")
  public List<sampleone> getAll()
  {
	  return cre.getAllData();
  }
  
  @GetMapping("/getRepoId/{id}")
  public List<sampleone> byId(@PathVariable("id")int id)
  {
	  return cre.byCName(id);
  }
  @PutMapping("/putRepo/{brand}/{id}")
  public String updateDetails(@PathVariable("name") String bname,@PathVariable("id")int cid)
  {
	  cre.updateDetails(bname, cid);
	  return "Updated";
  }
  @DeleteMapping("deleted/{id}/{model}")
  public String deleteDetails(@PathVariable("id")int cid,@PathVariable("model")String model)
  {
	  cre.deleteDetails(cid, model);
	  return "Deleted";
  }
  */
}
