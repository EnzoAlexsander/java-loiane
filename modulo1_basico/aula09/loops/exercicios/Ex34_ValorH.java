package modulo1_basico.aula09.loops.exercicios;

import java.util.Scanner;

public class Ex34_ValorH {
    public static void main(String[] args) {
        //34- Sendo H= 1 + 1/2 + 1/3 + 1/4 + ... + 1/N, Faça um programa que calcule o valor de H com N termos.

        Scanner scan = new Scanner(System.in);
        int n;
        double soma = 0;

        System.out.println("Digite o valor de n: ");
        n = scan.nextInt();

        for (int i = 1; i <= n; i++) {

            soma += 1 / i;
        }
        System.out.println("Soma = " + soma);
    }
}