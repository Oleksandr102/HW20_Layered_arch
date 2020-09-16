package com.example.demo.controllers;

import com.example.demo.dao.NoteDao;
//import com.example.demo.dao.UserDao;
import com.example.demo.models.Note;
//import com.example.demo.models.User;
import com.example.demo.services.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "/login")
public class AuthenticationController {
//    @Autowired
//    private UserDao userDao;

//    @Autowired
//    private NoteService noteService;
    @Autowired
    private NoteDao noteDao;

    @GetMapping(path = "/test", produces = "application/json")
    public Note getUsers(){
        return (Note) noteDao.findAllById(1l);
    }

}
