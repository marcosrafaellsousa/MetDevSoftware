package Exercicio3;

import java.util.ArrayList;
import java.util.Random;

public class Principal {

    public static void main (String args[]) {
        ArrayList<Item> listaItens = gerarItens(10);
        for (Item item : listaItens) {
            System.out.println(item);
            if (item instanceof Jogo) {
                System.out.println("Plataforma: " + ((Jogo) item).getPlataforma());
                System.out.println();
            }
        }
    }

    private static ArrayList<Item> gerarItens (int quantidade) {
        ArrayList<Item> listaItens = new ArrayList<>();
        for (Item filme : gerarFilmes(quantidade))
            listaItens.add(filme);
        for (Item cd : gerarCDs(quantidade))
            listaItens.add(cd);
        for (Item jogo : gerarJogos(quantidade))
            listaItens.add(jogo);

        return listaItens;
    }

    private static ArrayList<Item> gerarFilmes (int quantidade) {
        ArrayList<Item> listaFilmes= new ArrayList<>();

        for (int i = 0; i < quantidade; i++) {
            Item filme = new Filme("filme" + (i + 1), 2019, (2.0+(i/10.0)) + " horas",
                    "diretor" + (i + 1));
            filme.addComentario("filme nota: " + (i + 1));
            filme.addComentario("Muito ruim");
            filme.addComentario("Otimo filme!");
            listaFilmes.add(filme);
        }

        return listaFilmes;
    }

    private static ArrayList<Item> gerarCDs (int quantidade) {
        ArrayList<Item> listaCDs= new ArrayList<>();

        for (int i = 0; i < quantidade; i++) {
            Item cd = new CD("CD" + (i + 1), 2019, (5+i) + " horas",
                    "artista" + (i + 1), (10 + i));
            cd.addComentario("CD nota: " + (i + 1));
            listaCDs.add(cd);
        }

        return listaCDs;
    }

    private static ArrayList<Item> gerarJogos (int quantidade) {
        ArrayList<Item> listaJogos= new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < quantidade; i++) {
            int aleatorio = random.nextInt(4);
            String plataforma;
            if (aleatorio == 1)
                plataforma = "PS4";
            else if (aleatorio == 2)
                plataforma = "Xbox One";
            else plataforma = "PC";

            Item jogo = new Jogo("Jogo" + (i + 1), 2019, (20+i) + " horas",
                    (200 + i) * 1000 , plataforma);
            jogo.addComentario("Jogo nota: " + (i + 1));
            listaJogos.add(jogo);
        }

        return listaJogos;
    }
}
