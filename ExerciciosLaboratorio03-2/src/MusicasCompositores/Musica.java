package MusicasCompositores;

import java.util.ArrayList;

public class Musica {
    private String nome;
    private int ano;
    private String tipo;
    private ArrayList<Compositor> compositores = new ArrayList<>();

    public Musica(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList<Compositor> getCompositores() {
        return compositores;
    }

    public void addCompositor(Compositor compositor) {
        compositores.add(compositor);
    }

    public void removeCompositor(Compositor compositor) {
        compositores.remove(compositor);
    }

    @Override
    public String toString() {
        String string = String.format("Nome: %s%nAno: %s%nTipo: %s%n",nome,ano,tipo);
        for (Compositor compositor : compositores) {
            string += compositor.toString();
        }
        return string;
    }
}
