package modulo1_basico.aula11.arraysVetores.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex20_CotacaoDolar {
    public static void main(String[] args) {
        //20- Implementar um programa que obtenha a cotação do dólar (U$) em relação ao real (R$) e a seguir armazene
        // em vetor A com 20 elementos as seguintes conversões:
        // A[i] = cotação do dolar * i, para todo i variando de 1 até 20.

        Scanner scan = new Scanner(System.in);

        double[] vetorA = new double[20];
        double cotacao;

        System.out.print("Digite a cotação do dólar: ");
        cotacao = scan.nextDouble();

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = cotacao * (i + 1);

        }

        DecimalFormat df = new DecimalFormat();

        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(df.format(vetorA[i]) + " ");
        }
        System.out.println();
    }
}