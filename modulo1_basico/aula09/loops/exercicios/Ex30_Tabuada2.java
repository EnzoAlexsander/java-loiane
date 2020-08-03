package modulo1_basico.aula09.loops.exercicios;

import java.util.Scanner;

public class Ex30_Tabuada2 {
    public static void main(String[] args) {
        //30- Desenvolva um programa que faça a tabuada de um número qualquer inteiro que será digitado pelo usuário,
        // mas a tabuada não deve necessariamente iniciar em 1 e terminar em 10, o valor inicial e final devem ser
        // informados também pelo usuário, conforme exemplo abaixo:
        /*
        Montar a tabuada de: 5
        Começar por: 4
        Terminar em: 7

        Vou montar a tabuada de 5 começando em 4 e terminando em 7:
        5 X 4 = 20
        5 X 5 = 25
        5 X 6 = 30
        5 X 7 = 35
         */
        //Obs: Você deve verificar se o usuário não digitou o final menor que o inicial.

        Scanner scan = new Scanner(System.in);
        int num;
        int inicio;
        int fim;
        boolean invalido = true;

        System.out.print("Digite um número para gerar a tabuada: ");
        num = scan.nextInt();

        System.out.println("Digite o início da tabuada");
        inicio = scan.nextInt();

        System.out.println("Digite o fim da tabuada");
        fim = scan.nextInt();

        do {
            if (fim > inicio) {
                invalido = false;
            }
        } while (invalido);

        System.out.println("Tabuada de " + num + ":");
        System.out.println("Começar por: " + inicio);
        System.out.println("Terminar em: " + fim);
        System.out.println();

        for (int i = inicio; i <= fim; i++) {
            System.out.println(num + " x " + i + " = " + (i * num));
        }
    }
}