package modulo1_basico.aula11.arraysVetores.exercicios;

import java.util.Scanner;

public class Ex22_VetorAPar {
    public static void main(String[] args) {
        //22- Criar um vetor A com 10 elementos inteiros. Desenvolver um programa que verifique se "todos" os elementos
        // do vetor A são pares. Se pelo menos um elemento do vetor não for par o processo de repetição para percorrer
        // os elementos do vetor deve ser encerrado, como sugestão: utilize uma variável do tipo flag para atingir este
        // propósito.

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[20];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Entre com um número para a posição " + i + ": ");
            vetorA[i] = scan.nextInt();

            if (vetorA[i] % 2 != 0) {
                break;
            }
        }
    }
}