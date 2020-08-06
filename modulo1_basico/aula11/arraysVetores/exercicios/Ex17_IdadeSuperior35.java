package modulo1_basico.aula11.arraysVetores.exercicios;

import java.util.Scanner;

public class Ex17_IdadeSuperior35 {
    public static void main(String[] args) {
        //17- Ler um vetor A com 10 elementos inteiros correspondentes as idades de um grupo de pessoas. Escreva um
        // programa que determine e escreva a quantidade de pessoas que possuem idade superior a 35 anos.

        Scanner scan = new Scanner(System.in);
        int qtd = 0;

        int[] idades = new int[10];
        for (int i = 0; i < idades.length; i++) {
            System.out.print("Informe a idade da pessoa " + (i + 1) + ": ");
            idades[i] = scan.nextInt();
        }

        for (int i = 0; i < idades.length; i++) {
            if (idades[i] > 35) {
                qtd++;
            }
        }
        System.out.print("Vetor de Idades = ");
        for (int i = 0; i < idades.length; i++) {
            System.out.print(idades[i] + " ");
        }
        System.out.println();

        System.out.println("Quantidade de pessoas com idade > 35: " + qtd);
    }
}