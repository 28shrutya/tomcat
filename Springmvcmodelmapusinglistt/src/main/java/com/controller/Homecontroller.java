package com.controller;

import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Homecontroller {
	
	@RequestMapping(value="/login")
	public String logincheck(@RequestParam("userName") String u,@RequestParam("password") String p, ModelMap m)
	{
		
		List<String>names= new ArrayList<>();
		
		     names.add(u);
		     names.add(p);
		     
		
				m.addAttribute("name", names);
				
		
		
		return "success";
		
	}
	
}
