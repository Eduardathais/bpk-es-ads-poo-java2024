package exercicio09;

public class TesteProduto {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Goiabada", 7.00, 19);

        produto1.aumentarEstoque(4);
        produto1.diminuirEstoque(8);
        produto1.diminuirEstoque(67);
        System.out.println(produto1.getNome());
    }
}
