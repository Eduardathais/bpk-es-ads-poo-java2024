package exercicio12;

public class TesteFilme {
    public static void main(String[] args) {
        Filme filme1 = new Filme("Interestelar", "Christopher Nolan", 169);

        System.out.println(filme1);
        filme1.iniciar();
        filme1.parar();
        filme1.parar();
        System.out.println(filme1);
    }
}
