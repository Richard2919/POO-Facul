package application;

import entity.Pedido;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        List<Pedido> listaPedidos = new ArrayList<>();

        do {
            System.out.println("\n--- SISTEMA DE PEDIDOS ---");
            System.out.println("1 - Novo pedido (Definir Nome e Valor Base)");
            System.out.println("2 - Acrescentar item");
            System.out.println("3 - Calcular valor total");
            System.out.println("4 - Resumo do pedido");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("\n[ NOVO PEDIDO ]");
                    System.out.print("Digite o nome do lanche/prato: ");
                    String nomeDigitado = sc.nextLine();

                    System.out.print("Digite o valor base (Ex: 20): ");
                    int valorDigitado = sc.nextInt();
                    sc.nextLine();

                    Pedido novoPedido = new Pedido(nomeDigitado, valorDigitado);
                    listaPedidos.add(novoPedido);

                    System.out.println("Pedido criado com sucesso!");
                    break;

                case 2:
                    System.out.println("\n[ ACRESCENTAR ITEM ]");
                    if (listaPedidos.isEmpty()) {
                        System.out.println("Crie um pedido primeiro (Opção 1)!");
                        break;
                    }


                    System.out.println("Escolha a qual produto deseja adicionar o item:");
                    for (int i = 0; i < listaPedidos.size(); i++) {

                        System.out.println((i + 1) + " - " + listaPedidos.get(i).getNome());
                    }

                    System.out.print("Digite o número do produto: ");
                    int numeroProduto = sc.nextInt();
                    sc.nextLine();


                    if (numeroProduto < 1 || numeroProduto > listaPedidos.size()) {
                        System.out.println("Produto inválido! Operação cancelada.");
                        break;
                    }


                    Pedido pedidoEscolhido = listaPedidos.get(numeroProduto - 1);


                    System.out.println("Nome do adicional (ex: bacon, batata): ");
                    String nomeItem = sc.nextLine();

                    System.out.print("Valor do adicional: R$ ");
                    int valorItem = sc.nextInt();
                    sc.nextLine();


                    pedidoEscolhido.adicionarItem(nomeItem, valorItem);
                    break;

                case 3:
                    System.out.println("\n[ CALCULAR VALOR TOTAL ]");
                   int valorTotalCarrinho = 0;
                   for (Pedido p : listaPedidos){
                       valorTotalCarrinho += p.getValor();
                   }
                    System.out.println("Valor total do carrinho é: " + valorTotalCarrinho);
                    break;

                case 4:
                    System.out.println("\n[ RESUMO DO PEDIDO ]");
                    if (!listaPedidos.isEmpty()){
                        for (int i = 0; i < listaPedidos.size(); i++){
                            System.out.println("\n--- PRODUTO " + (i + 1) + "---");
                            listaPedidos.get(i).imprimirResumo();
                        }
                    }else {
                        System.out.println("Nenhum pedido iniciado");
                    }

                    break;

                case 0:
                    System.out.println("\nSaindo do sistema. Até logo!");
                    break;

                default:
                    System.out.println("\n Opção inválida!");
                    break;
            }

        } while (opcao != 0);

        sc.close();
    }
}