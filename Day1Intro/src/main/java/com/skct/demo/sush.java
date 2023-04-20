package com.skct.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class sush {
	@Value("${sname:ugly}")
	private String name ;
	@Value ("guy")
	private String usage;
	String code="you" ;
	@RequestMapping("/")
	@ResponseBody
	public String Display()
	{
		return "Welcome "+" "+ code+" "+ name+" "+ usage ;
	}

}
