package com.sai.practise.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sai.practise.command.GetUserCommand;
import com.sai.practise.domain.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private GetUserCommand getUserCommand;

	@Override
	public User getUser(int id) {

		return getUserCommand.getUser(id);
	}

}
