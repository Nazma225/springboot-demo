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
	
	@Value("${my.address.is}")
	private String address;
	
	@Value("${my.tech.is}")
	private String technology;
	
	@GetMapping
	public String sayHello() {
		return "Hello "+name+"!!"+", your address is:"+address+"and you work on "+technology;
	}

}
