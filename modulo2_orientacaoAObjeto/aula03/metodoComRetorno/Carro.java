package modulo2_orientacaoAObjeto.aula03.metodoComRetorno;

public class Carro {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustível;
    double consumoCombustível;

    void exibirAutonomia(){
        System.out.println("A autonomia do carro é: "+(capCombustível*consumoCombustível)+" km");
    }

    double obterAutonomia(){
        System.out.println("Método obterAutonomia foi chamado.");
        return capCombustível * consumoCombustível;
    }
}