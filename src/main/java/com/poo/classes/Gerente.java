package com.poo.classes;

public class Gerente extends Funcionario {
    public Gerente(String nome, String cpf, String endereco, String login, String senha, double salario) {
        super(nome, cpf, endereco, login, senha, salario);
    }

    @Override
    public void imprimeContraCheque() {
        double fgts = getSalario() * 0.08;
        double inss = getSalario() * 0.11;
        System.out.println("ContraCheque Gerente:");
        System.out.println("Salário: " + getSalario());
        System.out.println("FGTS: " + fgts);
        System.out.println("INSS: " + inss);
        System.out.println("Salário Líquido: " + (getSalario() - inss));
    }
}