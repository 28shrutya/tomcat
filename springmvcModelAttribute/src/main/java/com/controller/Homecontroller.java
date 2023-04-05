package com.controller;


	
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
	import org.springframework.web.bind.annotation.RequestMapping;

	

	@Controller
	public class Homecontroller {
		
		@RequestMapping(value=" /login")
		public String logincheck(@ModelAttribute User u )
		{
			System.out.println(u.getUserName());
			System.out.println(u.getPassword());
			return "success";	
		

}
}
	