package modelo;

import java.io.Serializable;
import java.util.Objects;

public class Localizacao implements Serializable {

    private String endereco;
    private String bairro;
    private String cidade;
    private String estado;

    public Localizacao() {
    }

    public Localizacao(String endereco, String bairro, String cidade, String estado) {
        this.setEndereco(endereco);
        this.setBairro(bairro);
        this.setCidade(cidade);
        this.setEstado(estado);
    }


    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Localizacao that = (Localizacao) o;
        return Objects.equals(endereco, that.endereco) &&
                Objects.equals(bairro, that.bairro) &&
                Objects.equals(cidade, that.cidade) &&
                Objects.equals(estado, that.estado);
    }

    @Override
    public String toString() {
        return "endereco: " + endereco + " - " +
                "bairro: " + bairro + " - " +
                "cidade: " + cidade + " - " +
                "estado: " + estado + " - ";
    }
}
