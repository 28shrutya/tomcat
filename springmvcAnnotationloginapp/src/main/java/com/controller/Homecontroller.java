package com.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Controller
public class Homecontroller {
	
	@RequestMapping(value="/login")
	public String logincheck( @RequestParam("userName") String u,@RequestParam("password") String p)
	{
		System.out.println(u);
		System.out.println(p);
		return "success";
		
	}
	
	


}
