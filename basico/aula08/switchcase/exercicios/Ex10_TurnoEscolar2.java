package basico.aula08.switchCase.exercicios;

import java.util.Scanner;

public class Ex10_TurnoEscolar2 {
    public static void main(String[] args) {
        //10- Faça um programa que pergunte em que turno você estuda.
        // Peça para digitar M-matutino, V-Vespertino ou N-Noturno.
        // Imprima a mensagem "Bom dia!", "Boa tarde!", "Boa noite!" ou "Valor inválido!", conforme o caso.

        Scanner scan = new Scanner(System.in);

        System.out.println("Em que turno você estuda?(M, V ou N): ");
        String turno = scan.next();

        switch (turno) {
            case "m":
            case "M":
                System.out.println("M-Matutino! Bom dia!");
                break;
            case "v":
            case "V":
                System.out.println("V-Vespertino! Boa tarde!");
                break;
            case "n":
            case "N":
                System.out.println("N-Noturno! Boa noite!");
                break;
            default:
                System.out.println("Valor inválido");
        }
    }
}