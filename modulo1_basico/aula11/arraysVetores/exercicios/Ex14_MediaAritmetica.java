package modulo1_basico.aula11.arraysVetores.exercicios;

import java.util.Scanner;

public class Ex14_MediaAritmetica {
    public static void main(String[] args) {
        //14- Criar um vetor A com 10 elementos inteiros. Implementar um programa que defina e escreva a média aritmética
        // simples dos elementos ímpares armazenados neste vetor.

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int soma = 0;
        int impar = 0;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Informe o valor da posição " + i + ": ");
            vetorA[i] = scan.nextInt();
        }
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 5 != 0) {
                soma += vetorA[i];
                impar++;
            }
        }
        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + (soma / impar));
    }
}