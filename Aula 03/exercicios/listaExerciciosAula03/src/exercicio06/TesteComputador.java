package exercicio06;

public class TesteComputador {
    public static void main(String[] args) {
        Computador computador = new Computador("Intel i7", 16, 512);

        computador.ligar();
        computador.desligar();

        System.out.println(computador.getArmazenamento());
        System.out.println(computador.getProcessador());
        System.out.println(computador.getMemoriaRAM());

     }
}
