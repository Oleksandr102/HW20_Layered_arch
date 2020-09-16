package com.example.demo.services;


import com.example.demo.dao.NoteDao;
import com.example.demo.models.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class NoteService {
    @Autowired
    private NoteDao dao;

    public Object saveNote(Note note) {
        Object newNote = dao.save(note);
        return newNote;
    }

    public void printAll() {
        dao.findAll().forEach(System.out::println);
    }

    public void printByMemoSize(Integer memo) {
        dao.findAllWithMemo(memo).forEach(System.out::println);
    }

    public void printUsed(boolean used) {
        dao.findByUsedIs(used).forEach(System.out::println);
    }

    public void printByMake(String make) {
        dao.findAll(Sort.by(make).descending()).forEach(System.out::println);
    }
//
//    public void printTower(String tower){
//        dao.findAllWithTower(tower)
//    }

    public void addNoteData() {
        saveNote(new Note("Demon", "x-kom", 8, "i9",
                "FULL", false, 900f, 2020));
        saveNote(new Note("Ghost", "asus", 4, "i5",
                "MINI", true, 300f, 2020));
        saveNote(new Note("Venom", "dell", 16, "i7",
                "MID", true, 700f, 2019));
        saveNote(new Note("Horse", "dell", 128, "i9",
                "FULL", false, 1500f, 2020));
        saveNote(new Note("Venom", "dell", 4, "i3",
                "MINI", false, 500f, 2017));
        saveNote(new Note("Shoe", "asus", 16, "i7",
                "MID", true, 700f, 2019));
        saveNote(new Note("Venom", "x-kom", 8, "i3",
                "MID", true, 400f, 2019));
        saveNote(new Note("PC", "dell", 32, "i7",
                "FULL", false, 800f, 2020));
        saveNote(new Note("ROG", "asus", 16, "i5",
                "FULL", true, 500f, 2014));
        saveNote(new Note("Global", "dell", 4, "i3",
                "MINI", true, 200f, 2015));
        saveNote(new Note("War", "hp", 16, "i3",
                "MINI", false, 700f, 2020));
        saveNote(new Note("Close", "x-kom", 4, "i5",
                "EXTRA", false, 600f, 2017));
        saveNote(new Note("Open", "hp", 8, "RX-3500",
                "MID", true, 400f, 2018));
        saveNote(new Note("Mirror", "dell", 32, "RX-6500",
                "FULL", false, 500f, 2018));
        saveNote(new Note("Rose", "hp", 8, "RX-8000",
                "EXTRA", false, 999f, 2020));
        saveNote(new Note("Glass", "asus", 4, "RX-4200",
                "MINI", true, 200f, 2016));
        saveNote(new Note("Java", "dell", 4, "RX-4500",
                "MID", true, 700f, 2020));
    }
}

