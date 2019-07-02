package com.spring.ml.config;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Interceptor extends HandlerInterceptorAdapter{

	
	/**
	 * 컨트롤러 실행 직전에 동작. ( true => 정상실행, false => 컨트롤러 진입 X )
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		log.info("Interceptor > preHandle : 컨트롤러 실행 직전");
		return true;
	}

	/**
	 * 컨트롤러 진입 후 view가 랜더링 되기 전에 동작 ( 매개변수 modelAndView를 통하여 데이터 조작 가능 ) 
	 */
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		log.info("Interceptor > postHandle : 진입 후 ");
	}

	/**
	 * 컨트롤러 진입 후 view 랜더링 이후 제일 마지막에 실행되는 메서드
	 */
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object object, Exception arg3)
			throws Exception {
		log.info("Interceptor > afterCompletion : 제일마지막 ");
	}
	
	/**
	 * 비동기 요청시 postHandle, afterCompletion 수행하지않고 afterConcurrentHandlingStarted 수행.
	 */
	@Override
	public void afterConcurrentHandlingStarted(HttpServletRequest request, HttpServletResponse response, Object handler)
	{
		log.info("Interceptor > afterConcurrentHandlingStarted : 비동기처리");
	}
	    
}
