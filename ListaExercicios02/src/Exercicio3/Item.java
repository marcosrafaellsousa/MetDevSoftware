package Exercicio3;

import java.util.ArrayList;

public class Item {
    private String titulo;
    private int ano;
    private String tempoDeDuracao;
    private ArrayList<String> comentarios = new ArrayList<>();

    public Item(String titulo, int ano, String tempoDeDuracao) {
        this.titulo = titulo;
        this.ano = ano;
        this.tempoDeDuracao = tempoDeDuracao;
    }

    public Item() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getTempoDeDuracao() {
        return tempoDeDuracao;
    }

    public void setTempoDeDuracao(String tempoDeDuracao) {
        this.tempoDeDuracao = tempoDeDuracao;
    }

    public ArrayList<String> getComentarios() {
        return comentarios;
    }

    public void setComentarios(ArrayList<String> comentarios) {
        this.comentarios = comentarios;
    }

    public void addComentario (String comentario) {
        this.comentarios.add(comentario);
    }

    @Override
    public String toString() {
        return "titulo: '" + titulo + '\'' +
                ", ano: " + ano +
                ", tempoDeDuracao: '" + tempoDeDuracao + '\'' +
                ", comentarios: " + comentarios + '\'';
    }
}
