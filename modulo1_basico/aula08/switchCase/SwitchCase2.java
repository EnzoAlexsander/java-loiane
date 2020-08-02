package modulo1_basico.aula08.switchCase;

import java.util.Scanner;

public class SwitchCase2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um dia da semana de 1 a 7: ");

        int diaSemana = scan.nextInt();

        switch (diaSemana) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            case 1:
            case 7:
                System.out.println("Fim de Semana");
                break;
            default:
                System.out.println("Não é um dia válido");
        }
    }
}