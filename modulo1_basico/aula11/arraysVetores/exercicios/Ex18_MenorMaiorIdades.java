package modulo1_basico.aula11.arraysVetores.exercicios;

import java.util.Scanner;

public class Ex18_MenorMaiorIdades {
    public static void main(String[] args) {
        //18- Ler um vetor A com 10 elementos inteiros correspondentes as idades de um grupo de pessoas. Escreva um
        // programa que determine e escreva a menor e a maior idades e suas respectivas posições.

        Scanner scan = new Scanner(System.in);
        int[] idades = new int[10];

        for (int i = 0; i < idades.length; i++) {
            System.out.print("Informe a idade da pessoa " + (i + 1) + ": ");
            idades[i] = scan.nextInt();
        }
        int menor = idades[0];
        int indexMenor = 0;
        int maior = idades[0];
        int indexMaior = 0;

        for (int i = 1; i < idades.length; i++) {
            if (idades[i] > maior) {
                maior = idades[i];
                indexMaior = i;
            } else if (idades[i] < menor) {
                menor = idades[i];
                indexMenor = i;
            }
        }
        System.out.print("Vetor de idades = ");
        for (int i = 0; i < idades.length; i++) {
            System.out.print(idades[i] + " ");
        }
        System.out.println();

        System.out.println("Menor idade: " + menor);
        System.out.println("Índice menor idade: " + indexMenor);
        System.out.println("Maior idade: " + maior);
        System.out.println("Indíce maior idade: " + indexMaior);
    }
}