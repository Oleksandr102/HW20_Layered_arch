package com.example.demo.dao;

import com.example.demo.models.Note;
import com.example.demo.services.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MagicData {
    @Autowired
    private Service service;

    public void addNoteData(){
        service.saveNote(new Note("Demon", "x-kom", 8, "i9",
                "FULL", false, 900f, 2020));
        service.saveNote(new Note("Ghost", "asus", 4, "i5",
                "MINI", true, 300f, 2020));
        service.saveNote(new Note("Venom", "dell", 16, "i7",
                "MID", true, 700f, 2019));
    }
}
