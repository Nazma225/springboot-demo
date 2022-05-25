package com.training.basic.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootDemoApplication {

	public static void main(String[] args) {
		System.out.println("Hello Springboot!!");
		SpringApplication.run(SpringbootDemoApplication.class, args);
	}

}
