package modulo1_basico.aula06.operadores.exercicios;

import java.util.Scanner;

public class Ex11_CalcularNumInteirosReais {
    public static void main(String[] args) {
        // 11- Faça um programa que peça 2 números inteiros e um número real.
        // Calcule e mostre:
        //      a. O produto do dobro do primeiro com metade do segundo.
        //      b. A soma do triplo do primeiro com o terceiro.
        //      c. O terceiro elevado ao cubo.

        Scanner scan = new Scanner(System.in);

        System.out.println("Número inteiro: ");
        int num1 = scan.nextInt();

        System.out.println("Outro número inteiro: ");
        int num2 = scan.nextInt();

        System.out.println("Número real: ");
        double num3 = scan.nextDouble();

        int resultadoA = (num1 * 2) * (num2 / 2);
        double resultadoB = (num1 * 3) + num3;
        double resultadoC = Math.pow(num3, 3);

        System.out.println("Resultado A: " + resultadoA);
        System.out.println("Resultado B: " + resultadoB);
        System.out.println("Resultado C: " + resultadoC);
    }
}
