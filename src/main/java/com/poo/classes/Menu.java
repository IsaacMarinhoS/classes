package com.poo.classes;
import java.util.Scanner;

public class Menu {
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Funcionario funcionario = null;
    
            // Exemplos de criação de funcionários
            Gerente gerente = new Gerente("Isaac", "123.456.789-00", "Rua A", "isaac", "1234", 5000.0);
            Atendente atendente = new Atendente("Joaquim", "987.654.321-00", "Rua B", "jo123", "abcd", 2000.0);
    
            System.out.println("Digite o login:");
            String login = scanner.nextLine();
            System.out.println("Digite a senha:");
            String senha = scanner.nextLine();
    
            if (gerente.autentica(login, senha)) {
                funcionario = gerente;
            } else if (atendente.autentica(login, senha)) {
                funcionario = atendente;
            } else {
                System.out.println("Login ou senha inválidos.");
            }
    
            if (funcionario != null) {
                System.out.println("Digite 1 para calcular e imprimir o contra-cheque:");
                int opcao = scanner.nextInt();
                if (opcao == 1) {
                    funcionario.imprimeContraCheque();
                } else {
                    System.out.println("Opção inválida.");
                }
            }
        }
    }
