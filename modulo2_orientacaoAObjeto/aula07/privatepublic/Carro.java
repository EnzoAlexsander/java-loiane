package modulo2_orientacaoAObjeto.aula07.privatepublic;

public class Carro {
    //Observação:
    //default: Dentro do mesmo pacote
    //public: Dentro de todo o código
    //private: Dentro da própria classe

    public String marca;
    String modelo;
    int numPassageiros;
    double capCombustível;
    private double consumoCombustível;

    public void exibirAutonomia() {
        System.out.println("A autonomia do carro é: " + (this.capCombustível * this.consumoCombustível) + " km");
    }

    public double obterAutonomia() {
        System.out.println("Método obterAutonomia foi chamado.");
        return this.capCombustível * this.consumoCombustível;
    }

    private double divideKmPorConsumoCombustivel(double km) {
        return km / this.consumoCombustível;
    }

    public double calcularCombustivel(double km) {
        return this.divideKmPorConsumoCombustivel(km);
    }
}