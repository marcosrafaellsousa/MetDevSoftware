package modelo;

import java.io.Serializable;
import java.util.Objects;

public class Carro extends ObjetoPadrao implements Serializable {

    private String marca;
    private String modelo;
    private int ano;
    private String acessorios;
    private double preco;
    private Categoria categoria;

    public Carro() {
        super();
    }

    public Carro(String marca, String modelo, int ano, String acessorios, double preco, Categoria categoria) {
        super();
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setAno(ano);
        this.setAcessorios(acessorios);
        this.setPreco(preco);
        this.setCategoria(categoria);
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getAcessorios() {
        return acessorios;
    }

    public void setAcessorios(String acessorios) {
        this.acessorios = acessorios;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carro carro = (Carro) o;
        return ano == carro.ano &&
                Double.compare(carro.preco, preco) == 0 &&
                Objects.equals(marca, carro.marca) &&
                Objects.equals(modelo, carro.modelo) &&
                Objects.equals(acessorios, carro.acessorios) &&
                categoria == carro.categoria;
    }

    @Override
    public String toString() {
        return  "Identificador: " + getId() + " - " +
                "Marca: " + marca + " - " +
                "Modelo: " + modelo + " - " +
                "Ano: " + ano + " - " +
                "Acessorios: " + acessorios + " - " +
                "Preco: " + preco + " - " +
                "Categoria: " + categoria.toString();
    }
}
