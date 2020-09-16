package com.example.demo.dao;

import com.example.demo.models.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NoteDao extends JpaRepository<Note, Long> {

    @Query("FROM Note note WHERE note.memo>=:memo")
    List<Note> findAllWithMemo(@Param("memo") Integer memo);

    List<Note> findByUsedIs(boolean used);

    List<Note> findAllByIdIsNotNull();
    List<Note> findAllById(Long id);

//    List<Note> findAllWithTower(@Param("tower")String tower);

}
