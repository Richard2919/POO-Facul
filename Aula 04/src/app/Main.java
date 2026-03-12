package app;

import entity.ContaBancaria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       /* conta.setNumeroConta("123456");
        conta.setAgencia("32");
        conta.setSaldo(12000.0);

        System.out.println("Conta: " + conta.getNumeroConta());
        System.out.println("Agencia: " + conta.getAgencia());
        System.out.println("Saldo: " + conta.getSaldo());
        */


        System.out.println("--- Anertura de conta --- ");
        System.out.println("Digite o numero da sua conta: ");
        String numeroConta = sc.nextLine();

        System.out.println("Digite o numero da sua agencia: ");
        String numeroAgencia = sc.nextLine();


        ContaBancaria conta = new ContaBancaria(numeroConta, numeroAgencia);

        System.out.println("=== CONTA CRIADA COM SUCESSO ===");
        System.out.println("Saldo inicial: " + conta.getSaldo());

        int opcao = 0;

        while (opcao != 4){


            System.out.println("=== MENU BANCARIO ===");
            System.out.println("1. Ver saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Sair");
            System.out.println("Escolha uma opção");

            switch (opcao){
                case 1:
                    System.out.println("Seu saldo é: R$ " + conta.getSaldo());
                    break;

                case 2:
                    System.out.println("Digite o valor que deseja depositar: R$ ");
                    double valorDeposito = Double.parseDouble(sc.nextLine());
                    conta.depositar(valorDeposito);
                    System.out.println("Deposito efetuado com sucesso! Novo saldo: " + conta.getSaldo());
                    break;

                case 3:
                    System.out.println("Digite o valor que deseja sacar: R$ ");
                    double sacarValor = Double.parseDouble(sc.nextLine());
                    conta.sacar(sacarValor);
                    System.out.println("Saque efetuado com sucesso! Novo saldo: R$ " + conta.getSaldo());
                    break;

                case 4:
                    System.out.println("Saindo do sistema... Volte sempre!");
                    break;

                default:
                    System.out.println("Erro, tente novamente");
                    break;
            }
        }
        sc.close();
    }
}