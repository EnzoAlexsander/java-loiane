package basico.aula08.switchCase.exercicios;

import java.util.Scanner;

public class Ex13_DiaDaSemana {
    public static void main(String[] args) {
        //13- Faça um programa que leia um número e exiba o dia correspondente da semana. (1-Domingo, 2-Segunda, etc)
        // se digitar outro valor deve aparecer valor inválido

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número (1-7): ");
        int num = scan.nextInt();

        switch (num) {
            case 1:
                System.out.println("1-Domingo");
                break;
            case 2:
                System.out.println("2-Segunda");
                break;
            case 3:
                System.out.println("3-Terça");
                break;
            case 4:
                System.out.println("4-Quarta");
                break;
            case 5:
                System.out.println("5-Quinta");
                break;
            case 6:
                System.out.println("6-Sexta");
                break;
            case 7:
                System.out.println("7-Sábado");
                break;
            default:
                System.out.println("Valor Inválido");
        }
    }
}