package com.spring.ml.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.ml.model.MemberRequestDto;

@Controller
public class TestController {

	@RequestMapping(value = "/go500")
	public String error() {
		
		int a = 0 ;
		int b = a/a;
		
		return "views/test2";
		
	}
	

	@PostMapping(value = "/validCheck")
	public String validCheck(@RequestBody @Valid MemberRequestDto memberRequestDto) {
		
		return "views/test2";
		
	}
	
	 
}
