package modulo2_orientacaoAObjeto.aula02.definicaoMetodos;

public class Carro {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustível;
    double consumoCombustível;

    void exibirAutonomia(){
        System.out.println("A autonomia do carro é: "+(capCombustível*consumoCombustível)+" km");
    }
}