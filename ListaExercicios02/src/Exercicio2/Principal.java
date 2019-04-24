package Exercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        ArrayList<Filme> listaFilmes = new ArrayList<>();

        boolean exitLoop = false;
        while (exitLoop == false) {
            System.out.print("Digite o codigo: ");
            long codigo = Long.parseLong(scanner.nextLine());

            if (codigo == 0)
                break;

            System.out.print("Digite o nome: ");
            String nome = scanner.nextLine();

            Filme filme = new Filme(codigo, nome);

            System.out.print("Digite o genero: ");
            filme.setGenero(scanner.nextLine());

            System.out.print("Digite o ano: ");
            filme.setAno(Integer.parseInt(scanner.nextLine()));

            System.out.print("Digite o autor: ");
            filme.setAutor(scanner.nextLine());

            listaFilmes.add(filme);
        }

        for (Filme filme : listaFilmes)
            System.out.println(filme);
    }
}
