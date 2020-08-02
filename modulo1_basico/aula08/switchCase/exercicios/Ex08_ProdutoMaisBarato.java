package modulo1_basico.aula08.switchCase.exercicios;

import java.util.Scanner;

public class Ex08_ProdutoMaisBarato {
    public static void main(String[] args) {
        //8- Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar,
        // sabendo que a decisão é sempre pelo mais barato.

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual é o valor da camisa do São Paulo?: ");
        double shirtSpfc = scan.nextDouble();

        System.out.println("E da camisa do Liverpool?: ");
        double shirtLiverpool = scan.nextDouble();

        System.out.println("E da camisa do Brasil?: ");
        double shirtBrasil = scan.nextDouble();

        if (shirtSpfc <= shirtLiverpool && shirtSpfc <= shirtBrasil) {
            System.out.println("A do São Paulo além de mais linda e mais pesada, está mais barata. Leve ela por: " + shirtSpfc);
        } else if (shirtLiverpool <= shirtSpfc && shirtLiverpool <= shirtBrasil) {
            System.out.println("O Liverpool acabou de levar a Premier League depois de 30 anos. Leva ela por: " + shirtLiverpool);
        } else {
            System.out.println("Apesar do Tite, somos Penta né. Jaja tem eliminatórias. Leva a da Seleça por: " + shirtBrasil);
        }
    }
}