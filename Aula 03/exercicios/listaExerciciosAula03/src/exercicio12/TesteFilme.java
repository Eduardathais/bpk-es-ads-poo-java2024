package exercicio12;

public class TesteFilme {
    public static void main(String[] args) {
        Filme filme1 = new Filme("Interestelar", "Christopher Nolan", 169);

        filme1.iniciar();
        filme1.parar();
        filme1.parar();
        System.out.println(filme1.getDiretor());
        System.out.println(filme1.getTitulo());
        System.out.println(filme1.getDuracao());
        System.out.println(filme1.isEmExibicao());

    }
}
