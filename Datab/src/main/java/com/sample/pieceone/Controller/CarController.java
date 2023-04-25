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

import com.sample.pieceone.Service.CarService;
import com.sample.pieceone.sanjith.sampleone;

@RestController
public class CarController {
  @Autowired
  public CarService cserv;
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
}
