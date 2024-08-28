package exercicio01;

public class TesteLivro {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Tudo e rio", "Carla Madeira", 200);

        System.out.println(livro1);
        livro1.abrirLivro();
        livro1.lerPagina(5);
        livro1.getPaginaAtual(5);
        System.out.println(livro1.getLivroAberto());
        System.out.println(livro1.getLivroAberto());


    }
}
