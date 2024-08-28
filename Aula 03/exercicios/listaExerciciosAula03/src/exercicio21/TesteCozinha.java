package exercicio21;

public class TesteCozinha {
    public static void main(String[] args) {
        Cozinha cozinha = new Cozinha("Clássica", 6, "Branca");

        System.out.println(cozinha);
        cozinha.cozinhar();
        cozinha.limpar();
        System.out.println(cozinha);
    }
}
