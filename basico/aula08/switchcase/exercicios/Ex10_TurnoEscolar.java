package basico.aula08.switchCase.exercicios;

import java.util.Scanner;

public class Ex10_TurnoEscolar {
    public static void main(String[] args) {
        //10- Faça um programa que pergunte em que turno você estuda.
        // Peça para digitar M-matutino, V-Vespertino ou N-Noturno.
        // Imprima a mensagem "Bom dia!", "Boa tarde!", "Boa noite!" ou "Valor inválido!", conforme o caso.

        Scanner scan = new Scanner(System.in);

        System.out.println("Em que turno você estuda?(M, V ou N): ");
        String turno = scan.next();

        if (turno.equalsIgnoreCase("M")) {
            System.out.println("M-Matutino");
            System.out.println("Bom dia!");
        } else if (turno.equalsIgnoreCase("V")) {
            System.out.println("V-Vespertino");
            System.out.println("Boa tarde!");
        } else if (turno.equalsIgnoreCase("N")) {
            System.out.println("N-Noturno");
            System.out.println("Boa noite!");
        } else {
            System.out.println("Valor inválido");
        }
    }
}