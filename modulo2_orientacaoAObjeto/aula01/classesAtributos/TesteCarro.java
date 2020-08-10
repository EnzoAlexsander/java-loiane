package modulo2_orientacaoAObjeto.aula01.classesAtributos;

public class TesteCarro {
    public static void main(String[] args) {

        Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.capCombustível = 100;
        van.consumoCombustível = 0.2;

        System.out.println(van.marca);
        System.out.println(van.modelo);

        Carro fusca = new Carro();
        fusca.marca = "Volkswagem";
        fusca.modelo = "New Beatle";
        fusca.numPassageiros = 4;
        fusca.capCombustível = 30;
        fusca.consumoCombustível = 0.15;

        System.out.println(fusca.marca);
        System.out.println(fusca.modelo);
    }
}