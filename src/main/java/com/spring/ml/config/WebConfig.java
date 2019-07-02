package com.spring.ml.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import nz.net.ultraq.thymeleaf.LayoutDialect;

//@EnableWebMvc
@Configuration
public class WebConfig implements WebMvcConfigurer{
	
	@Bean
    public LayoutDialect layoutDialect() {
        return new LayoutDialect();
	}

	@Bean
	public RestTemplate restTemplate() {
	    return new RestTemplate();
	}
	
	
	/**
	 * addPathPatterns : 적용할 패턴.
	 * excludePathPatterns : 제외할 패턴.
	 */
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// Always Interceptor
		registry.addInterceptor(new Interceptor())
								.addPathPatterns("/**")
								// .addPathPatterns("/**") //추가적인 패턴도 등록가능.
								.excludePathPatterns("/test")
								.excludePathPatterns("/views/errors/error")
								.excludePathPatterns("/resources/**") // 추가적인 패턴적용가능.
								;
	}
    
}
