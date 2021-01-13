package com.WebAnag.Anagrafica.service;

import com.WebAnag.Anagrafica.model.Nota;
import com.WebAnag.Anagrafica.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("noteService")
public class NoteServiceImpl implements NoteService {

    @Autowired
    private NoteRepository noteRepository;

    @Override
    public void saveNota(Nota nota) {
        noteRepository.save(nota);
    }

    @Override
    public List<Nota> getAll() {
        return noteRepository.findAll();
    }
}
