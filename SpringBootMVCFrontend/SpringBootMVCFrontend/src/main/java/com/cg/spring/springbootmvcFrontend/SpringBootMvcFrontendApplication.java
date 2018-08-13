package com.cg.spring.springbootmvcFrontend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.cg.spring")
public class SpringBootMvcFrontendApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMvcFrontendApplication.class, args);
	}
}
