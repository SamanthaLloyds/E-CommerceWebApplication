package com.sw409.FairfieldUstore.controllers;

import java.security.Principal;
import java.util.Base64;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sw409.FairfieldUstore.models.User;
import com.sw409.FairfieldUstore.services.UserService;

@RestController
@CrossOrigin("*")
public class UserController {
	
	@Autowired
	 UserService userService;

	@PostMapping("api/v1/login")
	public User login(@RequestBody User user) {
		return userService.find(user);
				//user.getUserName().equals("user") && user.getPassword().equals("password");
	}

//	@RequestMapping("/user")
//	public Principal user(HttpServletRequest request) {
//		String authToken = request.getHeader("Authorization").substring("Basic".length()).trim();
//		return () -> new String(Base64.getDecoder().decode(authToken)).split(":")[0];
//	}
	
	@GetMapping("api/v1/findUser/{username}")
	public User findUser(@PathVariable("username") String username) {
		return userService.findUser(username);
	}

}