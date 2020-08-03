package modulo1_basico.aula09.loops.exercicios;

import java.util.Scanner;

public class Ex27_Metereologia {
    public static void main(String[] args) {
        //27- O Departamento Estadual de Meteorologia lhe contratou para desenvolver um programa que leia as um conjunto
        // indeterminado de temperaturas, e informe ao final a menor e a maior temperaturas informadas, bem como a média
        // das temperaturas.

        Scanner scan = new Scanner(System.in);
        int qtdTemp;
        double temp;
        double soma = 0;
        double menor = Double.MAX_VALUE;
        double maior = Double.MIN_VALUE;

        System.out.print("Informe a quantidade de temperaturas: ");
        qtdTemp = scan.nextInt();

        for (int i = 1; i <= qtdTemp; i++) {
            System.out.println("Entre com a temperatura " + i);
            temp = scan.nextDouble();

            soma += temp;

            if (temp > maior) {
                maior = temp;
            }

            if (temp < menor) {
                menor = temp;
            }
        }
        System.out.println("Média: " + (soma / qtdTemp));
        System.out.println("Menor temperatura: " + menor);
        System.out.println("Maior temperatura: " + maior);
    }
}