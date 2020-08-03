package modulo1_basico.aula09.loops.exercicios;

import java.util.Scanner;

public class Ex13_BaseExpoente {
    public static void main(String[] args) {
        //13- Faça um programa que peça dois números, base e expoente, calcule e mostre o primeiro número elevado ao
        //segundo número. Não utilize a função de potência da linguagem.

        Scanner scan = new Scanner(System.in);
        int base;
        int potencia;


        System.out.println("Digite a base: ");
        base = scan.nextInt();

        System.out.println("Digite a potência: ");
        potencia = scan.nextInt();

        //2^2 = 2 * 2
        //2^3 = 2 * 2 * 2

        int resultado = base;

        for (int i = 1; i < potencia; i++) {
            resultado = resultado * base;
        }
        System.out.println("Resultado: " + resultado);
    }
}