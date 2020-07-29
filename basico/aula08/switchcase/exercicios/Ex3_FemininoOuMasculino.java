package basico.aula08.switchCase.exercicios;

import java.util.Scanner;

public class Ex3_FemininoOuMasculino {
    public static void main(String[] args) {
        //3- Faça um programa que verifique se uma letra digitada é "F" ou "M".
        // Conforme a letra escrever: F-Feminino, M-Masculino, Sexo inválido.

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o seu sexo(F ou M): ");
        String sexo = scan.next();

        if (sexo.equalsIgnoreCase("F")) {
            System.out.println("F-Feminino");
        } else if (sexo.equalsIgnoreCase("M")) {
            System.out.println("M-Masculino");
        } else {
            System.out.println("Sexo Inválido");
        }
    }
}
