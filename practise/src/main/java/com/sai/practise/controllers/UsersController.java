package com.sai.practise.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sai.practise.domain.User;
import com.sai.practise.service.UserService;

@RestController
public class UsersController {
	
	@Autowired
	private UserService userService;
	
	
	@GetMapping(value = "/api/v1/user")
	public User getUser(@RequestParam(name = "id") String id) {
		int intId = Integer.parseInt(id);

		
		return userService.getUser(intId);
		
	}
	
	@PostMapping(value = "/api/v1/user2")
	public User createUser(@RequestBody User user) {
		System.out.println(user.getFirstName());
		return user;
		
	}
	

	
	

}
