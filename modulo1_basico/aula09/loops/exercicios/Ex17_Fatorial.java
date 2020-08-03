package modulo1_basico.aula09.loops.exercicios;

import java.util.Scanner;

public class Ex17_Fatorial {
    public static void main(String[] args) {
        //17- Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário. Ex.: 5 != 5.4.3.2.1 = 120

        Scanner scan = new Scanner(System.in);
        int num;

        System.out.println("Digite um número: ");
        num = scan.nextInt();

        System.out.println(num + "! = ");

        int fatorial = 1;

        for (int i = num; i > 0; i--) {
            fatorial = fatorial * i;
            System.out.println(i);
        }
        System.out.println("Resultado: " + fatorial);
    }
}