package basico.aula08.switchCase.exercicios;

import java.util.Scanner;

public class Ex05_MediaAluno {
    public static void main(String[] args) {
        //5- Faça um programa para a leitura de duas notas parciais de um aluno
        // O programa deve calcular a média alcançada pelo aluno e apresentar:
        // a- A mensagem "Aprovado" se a média alcançada for >= 7
        // b- A mensagem "Reprovado" se a média alcançada for < 7
        // c- A mensagem "Aprovado com Distinção" se a média for igual a 10

        Scanner scan = new Scanner(System.in);
        System.out.println("Nota1: ");
        double nota1 = scan.nextDouble();

        System.out.println("Nota2: ");
        double nota2 = scan.nextDouble();

        double media = (nota1 + nota2) / 2;


        if (media == 10) {
            System.out.println("Aprovado com Distinção");
        } else if (media >= 7 && media < 10) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}