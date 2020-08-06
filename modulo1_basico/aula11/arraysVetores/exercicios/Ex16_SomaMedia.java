package modulo1_basico.aula11.arraysVetores.exercicios;

import java.util.Scanner;

public class Ex16_SomaMedia {
    public static void main(String[] args) {
        //16- Criar um vetor A com 10 elementos inteiros. Escrever um programa que calcule e escreva:
        // a) a soma de elementos armazenados neste vetor que são inferiores a 15;
        // b) a quantidade de elementos armazenados no vetor que são iguais a 15;
        // c) a média dos elementos armazenados no vetor que são superiores a 15.

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int somaMenor15 = 0;
        int somaMaior15 = 0;
        int qtdMaior15 = 0;
        int igual15 = 0;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Informe o valor da posição " + i + ": ");
            vetorA[i] = scan.nextInt();
        }

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] == 15) {
                igual15++;
            } else if (vetorA[i] < 15) {
                somaMenor15 += vetorA[i];
            } else {
                qtdMaior15++;
                somaMaior15 += vetorA[i];
            }
        }
        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.println("Quantidade de números == 15: " + igual15);
        System.out.println("Soma de números < 15: " + somaMenor15);
        System.out.println("Média de números > 15: " + (somaMaior15 / qtdMaior15));
    }
}