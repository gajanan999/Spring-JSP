package com.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GeneralController {

	
	
	 @RequestMapping("/fileupload")  
	    public ModelAndView helloWorld() {  
	       // String message = "Hello World, Spring MVC @ Javatpoint";  
	        return new ModelAndView("upload");  
	    } 
}
