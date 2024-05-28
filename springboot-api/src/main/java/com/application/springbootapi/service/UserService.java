package com.application.springbootapi.service;

import org.springframework.stereotype.Service;

import com.application.springbootapi.model.User;

@Service
public class UserService {

    public User getUserbyId(String userId) 
    {
        return new User(userId,"Tom","22","tom@tom.de");
    }

    public User saveUser(User user) {
        System.out.println(user.toString());
        return user;
    }
}
