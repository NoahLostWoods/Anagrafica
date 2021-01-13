package com.WebAnag.Anagrafica.controller;

import com.WebAnag.Anagrafica.model.Nota;
import com.WebAnag.Anagrafica.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class controller {

    @Autowired
    private NoteService noteService;

    @GetMapping("/home")
    public ModelAndView home() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("home");
        List<Nota> listaNote = noteService.getAll();
        mav.addObject("listaNote", listaNote);
        return mav;
    }
}
