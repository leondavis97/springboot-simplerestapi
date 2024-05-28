package com.application.springbootapi.controller;

import org.springframework.web.bind.annotation.RestController;

import com.application.springbootapi.model.User;
import com.application.springbootapi.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class RestApiController {
    
    @Autowired
    private UserService userService;

    @GetMapping("/users/{id}")
    public User getMethodName(@PathVariable String id) {
        return userService.getUserbyId(id);
    }

    @PostMapping("/users")
    public User postMethodName(@RequestBody User user) {
        return userService.saveUser(user);
    }

}
