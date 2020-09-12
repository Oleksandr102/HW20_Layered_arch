package com.example.demo.dao;

import com.example.demo.models.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface NoteDao extends JpaRepository<Note, Long> {
    void deleteById(Long id);

    Optional<Note> getNoteById(Long id);

    @Query("FROM Note note WHERE note.memo>=:MEMO")
    List<Note> findAllWithMemo(Integer memo);

    List<Note> findAllUsed(boolean used);


}
