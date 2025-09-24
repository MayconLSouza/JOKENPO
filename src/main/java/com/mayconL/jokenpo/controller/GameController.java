package com.mayconL.jokenpo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mayconL.jokenpo.dto.JogadaRequest;
import com.mayconL.jokenpo.dto.ResultadoResponse;
import com.mayconL.jokenpo.model.Game;

@RestController
@RequestMapping("/api/jokenpo")
public class GameController {
    private final Game jogo = new Game();

    @PostMapping("/jogar")
    public ResultadoResponse jogar(@RequestBody JogadaRequest request) {

        jogo.setJogadaJogador(request.getJogada());
        jogo.setJogadaComputador();
        String resultadoRodada = jogo.resultadoRodada();
        String resultadoFinal = jogo.resultadoFinal();

        return new ResultadoResponse(
            resultadoRodada,
            jogo.getNumeroRodadas(),
            jogo.getJogadaComputador(),
            jogo.getVitoriasJogador(), 
            jogo.getVitoriasComputador(),
            jogo.getEmpates(),
            resultadoFinal
        );
    }

    @PostMapping("/reiniciar")
    public ResultadoResponse reiniciar() {
        jogo.reiniciarJogo();
        
        return new ResultadoResponse(
            null,
            jogo.getNumeroRodadas(), 
            null,
            jogo.getVitoriasJogador(), 
            jogo.getVitoriasComputador(),
            jogo.getEmpates(),
            "Jogo reiniciado!"
        );
    }
    
}
