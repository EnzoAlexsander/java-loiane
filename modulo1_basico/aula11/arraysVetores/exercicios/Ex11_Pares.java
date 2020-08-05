package modulo1_basico.aula11.arraysVetores.exercicios;

import java.util.Scanner;

public class Ex11_Pares {
    public static void main(String[] args) {
        //11- Criar um vetor A com 10 elementos inteiros. Implementar um programa que defina e escreva a quantidade de
        // elementos armazenados neste vetor que são pares.

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int qtdPares = 0;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Informe o valor da posição " + i + ":");
            vetorA[i] = scan.nextInt();
        }

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 == 0) {
                qtdPares++;
            }
        }

        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.println("Quantidade de números pares: " + qtdPares);
    }
}