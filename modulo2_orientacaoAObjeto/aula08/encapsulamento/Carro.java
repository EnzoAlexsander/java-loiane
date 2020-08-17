package modulo2_orientacaoAObjeto.aula08.encapsulamento;

public class Carro {

    private String marca;
    private String modelo;
    private int numPassageiros;
    private double capCombustível;
    private double consumoCombustível;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumPassageiros() {
        return numPassageiros;
    }

    public void setNumPassageiros(int numPassageiros) {
        this.numPassageiros = numPassageiros;
    }

    public double getCapCombustível() {
        return capCombustível;
    }

    public void setCapCombustível(double capCombustível) {
        this.capCombustível = capCombustível;
    }

    public double getConsumoCombustível() {
        return consumoCombustível;
    }

    public void setConsumoCombustível(double consumoCombustível) {
        this.consumoCombustível = consumoCombustível;
    }
}