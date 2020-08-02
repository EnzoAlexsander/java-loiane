package modulo1_basico.aula08.switchCase.exercicios;

import java.util.Scanner;

public class Ex07_MaiorEMenorNumero {
    public static void main(String[] args) {
        //7- Faça um programa que leia três números e mostre o maior e o menor deles.

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira um número inteiro: ");
        int num1 = scan.nextInt();

        System.out.println("Insira outro número inteiro: ");
        int num2 = scan.nextInt();

        System.out.println("Insira mais um número inteiro: ");
        int num3 = scan.nextInt();

        if (num1 >= num2 && num1 >= num3) {
            System.out.println("O num1 foi o maior número inserido: " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("O num2 foi o maior número inserido: " + num2);
        } else {
            System.out.println("O num3 foi o maior número inserido: " + num3);
        }

        if (num1 <= num2 && num1 <= num3) {
            System.out.println("O num1 foi o menor número inserido: " + num1);
        } else if (num2 <= num1 && num2 <= num3) {
            System.out.println("O num2 foi o menor número inserido: " + num2);
        } else {
            System.out.println("O num3 foi o menor número inserido: " + num3);
        }
    }
}