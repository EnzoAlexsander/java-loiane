package basico.aula06.operadores.exercicios;

import java.util.Scanner;

public class Ex10_CelsiusParaFarenheit {
    public static void main(String[] args) {
        // 10- Faça um programa que peça a temperatura em graus Celsius, transforme e mostre em graus Farenheit.

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a temperatura em Celsius: ");
        double celsius = scan.nextDouble();

        double farenheit = (celsius * 1.8) + 32;

        System.out.println("A temperatura " + celsius + "° Celsius é igual a " + farenheit + "° Farenheit");
    }
}