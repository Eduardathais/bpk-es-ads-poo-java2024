package exercicio07;

public class Aluno {

    private String nome;
    private String matricula;
    private String curso;
    private double[] notas;

    public Aluno(String nome, String matricula, String curso, double[] notas) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.notas = notas;
    }

    public double calcularMedia() {
        if (notas == null || notas.length == 0) {
            return 0.0;
        }

        double soma = 0.0;
        for (double nota : notas) {
            soma += nota;
        }

        return soma / notas.length;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", matricula='" + matricula + '\'' +
                ", curso='" + curso + '\'' +
                ", média=" + calcularMedia() +
                '}';
    }
}
