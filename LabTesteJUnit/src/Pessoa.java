public class Pessoa {

    //seu nome, salário, idade e número de dependentes.
    private String nome;
    private double salario;
    private int idade;
    private int dependentes;

    public Pessoa() {
    }

    public Pessoa(String nome, double salario, int dependentes, int idade) {
        this.setNome(nome);
        this.setSalario(salario);
        this.setIdade(idade);
        this.setDependentes(dependentes);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getDependentes() {
        return dependentes;
    }

    public void setDependentes(int dependentes) {
        this.dependentes = dependentes;
    }

    public double calculaImposto() {
        double imposto;
        double deducao;
        if (this.getSalario() <= 1787.77 || this.getIdade() >= 65) {
            imposto = 0.0;
            deducao = 0.0;
        } else if (this.getSalario() <= 2679.29) {
            imposto = this.getSalario() * 0.075;
            deducao = 134.08;
        } else if (this.getSalario() <= 3572.43) {
            imposto = this.getSalario() * 0.15;
            deducao = 335.03;
        } else if (this.getSalario() <= 4463.81) {
            imposto = this.getSalario() * 0.225;
            deducao = 602.96;
        }else {
            imposto = this.getSalario() * 0.275;
            deducao = 826.15;
        }

        deducao += this.getDependentes() * 179.71;
        imposto -= deducao;
        if (imposto < 0) {
            imposto = 0;
        }
        return imposto;
    }
}
