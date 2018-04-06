package com.greenfoxacademy.baloghdominik.programmerfoxclub.services;

import com.greenfoxacademy.baloghdominik.programmerfoxclub.models.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    User login(String username);
    User getUser(String username);

}
