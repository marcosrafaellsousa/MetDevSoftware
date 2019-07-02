package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Locadora extends ObjetoPadrao implements Serializable {

    private String nome;
    private String cnpj;
    private String telefone;

    private Localizacao localizacao;

    private List<Carro> carrosList = new ArrayList<>();

    public Locadora() {
        super();
    }

    public Locadora(String nome, String cnpj, String telefone, Localizacao localizacao) {
        super();
        this.setNome(nome);
        this.setCnpj(cnpj);
        this.setTelefone(telefone);
        this.setLocalizacao(localizacao);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Localizacao getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(Localizacao localizacao) {
        this.localizacao = localizacao;
    }

    public List<Carro> getCarrosList() {
        return carrosList;
    }

    public void setCarrosList(List<Carro> carrosList) {
        this.carrosList = carrosList;
    }

    @Override
    public String toString() {
        String string;
        string = "Locadora: " + " - " + nome + " Identificador: " + getId() + "\n" +
                "          Cnpj: " + cnpj + " - " +
                "Telefone: " + telefone + " - \n" +
                "          Localizacao: " + localizacao + "\n" +
                "          Identificador dos carros: ";
        if (carrosList.size() == 0) {
            string += "Nenhum carro cadastrado";
        } else {
             Iterator<Carro> iterator = carrosList.iterator();
            while (iterator.hasNext()) {
                string += iterator.next().getId() + ", ";
            }
        }
        return string;
    }
}
