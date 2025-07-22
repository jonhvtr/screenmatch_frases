package com.screenmatch_frases.screen_frases.service;

import com.screenmatch_frases.screen_frases.domain.Frases;
import com.screenmatch_frases.screen_frases.domain.dto.FrasesDTO;
import com.screenmatch_frases.screen_frases.repository.FrasesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FrasesService {
    @Autowired
    private FrasesRepository repository;

    public FrasesDTO findByRandom() {
        Optional<Frases> frases = repository.getFrasesAleatoria();

        if (frases.isPresent()) {
            Frases f = frases.get();
            return new FrasesDTO(f.getId(), f.getTitulo(), f.getFrase(), f.getPersonagem(), f.getPoster());
        }
        return null;
    }
}
