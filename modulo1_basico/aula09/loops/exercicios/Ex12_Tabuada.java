package modulo1_basico.aula09.loops.exercicios;

import java.util.Scanner;

public class Ex12_Tabuada {
    public static void main(String[] args) {
        //12- Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 e 10. O usuário
        //deve informar de qual número ele deseja ver a tabuada. A saída deve ser conforme o exemplo abaixo:
    /*
            Tabuada de 5:
            5 x 1 = 5
            5 x 2 = 10
            ...
            5 x 10 = 50
    */
        Scanner scan = new Scanner(System.in);
        int num;

        System.out.println("Digite um número para gerar a tabuada: ");
        num = scan.nextInt();

        System.out.println("Tabuada de " + num + ":");

        for (int i = 1; i <= 10; i++) {
            int resultMultiplicacao = num * i;
            System.out.println(num + " x " + i + " = " + resultMultiplicacao);
        }
    }
}