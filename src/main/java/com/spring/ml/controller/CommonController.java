package com.spring.ml.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CommonController {

	
	@RequestMapping(value = "/", method = RequestMethod.GET)
    public String test() {
    		
    	return "views/test";
    }
	
	
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test2() {
    		
    	return "views/test2";
    }
}
