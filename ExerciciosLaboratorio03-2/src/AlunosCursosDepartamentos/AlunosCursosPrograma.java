package AlunosCursosDepartamentos;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class AlunosCursosPrograma {

    public static void main (String args[]) {
        ArrayList<Aluno> listaAlunos = new ArrayList<>();
        ArrayList<Curso> listaCursos = new ArrayList<>();
        ArrayList<Departamento> listaDepartamentos = new ArrayList<>();
        Random random = new Random();

        //instanciando Departamentos
        Departamento depExatas = new Departamento("Exatas","ext");
        listaDepartamentos.add(depExatas);
        Departamento depHumanas = new Departamento("Humanas","hum");
        listaDepartamentos.add(depHumanas);

        //instanciando Cursos
        Curso curMatematica = new Curso ("matematica","mat",depExatas);
        listaCursos.add(curMatematica);
        Curso curFisica = new Curso("fisica","fis",depExatas);
        listaCursos.add(curFisica);
        Curso curPortugues = new Curso("portugues","por",depHumanas);
        listaCursos.add(curPortugues);
        Curso curSociologia = new Curso("sociologia","soc",depHumanas);
        listaCursos.add(curSociologia);

        //instanciando Alunos
        Aluno aluno1 = new Aluno("Leon","0001",random.nextInt(5),curMatematica);
        listaAlunos.add(aluno1);
        Aluno aluno2 = new Aluno("Bruce Lee","0002",random.nextInt(5),curMatematica);
        listaAlunos.add(aluno2);
        Aluno aluno3 = new Aluno("Hatsune Miku","0003",random.nextInt(5),curFisica);
        listaAlunos.add(aluno3);
        Aluno aluno4 = new Aluno("Sigma","0004",random.nextInt(5),curFisica);
        listaAlunos.add(aluno4);
        Aluno aluno5 = new Aluno("Elzabeth","0005",random.nextInt(5),curPortugues);
        listaAlunos.add(aluno5);
        Aluno aluno6 = new Aluno("Carlos","0006",random.nextInt(5),curPortugues);
        listaAlunos.add(aluno6);
        Aluno aluno7 = new Aluno("Junpei","0007",random.nextInt(5),curSociologia);
        listaAlunos.add(aluno7);
        Aluno aluno8 = new Aluno("Eric","0008",random.nextInt(5),curSociologia);
        listaAlunos.add(aluno8);

        //Imprimindo
        System.out.println("Mostrando todos os alunos");
        for (Aluno aluno : listaAlunos) {
            System.out.println(aluno.toString());
        }

        System.out.print("Pressione enter para continuar");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        System.out.println("Mostrando todos os cursos");
        for (Curso curso : listaCursos) {
            System.out.println(curso.toString());
        }

        System.out.print("Pressione enter para continuar");
        scanner.nextLine();

        System.out.println("Mostrando todos os departamentos");
        for (Departamento departamento : listaDepartamentos) {
            System.out.println(departamento.toString());
        }
    }
}
