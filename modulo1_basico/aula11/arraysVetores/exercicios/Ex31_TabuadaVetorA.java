package modulo1_basico.aula11.arraysVetores.exercicios;

import java.util.Scanner;

public class Ex31_TabuadaVetorA {
    public static void main(String[] args) {
        //31- Criar um vetor A com 5 elementos inteiros. Escreva um programa que imprima a tabuada de cada um dos
        // elementos do vetor A.

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[5];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Digite um número para formar a tabuada: ");
            vetorA[i] = scan.nextInt();
        }

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Tabuada de " + vetorA[i]);

            for (int j = 0; j <= 10; j++) {
                System.out.println(j + " * " + vetorA[i] + " = " + (vetorA[i] * j));
            }
            System.out.println();
        }
    }
}