package modulo1_basico.aula09.loops.exercicios;

import java.util.Scanner;

public class Ex08_SomaEMedia {
    public static void main(String[] args) {
        //8- Faça um programa que leia 5 números e informe a soma e a média dos números.

        Scanner scan = new Scanner(System.in);
        int num;
        int media;
        int soma = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um número: ");
            num = scan.nextInt();

            soma = soma + num;
        }

        media = soma / 5;

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
    }
}