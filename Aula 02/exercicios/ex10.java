import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ex10 {
    public static void main(String[] args) {
        Integer num = parseInt(input("digite o número"));

        if (num <= 1) {
            System.out.println(num + " não é um número primo.");
        } else {
            boolean primo = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    primo = false;
                    break;
                }
            }

            if (primo) {
                System.out.println(num + " é um número primo.");
            } else {
                System.out.println(num + " não é um número primo.");
            }
        }

    }

    public static String input(String msg){
        Scanner scanner = new Scanner(System.in);
        System.out.println(msg);
        return scanner.nextLine();
    }
}
