package modulo2_orientacaoAObjeto.aula03.metodoComRetorno;

public class CarroTest {
    public static void main(String[] args) {

        Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.capCombustível = 100;
        van.consumoCombustível = 0.2;

        System.out.println(van.marca);
        System.out.println(van.modelo);

        van.exibirAutonomia();

        double autunomia = van.obterAutonomia();
        System.out.println("A autonomia do carro é: "+autunomia);
    }
}