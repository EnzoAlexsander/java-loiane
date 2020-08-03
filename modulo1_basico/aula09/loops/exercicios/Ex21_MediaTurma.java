package modulo1_basico.aula09.loops.exercicios;

import java.util.Scanner;

public class Ex21_MediaTurma {
    public static void main(String[] args) {
        //21- Faça um programa que calcule o número médio de alunos por turma.
        //Para isto, peça a quantidade de turmas e a quantidade de alunos para cada turma.
        // As turmas não podem ter mais de 40 alunos.

        Scanner scan = new Scanner(System.in);
        int numTurmas;

        System.out.println("Número de turmas: ");
        numTurmas = scan.nextInt();

        int numAlunos;
        int soma = 0;
        boolean invalido = false;

        for (int i = 1; i <= numTurmas; i++) {
            invalido = true;
            do {
                System.out.println("Digite o número de alunos da turma " + i);
                numAlunos = scan.nextInt();

                if (numAlunos <= 40) {
                    invalido = false;
                } else {
                    System.out.println("Número de alunos inválido. Digite novamente: ");
                }
            } while (invalido);

            soma = soma + numAlunos;
        }

        double media = soma / numTurmas;
        System.out.println("Média: " + media);
    }
}