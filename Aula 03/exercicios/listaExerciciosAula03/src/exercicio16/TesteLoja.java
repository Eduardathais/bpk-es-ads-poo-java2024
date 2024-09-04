package exercicio16;

public class TesteLoja {
    public static void main(String[] args) {
        Loja loja = new Loja("Lojas pônei", "Rua dos pôneis, 123", "(41) 1234-0000");

        loja.abrir();
        loja.fechar();
        System.out.println(loja.getNome());

    }
}
