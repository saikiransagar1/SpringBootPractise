package com.sai.practise.command;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.sai.practise.domain.User;


public class GetUserCommand {
	
	private Map<Integer, User> usersMap;
	
	
	public GetUserCommand(Map<Integer, User> usersMap) {
		
		this.usersMap = usersMap;
		
		
	}
	public User getUser(int id) { 
		
		return usersMap.get(id);
		
		
	}

}
