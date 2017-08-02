package com.application.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppAuthorizationAction {
	
	    @RequestMapping("/AppAuthorizationAction/getAuthorizationAction")  
	    public ModelAndView getUserAuthorization(HttpServletRequest request, HttpServletResponse response,Model model) {   
	        return new ModelAndView("login");  
	    }
	    
	    @RequestMapping(value="/getValidAuthorizationAction",method = RequestMethod.GET)  
	    public ModelAndView getValidUserAuthorization(HttpServletRequest request, HttpServletResponse response,Model model) {   
	        return new ModelAndView("home");  
	    }
	    
	    

}
