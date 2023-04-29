package com.sample.pieceone.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.pieceone.Repository.reposit;
import com.sample.pieceone.sanjith.model;

@Service
public class service {
	@Autowired
	private reposit mrepo;
	
	public String checkLogin(String uname, String pwd) {
	    model user = mrepo.findByuname(uname);
	    if (user == null) {
	      return "no user found";
	    }
	    else{
	    	if(user.getPwd().equals(pwd)) {	    		
	    		return"Login Succesfull"; 
	    	}
	    	else {
	    		return "Login Failed";
	    	}
	    }
	}
	public model addUser(model game) {
		return mrepo.save(game);
	}
	public List<model> getUser()
	{
		return mrepo.findAll();
	}
}
