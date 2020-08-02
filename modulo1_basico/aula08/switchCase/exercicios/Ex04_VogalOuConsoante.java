package modulo1_basico.aula08.switchCase.exercicios;

import java.util.Scanner;

public class Ex04_VogalOuConsoante {
    public static void main(String[] args) {
        //4- Faça um programa que verifique se a letra digitada é vogal ou consoante.
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira uma letra: ");
        String letra = scan.next();

        if (letra.length() > 1) { //.length()>1) = só é válido se tiver apenas um caractere
            System.out.println("Não é uma letra válida");
        } else {
            switch (letra) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                case "A":
                case "E":
                case "I":
                case "O":
                case "U":
                    System.out.println("Vogal");
                    break;
                default:
                    System.out.printf("Consoante");
            }
        }

    }
}
