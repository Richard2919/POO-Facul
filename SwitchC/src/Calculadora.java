import  java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Escolha uma operção (+, -, *, / ) e pressione # para sair: ");
            char opcao = scanner.next().charAt(0);

            if(opcao == '#'){
                System.out.println("Encerrando programa");
                break;
            }

            Float a, b, resultado;
            System.out.println("Digite o primeiro numero:");
            a = scanner.nextFloat();
            System.out.println("Digite o segundo numero:");
            b = scanner.nextFloat();


            switch (opcao) {
                case '+':
                    resultado = a + b;
                    System.out.println("O resultado da soma é: " + resultado);
                    break;
                case '-':
                    resultado = a - b;
                    System.out.println("O resultado da subtração é: " + resultado);
                    break;
                case '*':
                    resultado = a * b;
                    System.out.println("O resultado da multiplicação é: " + resultado);
                    break;
                case '/':
                    if (b == 0) {
                        System.out.println("Erro, divisão por 0");
                        break;
                    }
                    resultado = a / b;
                    System.out.println("O resultado da divisão é: " + resultado);
                    break;

                default:
                    System.out.println("Erro, operação inválida");

            }
        } while (true);
        scanner.close();
    }
}
