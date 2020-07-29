package basico.aula08.switchCase.exercicios;

import java.util.Scanner;

public class Ex1_ImprimirMaiorNumero {
    public static void main(String[] args) {
        //1- Faça um programa que peça dois números e imprima o maior deles

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira um número inteiro: ");
        int num1 = scan.nextInt();

        System.out.println("Insira outro número inteiro: ");
        int num2 = scan.nextInt();

        if (num1 > num2) {
            System.out.println("O maior número inserido foi: " + num1);
        } else {
            System.out.println("O maior número inserido foi: " + num2);
        }
    }
}
