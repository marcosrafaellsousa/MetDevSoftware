public class Gerente extends Funcionario {
    private double bonificacao;
    private String tipo;

    public Gerente(String nome, String matricula) {
        super(nome, matricula);
    }

    public double getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(double bonificacao) {
        this.bonificacao = bonificacao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public double getRecebimentoAnual () {
        return super.getRecebimentoAnual()+ (bonificacao * 12);
    }

    @Override
    public String toString() {
        return String.format("Nome: %s%nMatricula: %s%nTelefone: %s%nTipo: %s%nSalario: %.2f%nBonificacao %.2f%n" +
                        "Recebimento anual: %.2f%n", getNome(), getMatricula(), getTelefone(),getTipo(), getSalario(),
                getBonificacao(), getRecebimentoAnual());
    }
}
