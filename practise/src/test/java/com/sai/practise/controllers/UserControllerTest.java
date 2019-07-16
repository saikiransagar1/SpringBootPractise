package com.sai.practise.controllers;

import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.HashMap;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.support.BasicAuthorizationInterceptor;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.sai.practise.domain.User;

public class UserControllerTest {

	@Test
	public void testGetUser() {

		RestTemplate restTemplate = new RestTemplate();//call to server

		//restTemplate.getInterceptors().add(new BasicAuthorizationInterceptor("sai", "password"));
		MultiValueMap<String, String> headers = new LinkedMultiValueMap<String, String>();//security to app
		headers.put("Authorization", Arrays.asList("Basic c2FpOnBhc3N3b3Jk"));//
		HttpEntity<HttpHeaders> httpEntity= new HttpEntity<HttpHeaders>(headers);

		 ResponseEntity<User> response;
		response = restTemplate.exchange("http://localhost:8080/user-service/api/v1/user?id=68", HttpMethod.GET,httpEntity ,
				User.class);//Actual call

		User actualUser = response.getBody();

		Assert.assertEquals("ram", actualUser.getFirstName());

	}
	
	@Test
	public void testPostUser() {

		RestTemplate restTemplate = new RestTemplate();//call to server

		//restTemplate.getInterceptors().add(new BasicAuthorizationInterceptor("sai", "password"));
		MultiValueMap<String, String> headers = new LinkedMultiValueMap<String, String>();//security to app
		headers.put("Authorization", Arrays.asList("Basic c2FpOnBhc3N3b3Jk"));//
		User newUser = new User();
		newUser.setFirstName("kiran");
		newUser.setId(61);
		newUser.setLastName("sagar");
		
		HttpEntity httpEntity= new HttpEntity(newUser,headers);

		 ResponseEntity<User> response;
		response = restTemplate.exchange("http://localhost:8080/user-service/api/v1/user", HttpMethod.POST,httpEntity ,
				User.class);//Actual call

		User postUser = response.getBody();

		Assert.assertEquals("kiran", postUser.getFirstName());

	}

}
