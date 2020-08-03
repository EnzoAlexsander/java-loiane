package modulo1_basico.aula09.loops.exercicios;

import java.util.Scanner;

public class Ex11_Alterando10_NumerosInteiros {
    public static void main(String[] args) {
        //11- Altere o programa anterior para mostrar no final a soma dos números.

        Scanner scan = new Scanner(System.in);
        int num1;
        int num2;
        int soma = 0;

        System.out.println("Digite o primeiro número: ");
        num1 = scan.nextInt();

        System.out.println("Digite o segundo número: ");
        num2 = scan.nextInt();

        for (int i = num1; i <= num2; i++) {
            soma = soma + i;
        }
        System.out.println("Soma: " + soma);
    }
}