package com.github.marcosrafaellsousa.exercicioLab0204;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Inserindo um novo funcionario: ");
            System.out.print("Matricula: ");
            String matricula = scanner.nextLine();
            System.out.println();
            if (matricula.equals("0"))
                break;

            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.println();

            System.out.print("CPF: ");
            String cpf = scanner.nextLine();
            System.out.println();

            Funcionario funcionario = new Funcionario(nome, cpf, matricula);

            System.out.print("Cargo: ");
            funcionario.setCargo(scanner.nextLine());
            System.out.println();

            System.out.print("Salario: ");
            funcionario.setSalario(Double.parseDouble(scanner.nextLine()));
            System.out.println();

            System.out.print("Departamento: ");
            funcionario.setDepartamento(scanner.nextLine());
            System.out.println();

            System.out.println("Inserindo o endereco");

            System.out.print("Rua: ");
            String rua = scanner.nextLine();
            System.out.println();

            System.out.print("Numero: ");
            String numero = scanner.nextLine();
            System.out.println();

            Endereco endereco = new Endereco(rua, numero);

            System.out.print("Quadra: ");
            endereco.setQuadra(scanner.nextLine());
            System.out.println();

            System.out.print("Lote: ");
            endereco.setLote(scanner.nextLine());
            System.out.println();

            System.out.print("Complemento: ");
            endereco.setComplemento(scanner.nextLine());
            System.out.println();

            System.out.print("Bairro: ");
            endereco.setBairro(scanner.nextLine());
            System.out.println();

            System.out.print("Cidade: ");
            endereco.setCidade(scanner.nextLine());
            System.out.println();

            System.out.print("Estado: ");
            endereco.setEstado(scanner.nextLine());
            System.out.println();

            funcionario.setEndereco(endereco);
            funcionarios.add(funcionario);

            System.out.print("Funcionario criado: ");
            System.out.print(funcionario.toString());
        }

        System.out.println("Aperte enter Para continuar e ver todos os funcionarios");
        scanner.nextLine();

        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario.toString());
        }

        System.out.println("Aperte enter para continuar ");
        scanner.nextLine();

        System.out.println("Aumentando o salario de todos os funcionarios em 30% ");
        int tamanhoDaLista = funcionarios.size();
        for (int i = 0; i < tamanhoDaLista; i++) {
            funcionarios.get(i).aumentaSalario(30.0);
        }

        System.out.println();
        System.out.println("O salario de todos os funcionario foi aumentado, aperte enter para imprimir ");
        scanner.nextLine();

        for (Funcionario funcionario : funcionarios) {
            System.out.print(funcionario.toString());
            System.out.printf("Salario: %.2f%n",funcionario.getSalario());
            System.out.println();
        }

        System.out.println("FIM");
    }
}
