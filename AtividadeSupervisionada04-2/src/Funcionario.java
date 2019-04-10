public class Funcionario extends Pessoa{

    private String matricula;
    private double salario;

    public Funcionario(String nome, String matricula) {
        super(nome);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void aumentarSalario(double percentual) {
        this.salario += salario * (percentual / 100);
    }

    public double getRecebimentoAnual () {
        return salario * 12;
    }
}
