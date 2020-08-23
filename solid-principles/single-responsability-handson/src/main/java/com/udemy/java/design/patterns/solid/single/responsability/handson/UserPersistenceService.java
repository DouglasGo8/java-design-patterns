package com.udemy.java.design.patterns.solid.single.responsability.handson;

public class UserPersistenceService {

	public void saveUser(final User user) {

		var repo = new UserRepository();
		
		repo.save(user);
		
	}

}
