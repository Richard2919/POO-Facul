import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
import java.util.Random;

public class JogoDaForca {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // 1. Banco de palavras simples
        String[] palavras = {"JAVA", "COMPUTADOR", "ALGORITMO", "PROGRAMACAO", "TECLADO", "INTERNET"};

        // Escolhe uma palavra aleatória e converte para maiúsculas
        String palavraSecreta = palavras[random.nextInt(palavras.length)].toUpperCase();

        // 2. Variáveis de controle
        int maxTentativas = 6;
        int tentativasAtuais = 0;
        Set<Character> letrasTentadas = new HashSet<>(); // Usa Set para não permitir letras repetidas
        boolean ganhou = false;

        // Cria o array visual da palavra (ex: _ _ _ _)
        char[] palavraMascarada = new char[palavraSecreta.length()];
        for (int i = 0; i < palavraMascarada.length; i++) {
            palavraMascarada[i] = '_';
        }

        System.out.println("=== BEM-VINDO AO JOGO DA FORCA ===");

        // 3. Loop principal do jogo
        while (tentativasAtuais < maxTentativas && !ganhou) {

            desenharForca(tentativasAtuais);
            System.out.println("\nPalavra: " + String.valueOf(palavraMascarada));
            System.out.println("Tentativas restantes: " + (maxTentativas - tentativasAtuais));
            System.out.println("Letras já usadas: " + letrasTentadas);
            System.out.print("Digite uma letra: ");

            // Captura a entrada e pega apenas a primeira letra, em maiúsculo
            String input = scanner.nextLine().toUpperCase();

            if (input.isEmpty()) continue; // Se der enter vazio, ignora
            char letra = input.charAt(0);

            // Validação: Verifica se é letra e se já foi usada
            if (!Character.isLetter(letra)) {
                System.out.println(">> Por favor, digite apenas letras.");
                continue;
            }

            if (letrasTentadas.contains(letra)) {
                System.out.println(">> Você já tentou essa letra!");
                continue;
            }

            letrasTentadas.add(letra);

            // 4. Verifica se acertou ou errou
            if (palavraSecreta.indexOf(letra) >= 0) {
                System.out.println(">> ACERTOU a letra '" + letra + "'!");

                // Atualiza a máscara
                for (int i = 0; i < palavraSecreta.length(); i++) {
                    if (palavraSecreta.charAt(i) == letra) {
                        palavraMascarada[i] = letra;
                    }
                }
            } else {
                System.out.println(">> ERROU! A letra '" + letra + "' não existe.");
                tentativasAtuais++;
            }

            // Verifica condição de vitória (se não houver mais '_')
            if (String.valueOf(palavraMascarada).equals(palavraSecreta)) {
                ganhou = true;
            }
        } // Fim do While

        // 5. Resultado Final
        if (ganhou) {
            System.out.println("\n=================================");
            System.out.println("PARABÉNS! VOCÊ GANHOU!");
            System.out.println("A palavra era: " + palavraSecreta);
            System.out.println("=================================");
        } else {
            desenharForca(tentativasAtuais); // Desenha o boneco completo
            System.out.println("\n=================================");
            System.out.println("GAME OVER! VOCÊ PERDEU.");
            System.out.println("A palavra era: " + palavraSecreta);
            System.out.println("=================================");
        }

        scanner.close();
    }

    // Método auxiliar para desenhar o bonequinho baseado nos erros
    public static void desenharForca(int erros) {
        System.out.println("  _______");
        System.out.println("  |     |");

        if (erros >= 1) System.out.println("  |     O");
        else System.out.println("  |");

        if (erros >= 2) {
            if (erros == 2) System.out.println("  |     |");
            else if (erros == 3) System.out.println("  |    /|");
            else System.out.println("  |    /|\\");
        } else System.out.println("  |");

        if (erros >= 5) {
            if (erros == 5) System.out.println("  |    /");
            else System.out.println("  |    / \\");
        } else System.out.println("  |");

        System.out.println("  |");
        System.out.println("__|__");
    }
}