package exercicio06;

public class TesteComputador {
    public static void main(String[] args) {
        Computador computador = new Computador("Intel i7", 16, 512);

        System.out.println(computador);
        computador.ligar();
        System.out.println(computador);
        computador.desligar();
        System.out.println(computador);
     }
}
