package com.greenfoxacademy.baloghdominik.programmerfoxclub.factories;

import com.greenfoxacademy.baloghdominik.programmerfoxclub.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserFactory {

    @Autowired
    public UserFactory() {

    }

    public User createUser(String username) {
        User user = new User(username);

        return user;
    }

}
