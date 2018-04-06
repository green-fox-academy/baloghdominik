package com.greenfoxacademy.baloghdominik.programmerfoxclub.repositories;

import com.greenfoxacademy.baloghdominik.programmerfoxclub.models.User;
import com.greenfoxacademy.baloghdominik.programmerfoxclub.temp.UserDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserRepositoryImpl implements UserRepository {

    private UserDB userDB;

    @Autowired
    public UserRepositoryImpl(UserDB userDB) {
        this.userDB = userDB;
    }

    @Override
    public User findOne(String username) {

        for (User user : userDB.USERS) {
            if (user.getName().equals(username)) {
                return user;
            }
        }

        return null;
    }
}