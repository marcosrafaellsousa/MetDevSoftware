public class Administrador extends Funcionario{

    private double salarioMensal;

    public Administrador(String nome, String sobrenome, double salarioMensal) {
        super(nome, sobrenome);
        this.salarioMensal = salarioMensal;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    public double calcularSalario() {
        return this.getSalarioMensal();
    }

    @Override
    public String toString() {
        return super.toString() +
                String.format(", salario mensal=%.2f", salarioMensal );
    }
}
