package Exercicio3;

public class Filme extends  Item{

    private String diretor;

    public Filme(String titulo, int ano, String tempoDeDuracao, String diretor) {
        super(titulo, ano, tempoDeDuracao);
        this.diretor = diretor;
    }

    public Filme() {
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public String toString() {
        return String.format("Filme: " +
                super.toString() +
                "diretor: '" + diretor + '\'' +
                "%n");
    }
}
