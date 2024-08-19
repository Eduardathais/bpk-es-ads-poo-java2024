import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class ex16 {
    public static void main(String[] args) {
        Integer escolha = parseInt(input("Escolha a conversão: \n1. Celsius para Fahrenheit\n2. Fahrenheit para Celsius\nDigite 1 ou 2:"));
        double temperatura = Double.parseDouble(input("Digite a temperatura a ser convertida:"));

        if (escolha == 1) {
            double fahrenheit = toFahrenheit(temperatura);
            System.out.println(temperatura + "°C é igual a " + fahrenheit + "°F.");
        } else if (escolha == 2) {
            double celsius = toCelsius(temperatura);
            System.out.println(temperatura + "°F é igual a " + celsius + "°C.");
        } else {
            System.out.println("Opção inválida.");
        }
    }

    public static double toFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static double toCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public static String input(String msg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(msg);
        return scanner.nextLine();
    }
}
