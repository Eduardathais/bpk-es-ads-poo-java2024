package exercicio10;

public class TesteVeiculo {
    public static void main(String[] args) {
        Veiculo meucarrinho = new Veiculo("carro", "zyz0000", "branco");

        meucarrinho.abastecer();
        meucarrinho.lavar();

        System.out.println(meucarrinho.getCor());
        System.out.println(meucarrinho.getPlaca());
    }
}
