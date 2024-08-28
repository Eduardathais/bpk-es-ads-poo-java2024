package exercicio05;

public class TesteCachorro {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro("picolé", "pintcher", 3);

        System.out.println(cachorro1);
        cachorro1.latir();
        cachorro1.correr();
    }
}
