package modulo2_orientacaoAObjeto.aula06.chaveThis;

public class Carro {
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustível;
    double consumoCombustível;

    public Carro() {
    }

    public Carro(String marca, String modelo, int numPassageiros, double capCombustível, double consumoCombustível) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        this.capCombustível = capCombustível;
        this.consumoCombustível = consumoCombustível;
    }

    public Carro(String marca, String modelo, int numPassageiros) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        System.out.println("Chamando o construtor com 3 parâmetros");
    }

    public Carro(String marca, String modelo) {
        this(marca, modelo, 10);
        System.out.println("Chamando o construtor com 2 parâmetros");
    }

    void exibirAutonomia() {
        System.out.println("A autonomia do carro é: " + (this.capCombustível * this.consumoCombustível) + " km");
    }

    double obterAutonomia() {
        System.out.println("Método obterAutonomia foi chamado.");
        return this.capCombustível * this.consumoCombustível;
    }

    double calcularCombustivel(double km) {
        double qtdCombustivel = km / this.consumoCombustível;

        return qtdCombustivel;
    }
}