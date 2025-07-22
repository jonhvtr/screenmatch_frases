package com.screenmatch_frases.screen_frases.controller;

import com.screenmatch_frases.screen_frases.domain.dto.FrasesDTO;
import com.screenmatch_frases.screen_frases.service.FrasesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/series")
public class FrasesController {
    @Autowired
    private FrasesService frasesService;

    @GetMapping("/frases")
    public FrasesDTO getByRandom() {
        return frasesService.findByRandom();
    }
}
