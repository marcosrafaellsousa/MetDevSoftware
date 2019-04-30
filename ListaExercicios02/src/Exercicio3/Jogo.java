package Exercicio3;

import java.util.ArrayList;

public class Jogo extends Item {

    private int numeroDeJogadores;
    private String plataforma;

    public Jogo(String titulo, int ano, String tempoDeDuracao, int numeroDeJogadores, String plataforma) {
        super(titulo, ano, tempoDeDuracao);
        this.numeroDeJogadores = numeroDeJogadores;
        this.plataforma = plataforma;
    }

    public Jogo() {
    }

    public Jogo(int numeroDeJogadores, String plataforma) {
        this.numeroDeJogadores = numeroDeJogadores;
        this.plataforma = plataforma;
    }

    public int getNumeroDeJogadores() {
        return numeroDeJogadores;
    }

    public void setNumeroDeJogadores(int numeroDeJogadores) {
        this.numeroDeJogadores = numeroDeJogadores;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    @Override
    public String toString() {
        return String.format("Jogo: " +
                super.toString() +
                "numeroDeJogadores: " + numeroDeJogadores +
                "%n");
    }
}
