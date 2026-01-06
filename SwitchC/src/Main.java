import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escolha uma opção de 1 a 7 para mostrar os dias da semana: ");
        int opcao = scanner.nextInt();

        switch (opcao){
            case 1:
                System.out.println("Dia da semana: segunda-feira");
                break;
            case 2:
                System.out.println("Dia da semana: terça-feira");
                break;
            case 3:
                System.out.println("Dia da semana: quarta-feira");
                break;
            case 4:
                System.out.println("Dia da semana: quinta-feira");
                break;
            case 5:
                System.out.println("Dia da semana: sexta-feira");
                break;
            case 6:
                System.out.println("Dia da semana: sábado");
                break;
            case 7:
                System.out.println("Dia da semana: domingo");
                break;
            default:
                System.out.println("Erro, opção inválida");
        }
        scanner.close();
    }

}