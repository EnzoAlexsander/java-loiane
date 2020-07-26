package basico.aula06.operadores.exercicios;

import java.util.Scanner;

public class Ex03_SomaEntradaDados {
    public static void main(String[] args) {
        // 3- Faça um programa que peça dois números e imprima a soma.

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o primeiro número: ");
        int num1 = scan.nextInt();

        System.out.println("Entre com o segundo número: ");
        int num2 = scan.nextInt();

        int resultado = num1 + num2;
        System.out.println("A soma dos números é: " + resultado);
    }
}
