package com.sai.practise;

import java.util.HashMap;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sai.practise.command.GetUserCommand;
import com.sai.practise.domain.User;

@Configuration
public class PractiseConfiguration {
	
	@Bean
	public GetUserCommand getUserCommand() {
		
HashMap<Integer,User> usersMap= new HashMap<Integer, User>();
		
		User user = new User();
		user.setId(65);
		user.setFirstName("sai");
		user.setLastName("sagar");
		
		usersMap.put(user.getId(), user);
		return new GetUserCommand(usersMap);
	}

}
