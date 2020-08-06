package modulo1_basico.aula11.arraysVetores.exercicios;

import java.util.Scanner;

public class Ex21_Percentual {
    public static void main(String[] args) {
        //21- Gerar aleatoriamente um vetor A com 10 elementos inteiros e iguais a 0 e 1, sugestão:
        // A[i] = (int)Math.round(Math.random() * 1);
        // Pede-se para implementar um programa que determine o percentual de números 0's e 1's existentes no vetor A.

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[20];
        int qtd0 = 0;
        int qtd1 = 0;

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = (int) Math.round(Math.random() * 1);

            if (vetorA[i] == 0) {
                qtd0++;
            } else {
                qtd1++;
            }
        }
        //10 = 100%
        //qtd = x
        // x = (qtd * 100)/10;

        double porcentagem0 = (qtd0 * 100) / vetorA.length;
        double porcentagem1 = (qtd1 * 100) / vetorA.length;

        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.println("Porcentagem 0 = " + porcentagem0 + "%");
        System.out.println("Porcentagem 1 = " + porcentagem1 + "%");
    }
}