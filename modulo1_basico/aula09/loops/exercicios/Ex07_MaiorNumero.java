package modulo1_basico.aula09.loops.exercicios;

import java.util.Scanner;

public class Ex07_MaiorNumero {
    public static void main(String[] args) {
        //7- Faça um programa que leia 5 números e informe o maior número.

        Scanner scan = new Scanner(System.in);
        int num;
        int maior = Integer.MIN_VALUE;

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um número: ");
            num = scan.nextInt();

            if (num > maior) {
                maior = num;
                System.out.println("O número maior mudou: " + maior);
            }
        }
        System.out.println("O maior número digitado foi: " + maior);
    }
}