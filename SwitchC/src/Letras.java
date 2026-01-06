import java.util.Locale;
import java.util.Scanner;

public class Letras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma letra (A,B,C,D,F): ");
        String nota = scanner.next().toUpperCase();

        switch (nota){
            case "A":
                System.out.println("Nota: Excelente");
                break;
            case "B":
                System.out.println("Nota: Bom");
                break;
            case "C":
                System.out.println("Nota: Médio");
                break;
            case "D":
                System.out.println("Nota: Ruim");
                break;
            case "F":
                System.out.println("Reprovado");
                break;
            default:
            System.out.println("Erro, opção inválida");
        }
    }
}
