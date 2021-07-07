package com.springboot.project1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

 
@SpringBootApplication
@ComponentScan({"com.springboot.controller", "com.springboot.service"})
@EntityScan("com.springboot.entity")
@EnableJpaRepositories("com.springboot.repository")
public class Project1Application {

	public static void main(String[] args) {
		  SpringApplication.run(Project1Application.class, args);
	
		System.out.println("Hello My springboot");
		
		 
	}

}
