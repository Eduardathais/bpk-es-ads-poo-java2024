package exercicio15;

public class Jogo {

    private String nome;
    private String genero;
    private double preco;
    private boolean emExecucao;

    public Jogo(String nome, String genero, double preco) {
        this.nome = nome;
        this.genero = genero;
        this.preco = preco;
        this.emExecucao = false;
    }

    public void iniciar() {
        if (!emExecucao) {
            emExecucao = true;
            System.out.println("O jogo '" + nome + "' está agora em execução.");
        } else {
            System.out.println("O jogo '" + nome + "' já está em execução.");
        }
    }

    public void pausar() {
        if (emExecucao) {
            emExecucao = false;
            System.out.println("O jogo '" + nome + "' foi pausado.");
        } else {
            System.out.println("O jogo '" + nome + "' já está pausado.");
        }
    }

    @Override
    public String toString() {
        return "Jogo{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", preco=" + preco +
                ", emExecucao=" + (emExecucao ? "Sim" : "Não") +
                '}';
    }
}
