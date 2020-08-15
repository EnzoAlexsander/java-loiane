package modulo2_orientacaoAObjeto.aula04.metodocomparametro.exercicios.ex01;

public class Lampada {
    //1- Escreva uma classe para representar uma lâmpada. Desenvolva métodos para ligar e desligar a lâmpada.

    boolean ligada;

    void ligar() {
        ligada = true;
    }

    void desligar() {
        ligada = false;
    }

    void mostrarEstado() {
        if (ligada) {
            System.out.println("Lâmpada está ligada");
        } else {
            System.out.println("Lâmpada está desligada");
        }
    }
}
