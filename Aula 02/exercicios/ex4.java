import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class ex4 {

    public static void main(String[] args) {
        Integer num = parseInt(input("digite o numero"));
        if(num % 2 == 0) {
            System.out.println("Numero par");
        } else {
            System.out.println("Numero impar");
        }
    }

    public static String input(String msg){
        Scanner scanner = new Scanner(System.in);
        System.out.println(msg);
        return scanner.nextLine();
    }
}
