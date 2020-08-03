package modulo1_basico.aula09.loops.exercicios;

import java.util.Scanner;

public class Ex22_ColetaniaCD {
    public static void main(String[] args) {
        //22- Faça um programa que calcule o valor total investido por um colecionador em sua coleção de CDs e o valor
        // médio gasto em cada um deles. O usuário deverá informar a quantidade de CDs e o valor para em cada um.

        Scanner scan = new Scanner(System.in);
        int cds;
        double preco;
        double soma = 0;

        System.out.println("Informe o número de CDs que irá adquirir: ");
        cds = scan.nextInt();

        for (int i = 1; i <= cds; i++) {
            System.out.println("Informe o valor do cd " + i);
            preco = scan.nextDouble();

            soma += preco;
        }

        double media = soma / cds;
        System.out.println("Média gasta com cada CD: " + media);
    }
}