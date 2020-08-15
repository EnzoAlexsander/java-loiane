package modulo2_orientacaoAObjeto.aula04.metodocomparametro;

public class Carro {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustível;
    double consumoCombustível;

    void exibirAutonomia() {
        System.out.println("A autonomia do carro é: " + (capCombustível * consumoCombustível) + " km");
    }

    double obterAutonomia() {
        System.out.println("Método obterAutonomia foi chamado.");
        return capCombustível * consumoCombustível;
    }

    double calcularCombustivel(double km) {
        double qtdCombustivel = km / consumoCombustível;

        return qtdCombustivel;
    }
}