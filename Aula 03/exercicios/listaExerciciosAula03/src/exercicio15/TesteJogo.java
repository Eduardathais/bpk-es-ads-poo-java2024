package exercicio15;

public class TesteJogo {
    public static void main(String[] args) {
        Jogo jogo = new Jogo("Supermaket Simulator", "Simulação", 29.99);
        jogo.iniciar();
        jogo.pausar();
        System.out.println(jogo.isEmExecucao());
        System.out.println(jogo.getNome());
    }
}
