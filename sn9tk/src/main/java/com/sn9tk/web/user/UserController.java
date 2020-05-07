package com.sn9tk.web.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired UserService userService;
	
	@GetMapping("")
	public List<User> list(){
		System.out.println(userService.findAll());
		return userService.findAll();
	}

}
