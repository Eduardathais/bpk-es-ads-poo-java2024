package exercicio08;

public class TesteProfessor {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Lili", "LP", 2.50);
        System.out.println(professor1);
        professor1.darAula();
        professor1.corrigirProvas();
    }
}
