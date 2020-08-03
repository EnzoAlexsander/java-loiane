package modulo1_basico.aula09.loops.exercicios;

import java.util.Scanner;

public class Ex28_NumeroPrimo2 {
    public static void main(String[] args) {
        //28- Os números primos possuem várias aplicações dentro da Computação, por exemplo na Criptografia. Um número
        // primo é aquele que é divisível apenas por um e por ele mesmo. Faça um programa que peça um número inteiro e
        // determine se ele é ou não um número primo.

        Scanner scan = new Scanner(System.in);

        int num;

        System.out.println("Digite um número: ");
        num = scan.nextInt();

        boolean primo = true;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println("Não é número primo - divisível por" + i);
                primo = false;
            }
        }
        if (primo) {
            System.out.println("É número primo");
        }
    }
}