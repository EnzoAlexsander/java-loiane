package modulo1_basico.aula11.arraysVetores.exercicios;

import java.util.Scanner;

public class Ex32_VetoresPrimos {
    public static void main(String[] args) {
        //32- Criar um vetor A com 10 elementos inteiros. Escreva um programa que imprima cada elemento do vetor A e uma
        // mensagem indicando se o respectivo elemento é um número primo ou não.

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[5];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Digite um número para formar a tabuada: ");
            vetorA[i] = scan.nextInt();
        }

        boolean primo;
        String msg;

        for (int i = 0; i < vetorA.length; i++) {

            primo = true;

            for (int j = 2; j < vetorA[i]; j++) {
                primo = false;
                break;
            }
            msg = "";
            if (primo) {
                msg = " é primo";
            } else {
                msg = " não é primo";
            }
            System.out.println(vetorA[i] + msg);
        }
    }
}