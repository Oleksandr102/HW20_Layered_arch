package com.example.demo.service;

import com.example.demo.dao.NoteDao;
import com.example.demo.models.Note;
import com.example.demo.services.NoteService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


@RunWith(MockitoJUnitRunner.class)
public class NoteServiceTest {

    @Mock
    private NoteDao noteDaoMock;

    private Note note;

    @InjectMocks
    private NoteService noteService = new NoteService();

    private List<Note> noteList;

    @Test
    public void shouldSaveNewNote() {
        Note note = new Note();
        Note savedNote = new Note();
        when(noteDaoMock.save(note)).thenReturn(savedNote);
        assertEquals(savedNote, noteService.saveNote(note));
    }

    @Test
    public void shouldReturnAllNotesWithMemoMoreThen() {
        int memo = 8;
        noteService.printByMemoSize(memo);
        verify(noteDaoMock).findAllWithMemo(memo);
    }

    @Test
    public void shouldReturnUsedNotes() {
        noteService.printUsed(true);
        verify(noteDaoMock).findByUsedIs(true);
//        note.setUsed(true);
//        noteService.saveNote(note);
//        when(noteDaoMock.save(note)).thenReturn(note);
//        assertEquals(noteList, noteService.printUsed(true));
    }
}
