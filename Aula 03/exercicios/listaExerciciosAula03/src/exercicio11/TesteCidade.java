package exercicio11;

public class TesteCidade {
    public static void main(String[] args) {
        Cidade cidade = new Cidade("Santa Helena", 25000, "Paraná");

        System.out.println(cidade);
        cidade.aumentarPopulacao(5000);
        cidade.diminuirPopulacao(3000);
        System.out.println(cidade);
    }
}
