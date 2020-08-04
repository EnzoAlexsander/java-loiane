package modulo1_basico.aula10.breakContinueGoTo;

import java.util.Scanner;

public class Continue {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num;
        int max;

        System.out.print("Digite um número: ");
        num = scan.nextInt();

        System.out.print("Digite um número limite: ");
        max = scan.nextInt();

        for (int i = num; i <= max; i++) {
            if (i % 7 == 0) {
                continue;
            }
            System.out.println("O valor de i é: " + i);
        }
    }
}