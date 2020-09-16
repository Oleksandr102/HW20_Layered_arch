package com.example.demo;

import com.example.demo.services.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class Executor {
    private NoteService noteService;
    private int memosize = 8;
    private String skip = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n";
//    public Scanner scanner = new Scanner(System.in);

    @Autowired
    public Executor(NoteService noteService) {
        this.noteService = noteService;
    }

//    @Autowired
//    private AuthenticationManager authenticationManager;

    public void start() {
//        System.out.println("Enter login:");
//        String userLogin = scanner.nextLine();
//        System.out.println("Enter your password");
//        String userPassword = scanner.nextLine();
//        UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(userLogin, userPassword);
//        try {
//            authenticationManager.authenticate(token);
//            System.out.println("Login successful!");
//        } catch (BadCredentialsException e) {
//            System.out.println("Bad credentials!");
//        }
        noteService.addNoteData();
        margin();
        System.out.println("Laptop list:");
        noteService.printAll();
        margin();
        System.out.println(skip + "Laptops by make:");
        noteService.printByMake("make");
        margin();
        System.out.println(skip + "Laptops with RAM 8+");
        noteService.printByMemoSize(memosize);
        margin();
        System.out.println(skip + "Used laptops");
        noteService.printUsed(true);
        margin();
//        exit();
    }

    public void margin() {
        System.out.println();
    }

    public void exit() {
        System.exit(0);
    }
}
