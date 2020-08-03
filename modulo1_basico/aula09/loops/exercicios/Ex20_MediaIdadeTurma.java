package modulo1_basico.aula09.loops.exercicios;

import java.util.Scanner;

public class Ex20_MediaIdadeTurma {
    public static void main(String[] args) {
        //20- Faça um programa que peça para n pessoas a sua idade.
        // Ao final o programa devera verificar se a média de idade da turma varia entre 0 e 25, 26 e 60 e maior que 60;
        // e então, dizer se a turma é Jovem, Adulta ou Idosa, conforme a média calculada.

        Scanner scan = new Scanner(System.in);
        int idades;
        int idade;
        int soma = 0;

        System.out.println("Digite a quantidade de idades: ");
        idades = scan.nextInt();

        for (int i = 0; i < idades; i++) {
            System.out.println("Digite a idade da pessoa " + (i + 1));
            idade = scan.nextInt();

            soma = soma + idade;
        }
        double media = soma / idades;

        System.out.println("Média de idade: " + media);

        if (media >= 0 && media <= 25) {
            System.out.println("Jovem");
        } else if (media >= 26 && media <= 60) {
            System.out.println("Adulta");
        } else if (media > 60) {
            System.out.println("Idosa");
        }
    }
}