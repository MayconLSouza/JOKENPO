package com.mayconL.jokenpo.dto;

import com.mayconL.jokenpo.model.Jogada;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResultadoResponse {

    private String resultadoRodada;
    private int numeroRodadas;
    private Jogada jogadaComputador;
    private int viroriasJogador;
    private int viroriasComputador;
    private int empates;
    private String resultadoFinal;
    
    public ResultadoResponse(String resultadoRodada, int numeroRodadas, Jogada jogadaComputador, int viroriasJogador,
            int viroriasComputador, int empates, String resultadoFinal) {
        this.resultadoRodada = resultadoRodada;
        this.numeroRodadas = numeroRodadas;
        this.jogadaComputador = jogadaComputador;
        this.viroriasJogador = viroriasJogador;
        this.viroriasComputador = viroriasComputador;
        this.empates = empates;
        this.resultadoFinal = resultadoFinal;
    }

}
