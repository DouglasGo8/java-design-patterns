package com.udemy.java.design.patterns.solid.single.responsability.handson;

import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.SneakyThrows;

public class JsonParser {

	
	@SneakyThrows
	public User jsonToUserPojo(String json) {
		var user = new ObjectMapper().readValue(json, User.class);
		System.out.print(user);
		return user;
	}
	
}
