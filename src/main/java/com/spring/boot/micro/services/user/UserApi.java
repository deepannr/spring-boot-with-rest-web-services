package com.spring.boot.micro.services.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
class UserApi {
	
	@Autowired
	private UserService userService;
	
	@GetMapping (path = "/all")
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}
	
	@GetMapping (path = "/find/{id}")
	public User getUser(@PathVariable int id) {
		return userService.getUser(id);
	}
	
	@PostMapping("/add")
	public void addUser(@RequestBody User user) {
		userService.addUser(user);
	}
}
