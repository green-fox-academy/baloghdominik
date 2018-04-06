package com.greenfoxacademy.baloghdominik.programmerfoxclub.temp;

import com.greenfoxacademy.baloghdominik.programmerfoxclub.factories.UserFactory;
import com.greenfoxacademy.baloghdominik.programmerfoxclub.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class UserDB {

    private UserFactory userFactory;
    public final List<User> USERS;

    @Autowired
    public UserDB(UserFactory userFactory) {
        this.userFactory = userFactory;
        USERS = new ArrayList<>(
                Arrays.asList(userFactory.createUser("Green"),
                userFactory.createUser("Gizi")
                ));
    }

}