package com.training.basic.springbootdemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {
	
	@Value("${my.name.is}")
	private String name;
	
	@GetMapping
	public String sayHello() {
		return "Hello "+name+"!!";
	}

}
