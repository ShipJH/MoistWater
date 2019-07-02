package com.spring.ml.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	@RequestMapping(value = "/go500")
	public String error() {
		
		int a = 0 ;
		int b = a/a;
		
		return "views/test2";
		
	}
	 
}
