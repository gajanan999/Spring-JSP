package com.application.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.application.core.User;

@Controller
public class LoginController {

	@Autowired
	User usr;
	
	@RequestMapping(value="/login",method = RequestMethod.GET)
	public String dologin1(HttpServletRequest request, HttpServletResponse response,Model model)
	{
		String name=request.getParameter("userID");  
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
	             return "error";  
	         }  
		
		
	
	}
	
}
