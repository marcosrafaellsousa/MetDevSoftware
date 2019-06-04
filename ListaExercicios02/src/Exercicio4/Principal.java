package Exercicio4;

import java.util.ArrayList;
import java.util.Random;

public class Principal {

    public static void main (String args []) {
        ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();
        for (Funcionario funcionario : gerarFuncionarios(5))
            listaFuncionarios.add(funcionario);
        for (Funcionario funcionario : gerarGerentes(2))
            listaFuncionarios.add(funcionario);
        for (Funcionario funcionario : gerarVendedores(5))
            listaFuncionarios.add(funcionario);

        for (Funcionario funcionario : listaFuncionarios) {
            System.out.println(funcionario);
            System.out.println(String.format("Total proventos: %.2f", funcionario.totalProventos()));
        }

        System.out.println();
        System.out.println("aumentado salario em 10%");
        System.out.println();

        for (Funcionario funcionario : listaFuncionarios) {
            funcionario.aumentaSalario(10);
            System.out.println(funcionario);
            System.out.println(String.format("Total proventos: %.2f", funcionario.totalProventos()));
        }

    }

    public static ArrayList<Funcionario> gerarFuncionarios (int quantidade) {
        ArrayList<Funcionario> listaFuncionario = new ArrayList<>();

        for (int i = 0;i < quantidade;i ++) {
            Funcionario funcionario = new Funcionario();
            funcionario.setNome("func" + (i + 1));
            funcionario.setCpf("4323214354" + i);
            funcionario.setSalario(1400.00);
            listaFuncionario.add(funcionario);
        }

        return  listaFuncionario;
    }

    public static ArrayList<Funcionario> gerarGerentes (int quantidade) {
        ArrayList<Funcionario> listaGerentes = new ArrayList<>();

        for (int i = 0;i < quantidade;i ++) {
            Gerente gerente = new Gerente();
            gerente.setNome("gerente" + (i + 1));
            gerente.setCpf("4323214322" + i);
            gerente.setSalario(1600.00);
            gerente.setSenha(12345);
            listaGerentes.add(gerente);
        }

        return  listaGerentes;
    }

    public static ArrayList<Funcionario> gerarVendedores (int quantidade) {
        ArrayList<Funcionario> listaVendedores = new ArrayList<>();

        for (int i = 0; i < quantidade; i++) {
            Vendedor vendedor = new Vendedor();
            vendedor.setNome("vendedor" + (i + 1));
            vendedor.setCpf("4323214300" + i);
            vendedor.setSalario(1000.00);
            vendedor.setComissaoPercent(3);

            Random random = new Random();
            for (int j = 0; j < 12; j++) {
                vendedor.setVendasPorMes((double) random.nextInt(5000), j);
            }

            listaVendedores.add(vendedor);
        }

        return listaVendedores;
    }
}
