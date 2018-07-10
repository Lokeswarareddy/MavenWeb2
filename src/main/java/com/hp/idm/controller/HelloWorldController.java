package com.hp.idm.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
	
	@RequestMapping("/hello")
	public ModelAndView showMessage(HttpServletRequest req,HttpServletRequest res){
		String name=req.getParameter("name");
		String message = "Welcome to Spring MVC!";
		
		ModelAndView mav=new ModelAndView("helloWorld");
		mav.addObject("message",message);
		mav.addObject("name",name);
		return mav;
	}
	
	

}
