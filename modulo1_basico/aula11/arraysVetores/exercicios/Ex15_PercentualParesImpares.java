package modulo1_basico.aula11.arraysVetores.exercicios;

import java.util.Scanner;

public class Ex15_PercentualParesImpares {
    public static void main(String[] args) {
        //15- Criar um vetor A com 10 elementos inteiros. Desenvolver um programa que defina o percentual de elementos
        // pares e ímpares, respectivamente, armazenados neste vetor.

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int impar = 0;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Informe o valor da posição " + i + ": ");
            vetorA[i] = scan.nextInt();
        }
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 != 0) {
                impar++;
            }
        }

        int par = vetorA.length - impar;
        //vetorA.lenght = 100%
        //par
        //= x*vetorA.lenght == par * 100
        //= x == (par * 100)/vetorA.lenght
        int porcentagemPar = (par * 100) / vetorA.length;
        int porcentagemImpar = 100 - porcentagemPar;

        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.println("Porcentagem Pares: " + porcentagemPar + "%");
        System.out.println("Porcentagem Impares: " + porcentagemImpar + "%");
    }
}