import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        String palavra = input("Digite uma palavra:");

        if (Palindromo(palavra)) {
            System.out.println(palavra + " é um palíndromo.");
        } else {
            System.out.println(palavra + " não é um palíndromo.");
        }
    }

    public static boolean Palindromo(String palavra) {
        StringBuilder reverso = new StringBuilder(palavra);
        return palavra.equals(reverso.reverse().toString());
    }

    public static String input(String msg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(msg);
        return scanner.nextLine();
    }
}
