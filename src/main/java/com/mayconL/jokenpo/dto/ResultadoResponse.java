package com.mayconL.jokenpo.dto;

import com.mayconL.jokenpo.model.Jogada;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResultadoResponse {

    private String resultadoRodada;
    private Jogada jogadaComputador;
    private int viroriasJogador;
    private int viroriasComputador;
    private String resultadoFinal;
    
    public ResultadoResponse(String resultadoRodada, Jogada jogadaComputador, int viroriasJogador,
            int viroriasComputador, String resultadoFinal) {
        this.resultadoRodada = resultadoRodada;
        this.jogadaComputador = jogadaComputador;
        this.viroriasJogador = viroriasJogador;
        this.viroriasComputador = viroriasComputador;
        this.resultadoFinal = resultadoFinal;
    }

}
