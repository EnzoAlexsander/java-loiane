package modulo1_basico.aula09.loops.exercicios;

import java.util.Scanner;

public class Ex29_EncontrarNumPrimo {
    public static void main(String[] args) {
        //29- Encontrar números primos é uma tarefa difícil. Faça um programa que gera uma lista dos números primos
        // existentes entre 1 e um número inteiro informado pelo usuário.

        Scanner scan = new Scanner(System.in);
        int num;
        boolean primo;

        System.out.print("Digite um número: ");
        num = scan.nextInt();

        for (int i = 1; i <= num; i++) {
            primo = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    primo = false;
                }
            }
            if (primo) {
                System.out.println(i);
            }
        }
    }
}