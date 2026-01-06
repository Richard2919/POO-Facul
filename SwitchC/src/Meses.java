import java.util.Scanner;

public class Meses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma opção (1-12) para ver o nome do mês: ");
        int opcao = scanner.nextInt();

        switch (opcao){
            case 1:
                System.out.println("Mês de: janeiro");
                break;
            case 2:
                System.out.println("Mês de: fevereiro");
                break;
            case 3:
                System.out.println("Mês de: março");
                break;
            case 4:
                System.out.println("Mês de: abril");
                break;
            case 5:
                System.out.println("Mês de: maio");
                break;
            case 6:
                System.out.println("Mês de: junho");
                break;
            case 7:
                System.out.println("Mês de: julho");
                break;
            case 8:
                System.out.println("Mês de: agosto");
                break;
            case 9:
                System.out.println("Mês de: setembro");
                break;
            case 10:
                System.out.println("Mês de: outubro");
                break;
            case 11:
                System.out.println("Mês de: novembro");
                break;
            case 12:
                System.out.println("Mês de: dezembro");
                break;
            default:
                System.out.println("Erro, opção inválida");
        }
        scanner.close();
    }
}
