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

        if(jogo.isFinalizado()) {
            return new ResultadoResponse(
                "O jogo já terminou!",
                null,
                jogo.getVitoriasJogador(),
                jogo.getVitoriasComputador(),
                true,
                jogo.resultado()
            );
        }

        jogo.setJogadaJogador(request.getJogada());
        jogo.setJogadaComputador();
        String resultadoRodada = jogo.resultado();

        return new ResultadoResponse(
            resultadoRodada, 
            jogo.getJogadaComputador(),
            jogo.getVitoriasJogador(), 
            jogo.getVitoriasComputador(), 
            jogo.isFinalizado(), 
            jogo.isFinalizado() ? resultadoRodada : null
        );
    }

}
