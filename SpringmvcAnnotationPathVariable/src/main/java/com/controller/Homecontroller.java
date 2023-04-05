package com.controller;


 import org.springframework.stereotype.Controller;

	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.RequestMapping;
	
  import org.springframework.web.servlet.DispatcherServlet;
	import org.springframework.web.servlet.view.InternalResourceViewResolver;

	@Controller
	public class Homecontroller {
		
		@RequestMapping(value=" /login /{username} /{password}")
		public String logincheck( @PathVariable("username") String u, @PathVariable("password") String p)
		{
			System.out.println(u);
			System.out.println(p);
			return "success";
			
		

}
}