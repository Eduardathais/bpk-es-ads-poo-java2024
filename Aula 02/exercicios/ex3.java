import java.util.Scanner;
import static java.lang.Double.parseDouble;

public class ex3 {

     public static void main(String[] args) {
         ex3 operacao = new ex3();
         Double num1 = parseDouble(input("digite o primeiro numero"));
         Double num2 = parseDouble(input("digite o segundo numero"));

         operacao.soma(num1, num2);
         operacao.mult(num1, num2);
         operacao.sub(num1, num2);
         operacao.div(num1, num2);
     }

     public void soma(Double x, Double y) {
         System.out.println("resultado da soma de " + x + " + " + y + " = " + (x + y));
     }

     public void mult(Double x, Double y) {
         System.out.println("resultado da multiplicacao de " + x + " x " + y + " = " + (x * y));
     }

     public void sub(Double x, Double y) {
         System.out.println("resultado da subtracao de " + x + " - " + y + " = " + (x - y));
     }

     public void div(Double x, Double y) {
         System.out.println("resultado da divisao de " + x + " / " + y + " = " + (x / y));
     }

     public static String input(String msg){
         Scanner scanner = new Scanner(System.in);
         System.out.println(msg);
         return scanner.nextLine();
     }

}
