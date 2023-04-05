package com.controller;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import com.model.Student;
import com.servicei.HomeserviceI;

@Controller
public class Homecontroller{
	
	
	@Autowired
	HomeserviceI hsi;
	
@RequestMapping(value="/")
public String prelogin()
	{
		System.out.println("open login page");
		return "login";
		
	}
	
@RequestMapping(value="/openregisterpage")
public String preRegister()
	{
		System.out.println("register login page");
		
		return "register";
			
	}
	
@RequestMapping(value="/save")
public String savestudent(@ModelAttribute Student s)
	{
		hsi.savestudent(s);
		
		return "login";
		
	 }
	
}
	

	
