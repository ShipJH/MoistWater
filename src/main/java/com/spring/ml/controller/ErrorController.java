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

		log.info(status.toString());
		log.info(String.valueOf(status));
		log.info(String.valueOf(HttpStatus.INTERNAL_SERVER_ERROR.value()));
		log.info(HttpStatus.INTERNAL_SERVER_ERROR.toString());
		log.info(HttpStatus.NOT_FOUND.toString());
		//TODO: 벨류로 리턴받아오자 ( enum 클래스가 변경 된 것 같다.. ) 그다음에, valueOf 하자. 
		
		
		if (String.valueOf(status).equalsIgnoreCase(HttpStatus.NOT_FOUND.toString())) {
			return "views/errors/error404";
		} else if (String.valueOf(status).equalsIgnoreCase(HttpStatus.INTERNAL_SERVER_ERROR.toString())) {
			return "views/errors/error500";
		}

		
		
		
		return "views/errors/error500";
		
	}
	 
	 


}
