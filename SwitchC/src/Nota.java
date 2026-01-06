import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor de 0 a 10");
        int opcao = scanner.nextInt();

        switch (opcao){
            case 10:
            case 9:
                System.out.println("Conceito 'A' ");
                break;
            case 8:
            case 7:
                System.out.println("Conceito 'B' ");
                break;
            case 6:
            case 5:
                System.out.println("Conceito 'C' ");
            case 4:
            case 3:
                System.out.println("Conceito 'D' ");
            case 2:
            case 1:
                System.out.println("Conceito 'F' ");
            default:
                System.out.println("Erro, opção inválida");
        }
        scanner.close();
    }
}
