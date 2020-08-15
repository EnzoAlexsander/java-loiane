package modulo2_orientacaoAObjeto.aula04.metodocomparametro;

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
        System.out.println("A autonomia do carro é: " + autunomia + " km");
        //ou
        //double autonomia;
        //System.out.println("A autonomia do carro é: "+van.obterAutonomia()+" km");

        double qtdCombustivel10 = van.calcularCombustivel(10);
        double qtdCombustivel15 = van.calcularCombustivel(15);

        System.out.println("Quantidade de Combustível 10 = " + qtdCombustivel10);
        System.out.println("Quantidade de Combustível 15 = " + qtdCombustivel15);
    }
}