package modulo1_basico.aula11.arraysVetores.exercicios;

import java.util.Scanner;

public class Ex24_BigualA {
    public static void main(String[] args) {
        //24- Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho, obedecendo as
        // seguintes regras de formação:
        // a) Bi deverá receber 1 quando Ai for par;
        // b) Bi deverá receber 0 quando Ai for ímpar.

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Informe um número para a posição " + i + ": ");
            vetorA[i] = scan.nextInt();

            vetorB[i] = (vetorA[i] % 2 == 0) ? 1 : 0;
        }
        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.print("Vetor B = ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }
        System.out.println();
    }
}