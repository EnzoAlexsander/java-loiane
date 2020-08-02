package modulo1_basico.aula08.switchCase.exercicios;

import java.util.Scanner;

public class Ex02_PositivoOuNegativo {
    public static void main(String[] args) {
        //2- Faça um programa que peça o valor e mostre na tela se o valor é positivo ou negativo

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira um valor: ");
        double valor = scan.nextDouble();

        if (valor >= 0) {
            System.out.println("O valor " + valor + " é positivo");
        } else {
            System.out.println("O valor " + valor + " é negativo");
        }
    }
}