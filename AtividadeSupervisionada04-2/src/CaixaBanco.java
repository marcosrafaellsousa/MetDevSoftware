public class CaixaBanco extends Funcionario{

    private String horario;

    public CaixaBanco(String nome, String matricula) {
        super(nome, matricula);
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getHorario() {
        return horario;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s%nMatricula: %s%nTelefone: %s%nHorario: %s%nSalario: %.2f%n" +
                        "Recebimento anual: %.2f%n", getNome(), getMatricula(), getTelefone(), getHorario(),
                getSalario(), getRecebimentoAnual());
    }
}
