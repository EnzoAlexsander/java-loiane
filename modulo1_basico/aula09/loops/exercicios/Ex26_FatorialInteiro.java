package modulo1_basico.aula09.loops.exercicios;

import java.util.Scanner;

public class Ex26_FatorialInteiro {
    public static void main(String[] args) {
        //26- Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário. Ex.: 5!=5.4.3.2.1=120.
        // A saída deve ser conforme o exemplo abaixo:
        /*
        Fatorial de: 5
        ! = 5 . 4 . 3 . 2 . 1 = 120
         */

        Scanner scan = new Scanner(System.in);

        int num;

        System.out.println("Digite um número: ");
        num = scan.nextInt();

        System.out.println("Fatorial de " + num);

        System.out.print(num + "! = ");

        int fatorial = 1;
        for (int i = num; i > 1; i--) {
            fatorial = fatorial * i;
            System.out.print(i + " * ");
        }
        System.out.print(" * 1 = " + fatorial);
    }
}