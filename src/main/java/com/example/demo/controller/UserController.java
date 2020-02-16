package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Users;
import com.example.demo.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;
	
	@Value("${msg:test}")
	private String msg;

	@Value("${thread.pool:2}")
	private int threadPoolSize;

	@GetMapping
	public String getStart() {
		return " started ......................";
	}

	@RequestMapping("/getAll")
	public List<Users> getAllUsers() {
		return userService.getAllUsers();
	}

//	@PostMapping("/saveUser")
//	public ResponseEntity<List<Users>> saveUser(@Valid @RequestBody Users user) {
//
//		List<Users> users = userService.saveUser(users);
//		if (users.isEmpty()) {
//			return ResponseEntity.notFound().build();
//		}
//
//		return new ResponseEntity<>(users, HttpStatus.OK);
//	}

}