package modulo1_basico.aula09.loops.exercicios;

import java.util.Scanner;

public class Ex01_NotaValida {
    public static void main(String[] args) {
        //1- Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja inválido e
        //continue pedindo até que o usuário informe um valor válido

        Scanner scan = new Scanner(System.in);

        boolean notaValida = false;

        do {
            System.out.println("Digite uma nota: ");

            double nota = scan.nextDouble();

            if (nota >= 0 && nota <= 10) {
                notaValida = true;
                System.out.println("Você digitou: " + nota);
            } else {
                System.out.println("Nota inválida. Digite novamente: ");
            }
        } while (!notaValida);
    }
}