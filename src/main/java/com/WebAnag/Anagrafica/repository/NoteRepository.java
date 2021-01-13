package com.WebAnag.Anagrafica.repository;

import com.WebAnag.Anagrafica.model.Nota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("noteRepository")
public interface NoteRepository extends JpaRepository<Nota, Integer> {
}
