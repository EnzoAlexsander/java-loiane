package basico.aula08.switchCase.exercicios;

import java.util.Scanner;

public class Ex06_ImprimirMaiorNumero2 {
    public static void main(String[] args) {
        //6- Faça um programa que leia três números e mostre o maior deles

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
    }
}