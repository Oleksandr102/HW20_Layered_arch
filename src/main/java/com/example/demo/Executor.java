package com.example.demo;

import com.example.demo.services.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Executor {
    private NoteService noteService;
    private int memosize = 8;
    private String skip = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n";

    @Autowired
    public Executor(NoteService noteService) {
        this.noteService = noteService;
    }

    public void start() {
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
        exit();
    }

    public void margin() {
        System.out.println();
    }

    public void exit() {
        System.exit(0);
    }
}
