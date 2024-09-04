package exercicio21;

public class TesteCozinha {
    public static void main(String[] args) {
        Cozinha cozinha = new Cozinha("Clássica", 6, "Branca");

        cozinha.cozinhar();
        cozinha.limpar();
        System.out.println(cozinha.getQuantidadePessoas());
        System.out.println(cozinha.getTipo());

    }
}
