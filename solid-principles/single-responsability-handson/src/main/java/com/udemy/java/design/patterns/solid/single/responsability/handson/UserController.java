package com.udemy.java.design.patterns.solid.single.responsability.handson;

/**
 * @author dbatista
 * @apiNote applied single responsibility principle
 */
public class UserController {

	public String createUser(final String userJson) {

		var jsonValidator = new JsonParser();
		var userValidator = new UserValidator();
		//
		final User user = jsonValidator.jsonToUserPojo(userJson);
		//
		var isValid = userValidator.validateUser(user);

		if (!isValid)
			return "ERROR";

		return "SUCCESS";
	}

}