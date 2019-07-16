package com.sai.practise.command;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sai.practise.domain.User;

@Component
public class GetUserCommand {
	
	@Autowired
	private UserCache userCache;
	
	
	
	public User getUser(int id) { 
		
		return userCache.getUser(id);
		
		
	}

}
