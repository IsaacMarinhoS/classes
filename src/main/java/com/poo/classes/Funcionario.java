package com.poo.classes;

public abstract class Funcionario extends Pessoa {
    private String login;
    private String senha;
    private double salario;

    public Funcionario(String nome, String cpf, String endereco, String login, String senha, double salario) {
        super(nome, cpf, endereco);
        this.login = login;
        this.senha = senha;
        this.salario = salario;
    }

    public boolean autentica(String login, String senha) {
        return this.login.equals(login) && this.senha.equals(senha);
    }

    public abstract void imprimeContraCheque();

    // Getters e Setters
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
