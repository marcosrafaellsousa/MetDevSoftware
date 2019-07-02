package aplicacao;

import janelas.JanelaPrincipal;
import janelas.JanelasIncluir;
import janelas.ResultadoBuscas;
import modelo.Carro;
import modelo.Categoria;
import modelo.Locadora;
import modelo.Localizacao;
import repositorio.RepoCarro;
import repositorio.RepoLocadora;

public class Programa {

    public static void main(String[] args) {
//        Carro carro = new Carro("marca", "modelo", 0, "acessorios0", 40000.00, Categoria.SEDAN);
//        Carro carro1 = new Carro("marca1", "modelo1", 1, "acessorios1", 40001.00, Categoria.HATCH);
//
//        Locadora locadora = new Locadora("locadora0","cnpj0","0000000",new Localizacao("rua0","bairro0","cidade0","estado0"));
//        Locadora locadora1 = new Locadora("locadora1","cnpj1","1111111",new Localizacao("rua1","bairro1","cidade1","estado1"));
//
//        locadora.getCarrosList().add(carro);
//        locadora1.getCarrosList().add(carro1);
//
        RepoCarro repoCarro = RepoCarro.obtemInstancia();
        repoCarro.carregarDoArquivo();
//        repoCarro.incluir(carro);
//        repoCarro.incluir(carro1);
//
        RepoLocadora repoLocadora = RepoLocadora.obtemInstancia();
        repoLocadora.carregarDoArquivo();
//        repoLocadora.incluir(locadora);
//        repoLocadora.incluir(locadora1);

        JanelaPrincipal.obtemInstancia().menuPrincipal();
    }
}
