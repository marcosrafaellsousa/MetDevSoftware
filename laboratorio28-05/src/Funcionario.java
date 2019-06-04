public class Funcionario {

    private String nome;
    private char sexo;
    private double salario;
    private int dependentes;

    Funcionario(String nome, char sexo, double salario, int dependentes) {
        this.setNome(nome);
        this.setSexo(sexo);
        this.setSalario(salario);
        this.setDependentes(dependentes);
    }

    public double impostoRenda() {
        double reducaoDep = 189.59 * getDependentes();
        if (getSalario() <= 1903.98)
            return 0;
        else if (getSalario() <= 2826.65)
            return (getSalario() * 7.5 / 100 - 142.80) - reducaoDep;
        else if (getSalario() <= 3751.05)
            return (getSalario() * 15 / 100 - 354.80) - reducaoDep;
        else if (getSalario() <= 4664.68)
            return (getSalario() * 22.5 / 100 - 636.13) - reducaoDep;
        else
            return ((getSalario() * 27.5 / 100) - 869.36) - reducaoDep;

    }

    public String mostraFuncionario() {
        return getNome() + " " + String.valueOf(getSexo()) + " " + String.format("%.2f", getSalario()) + " " + getDependentes() + " " + String.format("%.2f", impostoRenda());
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getDependentes() {
        return dependentes;
    }

    public void setDependentes(int dependentes) {
        this.dependentes = dependentes;
    }
}
