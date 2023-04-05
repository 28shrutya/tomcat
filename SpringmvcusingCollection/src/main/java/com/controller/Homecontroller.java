package com.controller;

import java.util.ArrayList;


import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Homecontroller {
	
	@RequestMapping(value="/login")
	public String logincheck(@ModelAttribute User u,Model m)
	
	{
		
				m.addAttribute("u", u);
				
		
		
		return "success";
		
		
		
	}
	
}
