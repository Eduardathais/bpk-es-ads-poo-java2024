package exercicio03;

public class TestePessoa {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Eduarda", 26, 1.63);
        System.out.println(pessoa1.getNome());
        System.out.println(pessoa1.getIdade());
        System.out.println(pessoa1.getAltura());
    }
}
