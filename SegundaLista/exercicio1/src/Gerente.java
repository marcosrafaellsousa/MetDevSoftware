public class Gerente extends Administrador {

    private double bonificacao;

    public Gerente(String nome, String sobrenome, double salarioMensal, double bonificacao) {
        super(nome, sobrenome, salarioMensal);
        this.bonificacao = bonificacao;
    }

    public double getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(double bonificacao) {
        this.bonificacao = bonificacao;
    }

    @Override
    public double calcularSalario() {
        return this.getSalarioMensal() + bonificacao;
    }

    @Override
    public String toString() {
        return super.toString() +
                String.format(", bonificacao=%.2f", bonificacao);
    }
}
