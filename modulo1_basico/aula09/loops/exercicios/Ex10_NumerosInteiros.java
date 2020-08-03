package modulo1_basico.aula09.loops.exercicios;

import java.util.Scanner;

public class Ex10_NumerosInteiros {
    public static void main(String[] args) {
        //10- Faça um programa que receba dois números inteiros e gere os números inteiros que estão no intervalo compreendido por eles.

        Scanner scan = new Scanner(System.in);
        int num1;
        int num2;

        System.out.println("Digite o primeiro número: ");
        num1 = scan.nextInt();

        System.out.println("Digite o segundo número: ");
        num2 = scan.nextInt();

        for (int i = num1; i <= num2; i++) {
            System.out.println(i);
        }
    }
}