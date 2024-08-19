import java.util.Scanner;
public class ex12 {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - 1; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }

        System.out.println("Números em ordem crescente:");
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}
