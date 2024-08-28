package exercicio07;

public class TesteAluno {
    public static void main(String[] args) {
        double[] notas = {9.5, 9.6, 9.0, 9.4};
        Aluno aluno = new Aluno("Eduarda", "2024999", "ADS", notas);

        System.out.println(aluno);
    }
}
