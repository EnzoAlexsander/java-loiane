package modulo1_basico.aula09.loops.exercicios;

public class Ex09_NumerosImpares {
    public static void main(String[] args) {
        //9- Faça um programa que imprima na tela apenas os números ímpares entre 1 e 50.

        for (int i = 1; i < 50; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}