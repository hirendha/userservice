package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Users;
import com.example.demo.repo.UserRepository;


@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

	public List<Users> getAllUsers() {
		return (List<Users>) userRepository.findAll();
	}

//	public List<Users> saveUser(Users users) {
//		userRepository.save(users);
//		return (List<Users>) userRepository.findAll();
//	}

}
