package AlunosCursosDepartamentos;

public class Curso {
    private String nome;
    private String sigla;
    private Departamento departamento;

    public Curso (String nome, String sigla, Departamento departamento) {
        this.nome = nome;
        this.sigla = sigla;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return String.format("Nome do curso: %s%nSigla do curso: %s%nDepartamento %s%n",nome,sigla,
                departamento.getSigla());

    }
}
