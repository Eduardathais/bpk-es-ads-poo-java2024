import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class ex8 {
    public static void main(String[] args) {
        String nome = input("Informe seu nome");
        Integer idade = parseInt(input("Informe sua idade"));

        System.out.println("Nome: " + nome + ". Idade:" + idade);
    }

    public static String input(String msg){
        Scanner scanner = new Scanner(System.in);
        System.out.println(msg);
        return scanner.nextLine();
    }
}