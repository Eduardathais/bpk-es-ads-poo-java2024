import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ex7 {
    public static int soma(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        Integer num1 = parseInt(input("digite o primeiro numero"));
        Integer num2 = parseInt(input("digite o segundo numero"));
        int resultado = soma(num1, num2);

        System.out.println("A soma de " + num1 + " + " + num2 + " é " + resultado);
    }

    public static String input(String msg){
        Scanner scanner = new Scanner(System.in);
        System.out.println(msg);
        return scanner.nextLine();
    }
}
