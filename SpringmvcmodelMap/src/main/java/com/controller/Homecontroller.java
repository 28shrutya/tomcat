package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Controller
public class Homecontroller {
	
	@RequestMapping(value="/login")
	public String logincheck( @RequestParam("userName") String u,@RequestParam("password") String p,ModelMap m)
	{
		
		m.addAttribute("userName", u);
		m.addAttribute("password", p);
		m.addAttribute("rollno", 10);
		
		
		
		
		return "success";
		
	}
	
	


}
