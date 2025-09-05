package com.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Banco banco = new Banco("Banco Digital");

        Conta contaAtiva = null;

        while (true) { 

            if (contaAtiva == null) {
                // --- MENU INICIAL (DESLOGADO) ---
                System.out.println("\n===== Bem-vindo ao " + banco.getNome() + " =====");
                System.out.println("1 - Abrir Nova Conta");
                System.out.println("2 - Acessar Conta Existente");
                System.out.println("0 - Sair do Sistema");
                System.out.print("Escolha uma opção: ");
                int opcao = scanner.nextInt();
                scanner.nextLine(); // Limpa o buffer do scanner

                if (opcao == 1) {
                    System.out.print("Digite seu nome: ");
                    String nomeCliente = scanner.nextLine();
                    Cliente novoCliente = new Cliente(nomeCliente);

                    System.out.print("Qual tipo de conta? (1 - Corrente / 2 - Poupança): ");
                    int tipoConta = scanner.nextInt();

                    if (tipoConta == 1) {
                        contaAtiva = new Conta_Corrente(novoCliente);
                    } else {
                        contaAtiva = new Conta_Poupança(novoCliente);
                    }
                    banco.adicionarConta(contaAtiva);
                    System.out.println("Conta criada com sucesso! Você já está acessando sua nova conta.");

                } else if (opcao == 2) {
                    System.out.print("Digite o número da sua conta: ");
                    int numeroConta = scanner.nextInt();
                    contaAtiva = banco.acessarConta(numeroConta);
                    if (contaAtiva == null) {
                        System.out.println("Conta não encontrada. Tente novamente.");
                    }

                } else if (opcao == 0) {
                    System.out.println("Obrigado por usar nosso sistema.");
                    break; // Quebra o loop e encerra o programa
                }

            } else {
                // --- MENU LOGADO ---
                System.out.println("\n--- Olá, " + contaAtiva.getCliente().getNome() + "! ---");
                contaAtiva.imprimirExtrato();
                System.out.println("1 - Depositar");
                System.out.println("2 - Sacar");
                System.out.println("3 - Transferir");
                System.out.println("0 - Voltar ao Menu Principal (Sair da Conta)");
                System.out.print("Escolha uma opção: ");
                int opcao = scanner.nextInt();

                if (opcao == 1) {
                    System.out.print("Digite o valor do depósito: ");

                    double valor = scanner.nextDouble();
                    contaAtiva.depositar(valor);
                } else if (opcao == 2) {
                    System.out.print("Digite o valor do saque: ");

                    double valor = scanner.nextDouble();
                    contaAtiva.sacar(valor);
                } else if (opcao == 3) {
                    System.out.print("Digite o número da conta de destino: ");
                    
                    int numDestino = scanner.nextInt();
                    Conta contaDestino = banco.acessarConta(numDestino);

                    if (contaDestino != null) {

                        System.out.print("Digite o valor da transferência: ");
                        double valor = scanner.nextDouble();
                        contaAtiva.transferir(valor, contaDestino);
                    
                    } else {

                        System.out.println("Conta de destino não encontrada.");
                    
                    }

                } else if (opcao == 0) {

                    contaAtiva = null; // "Desloga" da conta e volta ao menu inicial

                }

            }

        }

        scanner.close();
        
    }

}