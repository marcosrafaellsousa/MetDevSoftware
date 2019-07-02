public class Funcionario {

    private String nome;
    private String sobrenome;


    public Funcionario(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double calcularSalario(){
        return 0;
    }
    @Override
    public String toString() {
        return
                "nome=" + nome +
                ", sobrenome=" + sobrenome;
    }
}
