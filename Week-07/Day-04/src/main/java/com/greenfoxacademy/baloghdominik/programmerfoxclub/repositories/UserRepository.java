package com.greenfoxacademy.baloghdominik.programmerfoxclub.repositories;

import com.greenfoxacademy.baloghdominik.programmerfoxclub.models.User;
import org.springframework.stereotype.Component;

@Component
public interface UserRepository {

    User findOne(String username);

}
