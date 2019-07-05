package com.spring.ml.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class ErrorController implements org.springframework.boot.web.servlet.error.ErrorController {
	
	private static final String PATH = "/errors";
	
	@Override
	public String getErrorPath() {
		return PATH;
	}
	
	@RequestMapping(value = PATH)
	public String error(HttpServletRequest request, Model model) {
		
		Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);

		log.debug(status.toString());
		
		if(String.valueOf(status).equals(String.valueOf(HttpStatus.NOT_FOUND.value()))) {
			return "views/errors/error404";
		}else if(String.valueOf(status).equals(String.valueOf(HttpStatus.INTERNAL_SERVER_ERROR.value()))) {
			return "views/errors/error500";			
		}
		
		return "views/errors/error500";
		
	}

}
