package com.controller;


	
	import org.springframework.stereotype.Controller;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.servlet.DispatcherServlet;
	import org.springframework.web.servlet.view.InternalResourceViewResolver;
	@Controller
	public class Hellocontroller {
		
		@RequestMapping(value = "/hello")
		public String hello() {
			System.out.println("in hello controller class method");
			return "welcometospring";
		}
		

	}


