package com.example.demo;

import com.example.demo.controllers.NoteController;
import com.example.demo.services.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Executor {
    private NoteService noteService;
    private final NoteController noteController;
    private final int memoSize = 8;
    private final String skip = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n";


    @Autowired
    public Executor(NoteService noteService, NoteController noteController) {
        this.noteService = noteService;
        this.noteController = noteController;
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
        noteController.getByMake("make");
        margin();
        System.out.println(skip + "Laptops with RAM 8+");
        noteController.getByMemo(memoSize);
        margin();
        System.out.println(skip + "Used laptops");
        noteController.getAllUsedNotes(true);
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
