package com.spring.ml;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@SpringBootApplication
public class MoistLifeApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoistLifeApplication.class, args);
	}

}
