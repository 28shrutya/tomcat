package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Homecontroller {
	
	List<User>users= new ArrayList<User>();

		@RequestMapping(value="/Register")
  public String newuser(@ModelAttribute User u,Model m)
		
		{
		 
			users.add(u);
		  return "login";
	   }
		
@RequestMapping(value="/login")
public String logincheck(@RequestParam String userName, @RequestParam String password,Model m)
		{
		 
	     for(User u:users)
			{
				if(u.getUserName().equals(userName) && u.getPassword().equals(password))
				{
					  m.addAttribute("data", users);
					return "success";
					
				}
			}
	           
			return "NPF";
			
	}
//@RequestMapping(value="/name")
//public String name()
//{
//	return "searchby";
//}

		
 @RequestMapping(value="/searchbyname")
public String searchbyname(@RequestParam ("name") String name,Model m)
		{
	        List<User>dupliuser= new ArrayList<>();
	        
	    int f=0;
	 	System.out.println(name);
			for(User u:users)
			{
				if(u.getName().equalsIgnoreCase(name))
				{
					String a= u.getName();
					String b= u.getUserName();
					String c= u.getMobNo();
					String d= u.getEmail();
					
					m.addAttribute("name", a);
					m.addAttribute("usern", b);
					m.addAttribute("mobno", c);
					m.addAttribute("email", d);
					
				
					
					
				}
				f=1;
			}
			if(f==1)
			{
				return "showsingledata";
			}
			return "NPF";
	
		}
 
 
 @RequestMapping(value="/searchbyemail")
 public String searchbyemail(@RequestParam ("email") String email,Model m)  //request param string name same as sinput text name
 		{
 	 	System.out.println(email);
 			for(User u:users)
 			{
 				if(u.getName().equalsIgnoreCase(email))
 				{
 					String a= u.getName();
 					String b= u.getUserName();
 					String c= u.getMobNo();
 					String d= u.getEmail();
 					
 					m.addAttribute("name", a);
 					m.addAttribute("usern", b);
 					m.addAttribute("mobno", c);
 					m.addAttribute("email", d);
 					
 				
 					return "showsingledata";
 					
 				}
 			}
 			return "NPF";
 	
 		}


 @RequestMapping(value="/searchbymobNo")
 public String searchbymobNo(@RequestParam ("mobNo") String mobNo,Model m)  //request param string name same as sinput text name
 		{
 	 	System.out.println(mobNo);
 			for(User u:users)
 			{
 				if(u.getName().equalsIgnoreCase(mobNo))
 				{
 					String a= u.getName();
 					String b= u.getUserName();
 					String c= u.getMobNo();
 					String d= u.getEmail();
 					
 					m.addAttribute("name", a);
 					m.addAttribute("usern", b);
 					m.addAttribute("mobno", c);
 					m.addAttribute("email", d);
 					
 				
 					return "showsingledata";
 					
 				}
 			}
 			return "NPF";
 	
 		}

		
		@RequestMapping("**")
		public String Nopagefound()
		{
			return "NPF";
			
		}
		
		@RequestMapping("/")
		public String prelogin()
		{
			return "login";
			
		}
	

}
