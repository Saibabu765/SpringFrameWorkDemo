package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example.demo")
public class BeanConfig {

//	@Bean
//	public Doctor doctor() {
//		return new Doctor();
//	}

	@Bean
	public Nurse nurse() {
		return new Nurse();
	}
}
