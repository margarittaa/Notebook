package service;

import model.listNotes.Note;

import java.util.List;


public interface NotesFunctions {
    List<Note> listNotes = null;

    void addNote(String content);

    void editNote(String newContent);

    void deleteNote(Note note);

    void save();
}
