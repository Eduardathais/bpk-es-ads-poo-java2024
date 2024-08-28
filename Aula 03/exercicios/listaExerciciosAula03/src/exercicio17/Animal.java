package exercicio17;

public class Animal {

    private String especie;
    private int idade;
    private double peso;
    private boolean alimentado;
    private boolean dormindo;

    public Animal(String especie, int idade, double peso) {
        this.especie = especie;
        this.idade = idade;
        this.peso = peso;
        this.alimentado = false;
        this.dormindo = false;
    }

    public void alimentar() {
        if (!alimentado) {
            alimentado = true;
            System.out.println("O '" + especie + "' foi alimentado.");
        } else {
            System.out.println("O '" + especie + "' já foi alimentado.");
        }
    }

    public void dormir() {
        if (!dormindo) {
            dormindo = true;
            System.out.println("O '" + especie + "' está dormindo.");
        } else {
            System.out.println("O '" + especie + "' já está dormindo.");
        }
    }

    @Override
    public String toString() {
        return "Animal{" +
                "especie='" + especie + '\'' +
                ", idade=" + idade +
                ", peso=" + peso +
                ", alimentado=" + (alimentado ? "Sim" : "Não") +
                ", dormindo=" + (dormindo ? "Sim" : "Não") +
                '}';
    }
}
