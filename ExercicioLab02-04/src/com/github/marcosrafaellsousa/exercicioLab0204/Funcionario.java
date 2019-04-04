package com.github.marcosrafaellsousa.exercicioLab0204;

public class Funcionario {
    private String cpf;
    private String matricula;
    private String nome;
    private String cargo;
    private double salario;
    private String departamento;
    private Endereco endereco;

    //nome, cpf e matrícula e inicializa os dados do funcionário

    public Funcionario (String nome, String cpf, String matricula) {
        this.nome = nome;
        this.cpf = cpf;
        this.matricula = matricula;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public boolean aumentaSalario (double percentualParam) {
        salario = salario * ((percentualParam + 100) / 100);
        return true;
    }

    @Override
    public String toString() {
        return String.format("%s - %s - %s - Departamento : %s - Cargo : %s",matricula, cpf, nome, departamento,
                cargo);
    }
}
