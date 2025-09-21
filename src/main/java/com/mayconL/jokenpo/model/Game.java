package com.mayconL.jokenpo.model;
import java.util.Random;

public class Game {

    private Player jogador = new Player("Jogador");
    private Player computador = new Player("Computador");
    private boolean isFinalizado = false;
    private int vitoriasJogador = 0;
    private int vitoriasComputador = 0;

    public void setJogadaJogador(Jogada jogada) {
        jogador.escolherJogada(jogada);
    }

    public void setJogadaComputador() {
        Jogada[] valores = Jogada.values();
        Jogada jogadaRandom = valores[new Random().nextInt(valores.length)];
        computador.escolherJogada(jogadaRandom);
    }

    public Jogada getJogadaComputador() { 
        return computador.getJogada(); 
    }

    public String resultado() {

        Jogada jogadaUsuario = jogador.getJogada();
        Jogada jogadaComputador = computador.getJogada();

        if(jogadaUsuario == jogadaComputador) {
            return "Empate!";
        } else if (jogadaUsuario.venceDe(jogadaComputador)){
            isFinalizado = true;
            vitoriasJogador++;
            return jogador.getNome() + " venceu!";
        } else {
            isFinalizado = true;
            vitoriasComputador++;
            return computador.getNome() + " venceu!";
        }
    }

    public boolean isFinalizado() {
        return isFinalizado;
    }

    public int getVitoriasJogador() {
        return vitoriasJogador;
    }

    public int getVitoriasComputador() {
        return vitoriasComputador;
    }
}
