package modulo2_orientacaoAObjeto.aula05.construtores;

public class CarroTest {
    public static void main(String[] args) {

        Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        //van.numPassageiros = 10;
        van.capCombustível = 100;
        van.consumoCombustível = 0.2;

        System.out.println(van.numPassageiros);

        Carro van2 = new Carro("Fiat", "Ducato", 10, 100, 0.2);

        System.out.println(van2.marca);
        System.out.println(van2.modelo);
        System.out.println(van2.numPassageiros);
        System.out.println(van2.capCombustível);
        System.out.println(van2.consumoCombustível);
    }
}