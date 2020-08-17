package modulo2_orientacaoAObjeto.aula05.construtores;

public class Carro {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustível;
    double consumoCombustível;

    Carro() {
        System.out.println("Classe Carro foi instanciada");
        numPassageiros = 4;
    }

    Carro(String marca_, String modelo_, int numPassageiros_, double capCombustível_, double consumoCombustível_) {
        marca = marca_;
        modelo = modelo_;
        numPassageiros = numPassageiros_;
        capCombustível = capCombustível_;
        consumoCombustível = consumoCombustível_;
    }

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