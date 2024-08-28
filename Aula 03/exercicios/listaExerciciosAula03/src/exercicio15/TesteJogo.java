package exercicio15;

public class TesteJogo {
    public static void main(String[] args) {
        Jogo jogo = new Jogo("Supermaket Simulator", "Simulação", 29.99);
        System.out.println(jogo);
        jogo.iniciar();
        System.out.println(jogo);
        jogo.pausar();
        System.out.println(jogo);
    }
}
