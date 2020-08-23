package com.udemy.java.design.patterns.solid.intf.segregation.handson;

import java.util.HashMap;
import java.util.Map;

public class UserPersistentService implements PersistentService<User> {

    private static final Map<Long, User> USERS = new HashMap<>();

    @Override
    public void save(User entity) {
        USERS.put(entity.getId(), entity);
    }

    @Override
    public void someUserMethod() {

    }
}
