package com.example.demo.controllers;

import com.example.demo.dao.UserDao;
import com.example.demo.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "/users")
public class AuthenticationController {
    @Autowired
    private UserDao userDao;

    @GetMapping(path = "/", produces = "application/json")
    public User getUsers(){
        return (User) userDao.findAll();
    }

}
