package com.application.controller;


import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.application.core.User;

@Controller
public class LoginController {
	
	@Autowired
	User usr;
	
	@RequestMapping("/login") 
	 public ModelAndView doLogin(HttpServletRequest request, HttpServletResponse response)
	{
		 String name=request.getParameter("name");  
	     String password=request.getParameter("password");
	    
	     usr.setUserID(name);
	     usr.setPassword(password);
	     PDDocument doc = new PDDocument(); 
	     
	     
	     
	     ModelAndView modelAndView=new ModelAndView();
	     modelAndView.addObject("user", usr);
	     
	     if(password.equals("admin")){  
	         String message = "HELLO "+name;  
	         return  new ModelAndView("hellopage", "message", message);  
	       }  
	     else{  
	             return new ModelAndView("errorpage", "message","Sorry, username or password error");  
	         }  
		
	 	
	}
	
	@RequestMapping(value="/register",method = RequestMethod.GET)
	public String dologin1(HttpServletRequest request, HttpServletResponse response,Model model)
	{
		String name=request.getParameter("name");  
	     String password=request.getParameter("password");
	    
	     usr.setUserID(name);
	     usr.setPassword(password);
	     
	  
	     model.addAttribute("user", usr);
	     System.out.println(name + " "+password);
	     if(password.equals("admin")){  
	         String message = "HELLO "+name;  
	      
	         model.addAttribute("message", message);
	         return  "hellopage";  
	       }  
	     else{  
	    	
	    	 model.addAttribute("message", "Sorry username and password is wrong !" );
	             return "errorpage";  
	         }  
		
		
	
	}
	
	

}
