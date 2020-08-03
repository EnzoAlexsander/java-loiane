package modulo1_basico.aula09.loops.exercicios;

import java.util.Scanner;

public class Ex19_MediaAritmetica {
    public static void main(String[] args) {
        //19- Faça um programa que calcule e mostre a media aritmetica de N notas.

        Scanner scan = new Scanner(System.in);
        int notas;

        System.out.println("Digite o número de notas: ");
        notas = scan.nextInt();

        double soma = 0;
        double media;
        double nota;

        for (int i = 0; i < notas; i++) {
            System.out.println("Digite a nota " + (i + 1));
            nota = scan.nextDouble();

            soma = soma + nota;
        }
        media = soma / notas;

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
    }
}