package EmpregadoEmpresa;

public class Empregado {
    private String nome;
    private String matricula;
    private Empresa empresa;

    public Empregado(String nome, String matricula, Empresa empresa) {
        this.setNome(nome);
        this.setMatricula(matricula);
        this.setEmpresa(empresa);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        return String.format(
                "nome='" + nome + "%n" +
                "matricula='" + matricula + "%n" +
                "empresa=" + empresa.getCnpj());
    }
}
