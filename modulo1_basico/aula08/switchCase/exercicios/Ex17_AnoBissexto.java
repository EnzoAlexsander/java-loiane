package modulo1_basico.aula08.switchCase.exercicios;

import java.util.Scanner;

public class Ex17_AnoBissexto {
    public static void main(String[] args) {
        //17- Faça um programa que peça um número correspondente a um determinado ano e em seguida informe se este ano
        // é ou não é bissexto.

        Scanner scan = new Scanner(System.in);

        System.out.println("Ano: ");
        int ano = scan.nextInt();

        if ((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)) {
            System.out.println("É bissexto");
        } else {
            System.out.println("Não é bissexto");
        }
    }
}