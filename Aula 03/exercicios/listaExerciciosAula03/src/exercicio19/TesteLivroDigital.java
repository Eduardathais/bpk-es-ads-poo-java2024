package exercicio19;

public class TesteLivroDigital {
    public static void main(String[] args) {
        LivroDigital livroDigital = new LivroDigital("Tudo é rio", "Carla Madeira", 2.5);
        System.out.println(livroDigital);


        livroDigital.abrir();
        livroDigital.fechar();
        System.out.println(livroDigital);
    }
}
