package modulo2_orientacaoAObjeto.aula04.metodocomparametro.exercicios.ex01;

public class LampadaTest {
    public static void main(String[] args) {

        Lampada lampada = new Lampada();

        lampada.ligar();
        lampada.mostrarEstado();

        lampada.desligar();
        lampada.mostrarEstado();
    }
}