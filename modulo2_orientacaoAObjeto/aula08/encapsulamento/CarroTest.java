package modulo2_orientacaoAObjeto.aula08.encapsulamento;

public class CarroTest {
    public static void main(String[] args) {

        Carro van = new Carro();
        van.setMarca("Fiat");
        System.out.println(van.getMarca());
    }
}