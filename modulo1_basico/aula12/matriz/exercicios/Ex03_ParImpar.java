package modulo1_basico.aula12.matriz.exercicios;

import java.util.Scanner;

public class Ex03_ParImpar {
    public static void main(String[] args) {
        //03- Capture do teclado valores para preenchimento de uma matriz M 3x3.
        // Após a captura imprima a matriz criada e encontre a quantidade de números pares, a quantidade de números ímpares.

        Scanner scan = new Scanner(System.in);

        int[][] numeros = new int[3][3];

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print("Digite o valor da posição [" + i + "," + j + "]: ");
                numeros[i][j] = scan.nextInt();
            }
        }

        int qtdPares = 0;
        int qtdImpares = 0;

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                if (numeros[i][j] % 2 == 0) {
                    qtdPares++;
                } else {
                    qtdImpares++;
                }
            }
        }

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.println(numeros[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Pares = " + qtdPares);
        System.out.println("Impares = " + qtdImpares);
    }
}