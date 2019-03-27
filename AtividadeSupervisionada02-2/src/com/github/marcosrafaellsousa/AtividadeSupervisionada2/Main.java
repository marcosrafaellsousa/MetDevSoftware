package com.github.marcosrafaellsousa.AtividadeSupervisionada2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Produto[] produtos = new Produto[4];

        System.out.println("Oi, eu sou a assistente da Atividade Supervisionada 02-2");
        System.out.println("Vou te guiar durante a execução dessa aplicacao, apenas siga minhas instrucoes ok?");
        System.out.println("Isso pode ser um pouco longo, eu recomendaria um copo de whisky... deixa mais facil " +
                "aproveitar o processo");
        System.out.println("Aperte 'Enter' para continuar");
        sc.nextLine();
        System.out.println("Voce vai registrar 4 produtos, digite os dados como informado:");
        System.out.println("Eu vou precisar da sua ajuda aqui, sempre que for digitar um valor, separe real de " +
                "centavos com ponto, e nao virgula");
        System.out.println("Para o primeiro produto digite apenas o codigo :");
        produtos[0] = new Produto(sc.nextLine());

        System.out.println();
        System.out.println("Para o segundo produto digite o codigo e o nome, um em cada linha");
        produtos[1] = new Produto(sc.nextLine(), sc.nextLine());

        System.out.println();
        System.out.println("Para o terceiro produto digite o codigo, nome, e quantidade, um em cada linha");
        produtos[2] = new Produto(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));

        System.out.println();
        System.out.println("Para o ultimo produto digite o codigo, nome, quantidade, tipo e valor, um em cada linha");
        produtos[3] = new Produto(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), sc.nextLine(),
                Double.parseDouble(sc.nextLine()));


        System.out.println();
        System.out.println("Vou inserir informacoes no primeiro produto, ja que ele foi criado de uma forma meio " +
                "largada. Digite o nome, quantidade, tipo e valor, um em cada linha");
        produtos[0].inserir(sc.nextLine(), Integer.parseInt(sc.nextLine()), sc.nextLine(),
                Double.parseDouble(sc.nextLine()));

        System.out.println();
        System.out.println("Este e o produto que voce preencheu: ");
        System.out.println(produtos[0].consultar());

        System.out.println();
        System.out.println("Voce realizou uma compra, digite a quantidade e o novo valor do produto " +
                produtos[0].nomeProduto);
        produtos[0].comprar(Integer.parseInt(sc.nextLine()), Double.parseDouble(sc.nextLine()));

        System.out.println();
        System.out.println("Voce realizou uma venda do produto " + produtos[0].nomeProduto + ", digite a quantidade " +
                "vendida");
        System.out.println(produtos[0].vender(Integer.parseInt(sc.nextLine())));

        System.out.println();
        System.out.println("Aqui estao as informacoes do produto " + produtos[0].nomeProduto);
        System.out.println(produtos[0].consultar());

        System.out.println();
        System.out.print("Eu comparei esse produto com o " + produtos[1].nomeProduto + ", ");
        if (produtos[0].igual(produtos[1]))
            System.out.println("ao que parece eles sao o mesmo produto");
        else
            System.out.println("eles sao diferentes");

        System.out.println();
        System.out.println("Agora voce realizou uma compra do " + produtos[1].nomeProduto + ", digite a quantidade " +
                "comprada e o novo valor do produto: ");
        produtos[1].comprar(Integer.parseInt(sc.nextLine()), Double.parseDouble(sc.nextLine()));

        System.out.println();
        System.out.println("Vou facilitar e informar que voce vendeu 2 deste produto");
        System.out.println(produtos[1].vender(2));

        System.out.println();
        System.out.println("Aqui estao as informacoes deste segundo produto");
        System.out.println(produtos[1].consultar());

        System.out.println();
        if (produtos[1].igual(produtos[2]))
            System.out.println("Spoiler: ele e igualzinho o proximo produto");
        else
            System.out.println("Spoiler: o proximo produto é algo diferente");

        System.out.println();
        System.out.println(produtos[2].consultar());
        System.out.println();
        System.out.println("E esse ai que eu acabei de te mostrar");
        System.out.println("Digite uma quantidade comprada e o novo preco, um em cada linha ");
        produtos[2].comprar(Integer.parseInt(sc.nextLine()), Double.parseDouble(sc.nextLine()));

        System.out.println("Quantos voce esta vendendo?");
        System.out.println(produtos[2].vender(Integer.parseInt(sc.nextLine())));

        System.out.println();
        System.out.print("Agora finalmente vamos usar o ultimo produto. ");
        if (produtos[2].igual(produtos[3]))
            System.out.println("Ele e igual o produto que acabamos de ver, que anticlimatico");
        else
            System.out.println("E nao, ele nao e igual o produto que acabamos de ver");

        System.out.println();
        System.out.print("Sem preco novo, pra facilitar, digite logo a quantidade comprada e vendida, uma por linha");
        produtos[3].comprar(Integer.parseInt(sc.nextLine()));
        System.out.println(produtos[3].vender(Integer.parseInt(sc.nextLine())));

        System.out.println();
        System.out.print("Ele ficou assim: ");

        System.out.println();
        System.out.println(produtos[3].consultar());

        System.out.println();
        System.out.println("Aperte 'Enter' para continuar");

        System.out.println();
        System.out.println("Eu sei que isso e meio de repente, mas que tal uma curiosidade, agora que esta aplicacao " +
                "acabou, e provavelmente seu copo de whisky tambem");
        System.out.println();
        System.out.println("Gasolina e um liquido volatil e facilmente inflamavel, entao e igual alcool nao e? ");
        System.out.println("gasolina tambem e combustivel para carros, entao eles nao poderiam ser abastecidos com " +
                "alcool?");
        System.out.println("Na verdade, em uma corrida na America do Sul, um carro correu cerca de 322 kilometros " +
                "usando whisky");
        System.out.println("Parece um desperdicio de whisky, não?");
        System.out.println("Ate a proxima, pressione 'Enter' para sair");
        sc.nextLine();
        sc.close();
    }
}
