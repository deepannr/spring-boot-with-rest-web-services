package com.spring.boot.micro.services.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

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
	
	@GetMapping(path = "/returnPathVariable/{name}")
	public String returnPathVariable(@PathVariable String name) {
		return "Hello " + name;
	}
}
