package com.greenfoxacademy.baloghdominik.programmerfoxclub.services;

import com.greenfoxacademy.baloghdominik.programmerfoxclub.models.User;
import com.greenfoxacademy.baloghdominik.programmerfoxclub.repositories.UserRepository;
import com.greenfoxacademy.baloghdominik.programmerfoxclub.temp.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User login(String username) {
        User user = userRepository.findOne(username);
        if (user != null) {
            Util.loggedInUser = user;
        }
        return user;
    }

    @Override
    public User getUser(String username) {
        User user = userRepository.findOne(username);
        return user;
    }
}
