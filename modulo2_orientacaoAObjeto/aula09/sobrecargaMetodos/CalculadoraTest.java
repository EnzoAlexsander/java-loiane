package modulo2_orientacaoAObjeto.aula09.sobrecargaMetodos;

public class CalculadoraTest {
    public static void main(String[] args) {

        MinhaCalculadora calc = new MinhaCalculadora();
        calc.soma(1, 2);
        calc.soma(1.0, 2.0);


    }
}