package Exercicio4;

public class Funcionario {

    private String nome;
    private String cpf;
    protected double salario;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double bonificacao(){
        double b = salario * 0.10;
        return b;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void aumentaSalario (double percent) {
        salario = salario + (salario * (percent /100));
    }

    public double totalProventos () {
        double total;
        total = (salario + bonificacao() * 12);
        if (this instanceof Vendedor) {
            for (int i = 0; i < 12; i++) {
                total += (((Vendedor) this).getComissaoPercent() * ((Vendedor) this).getVendasPorMes(i));
            }
        }

        return total;
    }

    @Override
    public String toString() {
        return String.format("Funcionario{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", salario= %.2f", salario +
                '}');
    }
}
