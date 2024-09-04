package exercicio02;

public class Celular {

    private String marca;
    private String modelo;
    private Double capacidadeBateria;

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

    public String getMarca() {
        return marca;
    }

    public Double getCapacidadeBateria() {
        return capacidadeBateria;
    }

    public String getModelo() {
        return modelo;
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
