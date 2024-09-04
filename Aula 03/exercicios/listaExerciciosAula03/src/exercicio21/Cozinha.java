package exercicio21;

public class Cozinha {

    private String tipo;
    private int quantidadePessoas;
    private String cor;
    private boolean limpa;

    public Cozinha(String tipo, int quantidadePessoas, String cor) {
        this.tipo = tipo;
        this.quantidadePessoas = quantidadePessoas;
        this.cor = cor;
        this.limpa = true;
    }

    public void cozinhar() {
        if (limpa) {
            limpa = false;
            System.out.println("A cozinha está em uso para cozinhar.");
        } else {
            System.out.println("A cozinha já está suja.");
        }
    }

    public void limpar() {
        if (!limpa) {
            limpa = true;
            System.out.println("A cozinha foi limpa.");
        } else {
            System.out.println("A cozinha já está limpa.");
        }
    }

    public String getTipo() {
        return tipo;
    }

    public int getQuantidadePessoas() {
        return quantidadePessoas;
    }

    public String getCor() {
        return cor;
    }

    public boolean isLimpa() {
        return limpa;
    }

    @Override
    public String toString() {
        return "Cozinha{" +
                "tipo='" + tipo + '\'' +
                ", quantidadePessoas=" + quantidadePessoas +
                ", cor='" + cor + '\'' +
                ", limpa=" + (limpa ? "Sim" : "Não") +
                '}';
    }
}
