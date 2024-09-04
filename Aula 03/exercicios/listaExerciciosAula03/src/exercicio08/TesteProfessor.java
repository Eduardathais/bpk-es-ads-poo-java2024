package exercicio08;

public class TesteProfessor {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Lili", "LP", 2.50);

        professor1.darAula();
        professor1.corrigirProvas();
        System.out.println(professor1.getNome());
        System.out.println(professor1.getDisciplina());
        System.out.println(professor1.getSalario());
    }
}
