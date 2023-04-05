package com.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
@RequestMapping(value="/login")
public String logincheck(@RequestParam String username,@RequestParam String password,Model m) {
	
 if(username.equals("ADMIN") && password.equals("ADMIN"))
	   {
		List<Student>list=hsi.getStudents();
		m.addAttribute("data", list);
		  return "success";
		}
   else
     {
	   List<Student>list=hsi.logincheck(username,password);
	      if(!list.isEmpty()) {
	    	  m.addAttribute("data", list);
	    	  return "success";
	      
	          }
	      else { 
                   return "login";
	            }
     }
}




@RequestMapping(value="/delete")
public String deleteStudent(@RequestParam int rollno,Model m)
{
	hsi.deletestudent(rollno);
	List<Student>list=hsi.getStudents();
	m.addAttribute("data", list);
	return "success";
	
}
@RequestMapping(value="/edit")
public String editstudent(@RequestParam int rollno,Model m)
{
	       Student s =hsi.editstudent(rollno);
	       m.addAttribute("s", s);
	       return "edit";
}

@RequestMapping(value="/update")
public String updatestudent(@ModelAttribute Student s,Model m)
{
	hsi.updatestudent(s);
	List<Student>list=hsi.getStudents();
	m.addAttribute("data", list);
	return "success";
}
}
	

	
