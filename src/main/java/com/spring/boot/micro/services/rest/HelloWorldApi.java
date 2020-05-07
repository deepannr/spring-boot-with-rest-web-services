package com.spring.boot.micro.services.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.micro.services.data.HelloWorldBean;

@RestController
public class HelloWorldApi {

	@GetMapping(path = "/hello")
	public String helloWorld() {
		return "Hello";
	}
	
	@GetMapping(path = "/returnBean")
	public HelloWorldBean returnBean() {
		return new HelloWorldBean("DeeSb");
	}
}
