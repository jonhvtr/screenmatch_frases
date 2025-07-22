package com.screenmatch_frases.screen_frases.repository;

import com.screenmatch_frases.screen_frases.domain.Frases;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface FrasesRepository extends JpaRepository<Frases, Long> {
    @Query("SELECT f FROM Frases f order by function('RANDOM') LIMIT 1")
    Optional<Frases> getFrasesAleatoria();
}
