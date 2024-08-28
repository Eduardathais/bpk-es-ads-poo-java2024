package exercicio11;

public class Cidade {

    private String nome;
    private int populacao;
    private String estado;

    public Cidade(String nome, int populacao, String estado) {
        this.nome = nome;
        this.populacao = populacao;
        this.estado = estado;
    }

    public void aumentarPopulacao(int quantidade) {
        if (quantidade > 0) {
            populacao += quantidade;
            System.out.println("População de " + nome + " aumentada em " + quantidade + " habitantes.");
        } else {
            System.out.println("Quantidade inválida para aumento da população.");
        }
    }

    public void diminuirPopulacao(int quantidade) {
        if (quantidade > 0 && quantidade <= populacao) {
            populacao -= quantidade;
            System.out.println("População de " + nome + " diminuída em " + quantidade + " habitantes.");
        } else if (quantidade > populacao) {
            System.out.println("Quantidade para diminuição excede a população atual.");
        } else {
            System.out.println("Quantidade inválida para diminuição da população.");
        }
    }

    @Override
    public String toString() {
        return "Cidade{" +
                "nome='" + nome + '\'' +
                ", populacao=" + populacao +
                ", estado='" + estado + '\'' +
                '}';
    }
}
