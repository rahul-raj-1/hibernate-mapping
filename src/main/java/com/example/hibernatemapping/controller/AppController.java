/**
 * 
 */
package com.example.hibernatemapping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author RAHUL-PC
 *
 */
@Controller
public class AppController {


	  @RequestMapping("/")
      public String home()
	{
		return "home.jsp";
	
		
		
		
	}
	
	
	
	
}
