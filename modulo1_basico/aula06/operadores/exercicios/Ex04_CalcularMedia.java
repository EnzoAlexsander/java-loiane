package modulo1_basico.aula06.operadores.exercicios;

import java.util.Scanner;

public class Ex04_CalcularMedia {
    public static void main(String[] args) {
        // 4- Faça um programa que peça as 4 notas bimestrais e mostre a média.

        Scanner scan = new Scanner(System.in);

        System.out.println("Nota1: ");
        double nota1 = scan.nextDouble();

        System.out.println("Nota2: ");
        double nota2 = scan.nextDouble();

        System.out.println("Nota3: ");
        double nota3 = scan.nextDouble();

        System.out.println("Nota4: ");
        double nota4 = scan.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("A média é: " + media);
    }
}