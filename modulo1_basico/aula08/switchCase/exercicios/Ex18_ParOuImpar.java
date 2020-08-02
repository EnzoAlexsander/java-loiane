package modulo1_basico.aula08.switchCase.exercicios;

import java.util.Scanner;

public class Ex18_ParOuImpar {
    public static void main(String[] args) {
        //18- Faça um programa que peça um número inteiro e determine se ele é par ou impar. Dica: utilize o operador módulo
        // (resto da divisão)

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um Número: ");
        int num = scan.nextInt();

        if (num % 2 == 0) {
            System.out.println("par");
        } else {
            System.out.println("ímpar");
        }
    }
}