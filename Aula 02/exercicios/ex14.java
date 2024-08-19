import java.util.Scanner;
public class ex14 {
    public static void main(String[] args) {
        String texto = input("Digite uma string:");
        int numeroDeVogais = contarVogais(texto);

        System.out.println("O número de vogais na string é: " + numeroDeVogais);
    }

    public static int contarVogais(String texto) {
        int contador = 0;
        String vogais = "aeiouAEIOU";

        for (int i = 0; i < texto.length(); i++) {
            if (vogais.indexOf(texto.charAt(i)) != -1) {
                contador++;
            }
        }

        return contador;
    }

    public static String input(String msg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(msg);
        return scanner.nextLine();
    }
}
