import java.util.Scanner;
public class ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        int fatorialIterativo = calcIterativo(numero);
        System.out.println("Fatorial de " + numero + " (Iterativo): " + fatorialIterativo);

        int fatorialRecursivo = calcRecursivo(numero);
        System.out.println("Fatorial de " + numero + " (Recursivo): " + fatorialRecursivo);
    }

    public static int calcIterativo(int n) {
        int fatorial = 1;
        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }
        return fatorial;
    }

    public static int calcRecursivo(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * calcRecursivo(n - 1);
        }
    }
}
