package com.example.springbootdocker.controller;

import com.example.springbootdocker.entity.User;
import com.example.springbootdocker.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;
	
	@PostMapping("/addUser")
	public String saveUser(@RequestBody User emp) {
		userRepository.save(emp);
		return "User added successfully::"+emp.getId();
		
	}
	
	@GetMapping("/users")
	public List<User> getUsers() {
		return userRepository.findAll();
	}

	@GetMapping("/findUser/{id}")
	public Optional<User> getUser(@PathVariable Long id) {
		return userRepository.findById(id);
	}
	
	@GetMapping("/deleteUser/{id}")
	public String deleteUser(@PathVariable Long id) {
		userRepository.deleteById(id);
		return "Deleted User Successfully::"+id;
	}
	

}
