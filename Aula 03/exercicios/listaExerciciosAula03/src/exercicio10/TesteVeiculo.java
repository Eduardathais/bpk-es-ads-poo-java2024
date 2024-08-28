package exercicio10;

public class TesteVeiculo {
    public static void main(String[] args) {
        Veiculo meucarrinho = new Veiculo("carro", "zyz0000", "branco");

        System.out.println(meucarrinho);
        meucarrinho.abastecer();
        meucarrinho.lavar();
    }
}
