package basico.aula06.operadores.exercicios;

import java.util.Scanner;

public class Ex05_MetrosParaCentimetros {
    public static void main(String[] args) {
        // 5- Faça um programa que converta metros para centimetros.

        Scanner scan = new Scanner(System.in);

        System.out.println("Quantidade de metros: ");
        double metros = scan.nextDouble();

        double cm = metros * 100;

        System.out.println(metros + " m é igual a " + cm + " cm");
    }
}