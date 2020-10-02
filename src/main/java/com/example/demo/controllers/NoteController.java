package com.example.demo.controllers;

import com.example.demo.models.Note;
import com.example.demo.services.NoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/notes")
@RestController
@RequiredArgsConstructor
public class NoteController {
    private final NoteService noteService;

    @GetMapping("/used")
    public List<Note> getAllUsedNotes(boolean used){
        return noteService.printUsed(used);
    }

    @GetMapping("/ram")
    public List<Note> getByMemo(Integer memo){
        return noteService.printByMemoSize(memo);
    }

    @GetMapping("/make")
    public List<Note> getByMake(String make){
        return noteService.printByMake(make);
    }
}
