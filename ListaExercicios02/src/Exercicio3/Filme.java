package Exercicio3;

public class Filme extends  Item{

    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public String toString() {
        return "Filme: " +
                super.toString() +
                "diretor: '" + diretor + '\'' +
                "%n";
    }
}
