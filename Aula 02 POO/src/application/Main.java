import entity.Pessoa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome da pessoa: ");
        String nome = sc.nextLine();

        System.out.println("Digite a idade da pessoa: ");
        int idade = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite o genero da pessoa (M/F): ");
        char genero = sc.next().charAt(0);

        Pessoa pessoa = new Pessoa(nome,idade,genero);

        System.out.println("Dados");
        System.out.println(pessoa);


        sc.close();
    }
}
