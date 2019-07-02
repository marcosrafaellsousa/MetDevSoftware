package Exercicio1;

import java.io.Serializable;

public class Cliente implements Serializable {

    private String nome;
    private char sexo;
    private int idade;

    public Cliente(String nome, char sexo, int idade) {
        this.setNome(nome);
        this.setSexo(sexo);
        this.setIdade(idade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", sexo=" + sexo +
                ", idade=" + idade +
                "}\n";
    }
}
