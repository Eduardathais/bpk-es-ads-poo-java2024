package exercicio02;

public class Celular {

    public String marca;
    public String modelo;
    public Double capacidadeBateria;

    private Boolean ligado = false;

    public Celular(String marca, String modelo, Double capacidadeBateria) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadeBateria = capacidadeBateria;
    }

    public void ligarCelular() {
        this.ligado = true;
    }

    public void desligarCelular() {
        this.ligado = false;
    }

    @Override
    public String toString() {
        return "Celular{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", capacidadeBateria=" + capacidadeBateria +
                ", ligado=" + ligado +
                '}';
    }
}
