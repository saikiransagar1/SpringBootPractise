package com.sai.practise.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sai.practise.command.AddUserCommand;
import com.sai.practise.command.DeleteUserCommand;
import com.sai.practise.command.GetUserCommand;
import com.sai.practise.domain.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private GetUserCommand getUserCommand;
	
	@Autowired
	private AddUserCommand addUserCommand;
	
	@Autowired
	private DeleteUserCommand deleteUserCommand;

	@Override
	public User getUser(int id) {

		return getUserCommand.getUser(id);
	}
	
	public void addUser(User user) {
		
		addUserCommand.addUser(user);
		
	}
	
public void deleteUser(int id) {
		
		deleteUserCommand.deleteUser(id);
		
	}
	
	

}
