package MusicasCompositores;

import java.util.ArrayList;
import java.util.Scanner;

public class MusicaCompositoresPrograma {

    public static void main (String args[]) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Musica> listaMusicas = new ArrayList<>();

        boolean exitMusicLoop = false;
        while (exitMusicLoop == false) {
            System.out.print("Digite o nome de uma musica: ");
            Musica musica = new Musica(scanner.nextLine());
            System.out.print("Digite o ano de lancamento: ");
            musica.setAno(Integer.parseInt(scanner.nextLine()));
            System.out.print("Digite o tipo: ");
            musica.setTipo(scanner.nextLine());

            boolean exitCompLoop = false;
            while (exitCompLoop == false) {
                System.out.print("Digite o nome do compositor: ");
                String nome = scanner.nextLine();
                System.out.print("Digite a nacionalidade do compositor: ");
                String nacionalidade = scanner.nextLine();
                Compositor compositor = new Compositor(nome, nacionalidade);
                musica.addCompositor(compositor);
                System.out.print("Adicionar mais um compositor? (s/n)");
                if (scanner.nextLine().equals("n"))
                    exitCompLoop = true;
            }

            listaMusicas.add(musica);

            System.out.print("Adicionar mais uma musica? (s/n)");
            if (scanner.nextLine().equals("n"))
                exitMusicLoop = true;

        }

        System.out.println();
        System.out.println("Todas as musica digitadas:");
        for (Musica musica : listaMusicas) {
            System.out.println(musica.toString());
            System.out.println();
        }
    }
}
