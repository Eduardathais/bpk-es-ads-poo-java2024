package exercicio02;

public class TesteCel {
    public static void main(String[] args) {
        Celular celular1 = new Celular("Apple", "IPhone 15", 4.442);
        Celular celular2 = new Celular("Samsumg", "sei lá", 2.222);

        celular1.ligarCelular();
        celular2.desligarCelular();
        System.out.println(celular1.getMarca());
        System.out.println(celular2.getModelo());
        System.out.println(celular2.getCapacidadeBateria());

    }
}
