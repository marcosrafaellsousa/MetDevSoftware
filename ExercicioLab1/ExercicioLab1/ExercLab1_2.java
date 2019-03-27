package ExercicioLab1;

import java.util.Scanner;

public class ExercLab1_2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // primeiro curso
        Curso curso1 = new Curso();
        System.out.println("Digite as informações do primeiro curso");
        System.out.println("Nome do curso: ");
        curso1.nomeDoCurso = sc.nextLine();
        System.out.println("codigo: ");
        curso1.codigo = sc.nextLine();
        System.out.println("Nome do professor: ");
        curso1.nomeDoProfessor = sc.nextLine();
        System.out.println("Quantidade de alunos");
        curso1.quantidadeDeAlunos = Integer.parseInt(sc.nextLine());


        // segundo curso
        Curso curso2 = new Curso();
        System.out.println("Digite as informações do segundo curso");
        System.out.println("Nome do curso: ");
        curso2.nomeDoCurso = sc.nextLine();
        System.out.println("codigo: ");
        curso2.codigo = sc.nextLine();
        System.out.println("Nome do professor: ");
        curso2.nomeDoProfessor = sc.nextLine();
        System.out.println("Quantidade de alunos");
        curso2.quantidadeDeAlunos = Integer.parseInt(sc.nextLine());

        // terceiro curso
        Curso curso3 = new Curso();
        System.out.println("Digite as informações do terceiro curso");
        System.out.println("Nome do curso: ");
        curso3.nomeDoCurso = sc.nextLine();
        System.out.println("codigo: ");
        curso3.codigo = sc.nextLine();
        System.out.println("Nome do professor: ");
        curso3.nomeDoProfessor = sc.nextLine();
        System.out.println("Quantidade de alunos");
        curso3.quantidadeDeAlunos = Integer.parseInt(sc.nextLine());

        //quarto curso
        Curso curso4 = new Curso();
        System.out.println("Digite as informações do quarto curso");
        System.out.println("Nome do curso: ");
        curso4.nomeDoCurso = sc.nextLine();
        System.out.println("codigo: ");
        curso4.codigo = sc.nextLine();
        System.out.println("Nome do professor: ");
        curso4.nomeDoProfessor = sc.nextLine();
        System.out.println("Quantidade de alunos");
        curso4.quantidadeDeAlunos = Integer.parseInt(sc.nextLine());

        //imprimindo
        System.out.println("");
        System.out.println("Primeiro curso digitado: ");
        System.out.println("Nome: " + curso1.nomeDoCurso);
        System.out.println("Codigo: " + curso1.codigo);
        System.out.println("Nome do professor: " + curso1.nomeDoProfessor);
        System.out.println("Quantidade de alunos: " + curso1.quantidadeDeAlunos);

        System.out.println("");
        System.out.println("Segundo curso digitado: ");
        System.out.println("Nome: " + curso2.nomeDoCurso);
        System.out.println("Codigo: " + curso2.codigo);
        System.out.println("Nome do professor: " + curso2.nomeDoProfessor);
        System.out.println("Quantidade de alunos: " + curso2.quantidadeDeAlunos);

        System.out.println("");
        System.out.println("Terceiro curso digitado: ");
        System.out.println("Nome: " + curso3.nomeDoCurso);
        System.out.println("Codigo: " + curso3.codigo);
        System.out.println("Nome do professor: " + curso3.nomeDoProfessor);
        System.out.println("Quantidade de alunos: " + curso3.quantidadeDeAlunos);

        System.out.println("");
        System.out.println("Quarto curso digitado: ");
        System.out.println("Nome: " + curso4.nomeDoCurso);
        System.out.println("Codigo: " + curso4.codigo);
        System.out.println("Nome do professor: " + curso4.nomeDoProfessor);
        System.out.println("Quantidade de alunos: " + curso4.quantidadeDeAlunos);

        System.out.println("");
        System.out.println("Fim.");
    }
}
