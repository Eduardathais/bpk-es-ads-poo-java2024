import java.util.Random;
import java.util.Scanner;
public class ex13 {
        public static void main(String[] args) {
            Random random = new Random();
            Scanner scanner = new Scanner(System.in);

            int numeroAleatorio = random.nextInt(100) + 1;
            int tentativas = 0;
            int palpite = 0;

            System.out.println("Bem-vindo ao jogo de adivinhação!");
            System.out.println("Estou pensando em um número entre 1 e 100. Tente adivinhar!");

            while (palpite != numeroAleatorio) {
                System.out.print("Digite seu palpite: ");
                palpite = scanner.nextInt();
                tentativas++;

                if (palpite < numeroAleatorio) {
                    System.out.println("Muito baixo! Tente novamente.");
                } else if (palpite > numeroAleatorio) {
                    System.out.println("Muito alto! Tente novamente.");
                } else {
                    System.out.println("Parabéns! Você adivinhou o número em " + tentativas + " tentativas.");
                }
            }
        }
}
