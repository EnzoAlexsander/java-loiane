package modulo1_basico.aula08.switchCase.exercicios;

import java.util.Scanner;

public class Ex19_MiniCalculadora {
    public static void main(String[] args) {
        //19- Faça um Programa que leia 2 números e em seguida pergunte ao usuário qual operação ele deseja realizar.
        // O resultado da operação deve ser acompanhado de uma frase que diga se o número é:
        // a- par ou impar / b- positivo ou negativo

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = scan.nextInt();

        System.out.println("Digite o segundo número: ");
        int num2 = scan.nextInt();

        System.out.println("Que operação você deseja fazer entre esses números? (+ - * /): ");
        String operacao = scan.next();

        int resultado = 0;
        boolean valida = true;

        switch (operacao) {
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            case "/":
                resultado = num1 / num2;
                break;
            default:
                System.out.println("Operação inválida");
                valida = false;
        }

        if (valida) {
            System.out.println("Resultado: " + resultado);

            if (resultado >= 0) {
                System.out.println("Resultado Positivo!");
            } else {
                System.out.println("Resultado Negativo!");
            }

            if (resultado % 2 == 0) {
                System.out.println("Resultado Par!");
            } else {
                System.out.println("Resultado Impar!");
            }
        }
    }
}