package Exercicio1;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EntradaDeDados {

    public static List<Cliente> entrarClientes () {
        LocalDate hoje = LocalDate.now();
        Scanner scanner = new Scanner(System.in);
        List<Cliente> clientesLista = new ArrayList<>();
        while (true) {
            try {
                System.out.print("Digite o nome de um cliente:");

                String nome = scanner.nextLine();
                if (nome.equals("fim"))
                    break;
                if (nome.contains("-"))
                    throw new EntradaInvalida("o simbolo \"-\" não pode ser usado no nome!");

                System.out.print("Digite o sexo do cliente (F/M):");
                char sexo = scanner.nextLine().charAt(0);
                if (!(sexo == 'F' || sexo == 'M'))
                    throw new EntradaInvalida("Sexo inválido!");

                System.out.print("Digite o dia de nascimento:");
                int dia = Integer.parseInt(scanner.nextLine());

                System.out.print("Digite o mes de nascimento:");
                int mes = Integer.parseInt(scanner.nextLine());

                System.out.print("Digite o ano de nascimento:");
                int ano = Integer.parseInt(scanner.nextLine());

                LocalDate dataNascimento = LocalDate.of(ano, mes, dia);
                Period period = Period.between(dataNascimento, hoje);
                if (period.isNegative() || period.isZero())
                    throw new EntradaInvalida("Data inválida!");

                Cliente cliente = new Cliente(nome, sexo, period.getYears());
                clientesLista.add(cliente);
            } catch (EntradaInvalida e) {
                System.out.println(e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Número inválido!");
            } catch (DateTimeException e){
                System.out.println("Data Inválida!");
            }
        }

        return clientesLista;
    }
}
