package modulo1_basico.aula08.switchCase.exercicios;

import java.util.Scanner;

public class Ex15_Triangulo {
    public static void main(String[] args) {
        //15-Faça um programa que peça os 3 lados de um triângulo. O programa deverá informar se os valores podem ser
        // um triângulo. Indique, caso os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou escaleno.
        // Dicas:
        //      -Três lados formam um triângulo quando a soma de quaisquer dois lados for maior que o terceiro;
        //      -Triangulo Equilátero: três lados iguais;
        //      -Triangulo Isósceles: quaisquer dois lados iguais;
        //      -Triangulo Escaleno: três lados diferentes.

        Scanner scan = new Scanner(System.in);

        System.out.println("Lado1: ");
        int lado1 = scan.nextInt();

        System.out.println("Lado2: ");
        int lado2 = scan.nextInt();

        System.out.println("Lado3: ");
        int lado3 = scan.nextInt();

        if (((lado1 + lado2) > lado3) || ((lado1 + lado3) > lado2) || ((lado2 + lado3) > lado1)) {
            if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3) {
                System.out.println("Triângulo Equilátero");
            } else if (lado1 != lado2 && lado1 != lado3 && lado3 != lado2) {
                System.out.println("Triângulo Escaleno");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Triângulo Isósceles");
            } else {
                System.out.println("Não forma um triângulo");
            }
        }
    }
}