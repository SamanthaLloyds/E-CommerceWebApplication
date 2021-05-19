package com.sw409.FairfieldUstore.DBO;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sw409.FairfieldUstore.Database.DatabaseService;
import com.sw409.FairfieldUstore.models.User;

@Service
public class UserDBOService {

	private DatabaseService databaseService;
	
	public UserDBOService() {
		databaseService = new DatabaseService();
	}
	
	public int findUserId(User user) {
		return databaseService.findUserId(user);
	}
		
	public User findUser(String username){
		return databaseService.findUserFromUsername(username);
	}
}