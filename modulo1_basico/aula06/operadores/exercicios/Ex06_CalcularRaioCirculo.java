package modulo1_basico.aula06.operadores.exercicios;

import java.util.Scanner;

public class Ex06_CalcularRaioCirculo {
    public static void main(String[] args) {
        // 6- Faça um programa que peça o raio de um círculo, calcule e mostre sua área

        Scanner scan = new Scanner(System.in);
        System.out.println("Raio do círculo: ");
        double raio = scan.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);

        System.out.println("A área do círculo é: " + area);
    }
}