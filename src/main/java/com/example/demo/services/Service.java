package com.example.demo.services;


import com.example.demo.dao.NoteDao;
import com.example.demo.models.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;

import java.util.Optional;

@org.springframework.stereotype.Service
public class Service {
    private NoteDao dao;

    public Service() {

    }

    @Autowired
    public Service(NoteDao dao) {
        this.dao = dao;
    }

    public void saveNote(Note note){
        dao.save(note);
    }

    public Optional<Note> getNoteById(Long id){
        return dao.findById(id);
    }

    public void printAll(){
        dao.findAll().forEach(System.out::println);
    }

    public void printByMemoSize(Integer memo){
        dao.findAllWithMemo(memo).forEach(System.out::println);
    }

    public void printUsed(boolean used){
        dao.findAllUsed(used).forEach(System.out::println);
    }

    public void printByMake(String make){
        dao.findAll(Sort.by(make).descending()).forEach(System.out::println);
    }
}

