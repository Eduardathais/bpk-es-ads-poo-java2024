package exercicio17;

public class TesteAnimal {
    public static void main(String[] args) {
        Animal tamagotchi = new Animal("tamagotchi", 1, 0.5);

        tamagotchi.alimentar();
        tamagotchi.dormir();
        System.out.println(tamagotchi.getEspecie());
    }
}
