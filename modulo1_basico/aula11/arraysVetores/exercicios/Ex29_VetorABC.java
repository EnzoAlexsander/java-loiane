package modulo1_basico.aula11.arraysVetores.exercicios;

import java.util.Scanner;

public class Ex29_VetorABC {
    public static void main(String[] args) {
        //29- Ler um vetor A com 20 elementos. Construir dois vetores B e C, sendo que nos vetor B e C serão armazenados
        // o valores pares e ímpares de A, respectivamente.

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[20];
        int[] vetorB = new int[vetorA.length]; //pares
        int[] vetorC = new int[vetorA.length * 2]; //impares

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Digite o valor da posição A - " + i + ": ");
            vetorA[i] = scan.nextInt();
        }

        int posicaoB = 0;
        int posicaoC = 0;

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 == 0) {
                vetorB[posicaoB] = vetorA[i];
                posicaoB++;
            } else {
                vetorC[posicaoC] = vetorA[i];
                posicaoC++;
            }
        }
        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.print("Vetor B = ");
        for (int i = 0; i < posicaoB; i++) {
            System.out.print(vetorB[i] + " ");
        }
        System.out.println();

        System.out.print("Vetor C = ");
        for (int i = 0; i < posicaoC; i++) {
            System.out.print(vetorC[i] + " ");
        }
        System.out.println();
    }
}