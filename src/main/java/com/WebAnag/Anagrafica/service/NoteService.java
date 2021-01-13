package com.WebAnag.Anagrafica.service;

import com.WebAnag.Anagrafica.model.Nota;

import java.util.List;

public interface NoteService {
    void saveNota(Nota nota);
    List<Nota> getAll();
}
