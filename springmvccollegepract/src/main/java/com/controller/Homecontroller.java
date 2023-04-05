package com.controller;



	import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.DispatcherServlet;
	import org.springframework.web.servlet.view.InternalResourceViewResolver;
	
	@Controller
	public class Homecontroller {	
		
//		@RequestMapping(value = "/")  default mapping..if web.xml pe page ko mention nahi kiya 
//		public String admin() {            to default mapping karke error solve kar sakte hai
//			return "Admin";
//		}
		
		@RequestMapping(value = "/As")
		public String addStu() {
			System.out.println("in Student");
			return "studentregs";
		}
		
		@RequestMapping(value = "/studentReg")
		public String stuRegistered(@RequestParam("studentName") String s,@RequestParam("password") String p,Model m) {
		  
		   m.addAttribute("studentName", s);
		   m.addAttribute("password", p);
		   
			return "success";
		}
		
		@RequestMapping(value = "/AT")
		public String addTea() {
			System.out.println("in Teacher");
			return "TeacherReg";
		}
		
		@RequestMapping(value = "/teacherReg")
		public String teaRegistered(@RequestParam("TeacherName") String s,@RequestParam("password") String p,Model m) {
		  
		   m.addAttribute("TeacherName", s);
		   m.addAttribute("password", p);
		   
			return "success2";
		}
	}


	
	

