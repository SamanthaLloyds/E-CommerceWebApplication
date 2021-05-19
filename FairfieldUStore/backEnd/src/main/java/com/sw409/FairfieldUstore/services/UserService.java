package com.sw409.FairfieldUstore.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sw409.FairfieldUstore.DBO.UserDBOService;
import com.sw409.FairfieldUstore.models.User;
import com.sw409.FairfieldUstore.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	UserDBOService userDBOService;
	
	public User create(User user) {
		return userRepository.save(user);
	}
	
	public User find(User user) {
		int userId = userDBOService.findUserId(user);
		if(userId == 0) {
			user.setId(userId);
			return user;
		}
		else {
			return findByID(userId);
		}
	}


	public void update(User user) {
		userRepository.save(user);
	}
	
	public User findUser(String username){
		return userDBOService.findUser(username);
	}
	
	private User findByID(Integer userId) {
		return userRepository.findById(userId).get(); 
	}
	
	
}
