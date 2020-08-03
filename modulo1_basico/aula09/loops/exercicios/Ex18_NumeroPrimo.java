package modulo1_basico.aula09.loops.exercicios;

import java.util.Scanner;

public class Ex18_NumeroPrimo {
    public static void main(String[] args) {
        //18- Faça um programa que peça um número inteiro e determine se ele é ou não um número primo.
        // Um número primo é aquele que é divisível somente por ele mesmo e por 1.

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