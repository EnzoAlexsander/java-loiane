package modulo1_basico.aula09.loops.exercicios;

import java.util.Scanner;

public class Ex15_FibonacciNesimoTermo {
    public static void main(String[] args) {
        //15- A série de Fibonacci é formada pela sequencia 1,1,2,3,5,8,13,21,34,55,...
        // Faça um programa capaz de gerar a série até o n-ésimo termo.

        Scanner scan = new Scanner(System.in);
        int n;
        int primeiro = 1;
        int segundo = 1;
        int proximo;

        System.out.println("Entre com o n-ésimo termo da série de fibonacci: ");
        n = scan.nextInt();

        System.out.println(primeiro);
        System.out.println(segundo);

        //1,1,2,3,5
        //primeiro = 1
        //segundo = 1
        //proximo = 2

        for (int i = 3; i <= n; i++) {
            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;

            System.out.println(proximo);
        }
    }
}