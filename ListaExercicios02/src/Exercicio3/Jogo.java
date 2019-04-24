package Exercicio3;

public class Jogo extends Item {

    private int numeroDeJogadores;
    private String plataforma;

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
        return "Jogo: " +
                super.toString() +
                "numeroDeJogadores: " + numeroDeJogadores +
                ", plataforma: '" + plataforma + '\'' +
                "%n";
    }
}
