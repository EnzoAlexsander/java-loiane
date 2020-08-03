package modulo1_basico.aula09.loops.exercicios;

import java.util.Scanner;

public class Ex06_HorizontalVertical {
    public static void main(String[] args) {
        //6- Faça um programa que imprima na tela os números de 1 a 20, um abaixo do outro. Depois modifique o programa
        //para que ele mostre os números um ao lado do outro.

        Scanner scan = new Scanner(System.in);

        for (int i = 1; i <= 20; i++) {
            //System.out.println(i);
            System.out.print(i + " ");
        }
    }
}