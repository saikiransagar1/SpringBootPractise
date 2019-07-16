package com.sai.practise.service;

import com.sai.practise.domain.User;

public interface UserService {
	
	public User getUser(int id);
	
	public void addUser(User user);
	
	public void deleteUser(int id);

}
