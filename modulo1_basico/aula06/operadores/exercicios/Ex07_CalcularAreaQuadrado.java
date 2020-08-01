package modulo1_basico.aula06.operadores.exercicios;

import java.util.Scanner;

public class Ex07_CalcularAreaQuadrado {
    public static void main(String[] args) {
        // 7- Faça um programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.

        Scanner scan = new Scanner(System.in);

        System.out.println("Tamanho do lado do quadrado: ");
        double lado = scan.nextDouble();

        // area = lado * lado
        double area = Math.pow(lado, 2);

        System.out.println("A área do quadrado é: " + area);
        System.out.println("O dobro da área do quadrado é: " + (area * 2));
    }
}