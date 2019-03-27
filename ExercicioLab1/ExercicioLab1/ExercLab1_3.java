package ExercicioLab1;

import java.util.Scanner;

public class ExercLab1_3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de cursos que você pretende informar: ");
        int quantCursos = Integer.parseInt(sc.nextLine());

        Curso[] vetorCursos = new Curso[quantCursos];


        for (int i=0; i< quantCursos; i++) {
            System.out.println("Curso numero " + (i+1));
            vetorCursos[i] = new Curso();
            System.out.println("Nome do curso: ");
            vetorCursos[i].nomeDoCurso = sc.nextLine();
            System.out.println("Codigo: ");
            vetorCursos[i].codigo = sc.nextLine();
            System.out.println("Nome do professor: ");
            vetorCursos[i].nomeDoProfessor = sc.nextLine();
            System.out.println("Quantidade de alunos: ");
            vetorCursos[i].quantidadeDeAlunos = Integer.parseInt(sc.nextLine());
        }

        System.out.println("Voce informou " + quantCursos + " cursos");

        for (int i=0; i< quantCursos; i++) {
            System.out.println("");
            System.out.println("Curso numero: " + (i+1));
            System.out.println("Nome do curso: " + vetorCursos[i].nomeDoCurso);
            System.out.println("Codigo: " + vetorCursos[i].codigo);
            System.out.println("Nome do professor: " + vetorCursos[i].nomeDoProfessor);
            System.out.println("Quantidade de alunos: " + vetorCursos[i].quantidadeDeAlunos);
        }

        System.out.println("");
        System.out.println("Fim.");
    }
}
