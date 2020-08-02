package modulo1_basico.aula08.switchCase.exercicios;

import java.util.Scanner;

public class Ex20_Depoimento {
    public static void main(String[] args) {
        //20- Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
        //1- Telefonou para a vítima? / 2- Esteve no local do crime? / 3- Mora perto da vítima? / 4- Devia para a vítima?
        //5- Já trabalhou com a vítima?
        // O programa deve no final emitir uma classificação sobre a participação da pessoa no crime. Se a pessoa responder
        // positivamente a 2 questões ela deve ser classificada como "Suspeita". Entre 3 e 4 como "Cúmplice".
        // E 5 como "Assassino". Caso contrário, ele será classificado como "Inocente".

        Scanner scan = new Scanner(System.in);

        System.out.println("Telefonou para a vítima?(S-N) ");
        String resp1 = scan.next();

        System.out.println("Esteve no local do crime?(S-N) ");
        String resp2 = scan.next();

        System.out.println("Mora perto da vítima?(S-N) ");
        String resp3 = scan.next();

        System.out.println("Devia para a vítima?(S-N) ");
        String resp4 = scan.next();

        System.out.println("Já trabalhou com a vítima?(S-N) ");
        String resp5 = scan.next();

        int cont = 0;

        if (resp1.equalsIgnoreCase("S")) {
            cont++;
        }

        if (resp2.equalsIgnoreCase("S")) {
            cont++;
        }

        if (resp3.equalsIgnoreCase("S")) {
            cont++;
        }

        if (resp4.equalsIgnoreCase("S")) {
            cont++;
        }

        if (resp5.equalsIgnoreCase("S")) {
            cont++;
        }

        if (cont == 2) {
            System.out.println("Suspeita");
        } else if (cont == 3 || cont == 4) {
            System.out.println("Cúmplice");
        } else if (cont == 5) {
            System.out.println("Assassino");
        } else if (cont == 0) {
            System.out.println("Inocente");
        }
    }
}