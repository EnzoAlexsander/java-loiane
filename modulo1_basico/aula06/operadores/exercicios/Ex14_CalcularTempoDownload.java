package modulo1_basico.aula06.operadores.exercicios;

import java.util.Scanner;

public class Ex14_CalcularTempoDownload {
    public static void main(String[] args) {
        // 14- Faça um programa que peça o tamanho de um arquivo para download (em MB) e a velocidade de um link
        // de internet (em Mbps), calcule e informe o tempo aproximado de download do arquivo usando este link (em minutos).

        Scanner scan = new Scanner(System.in);

        System.out.println("Tamanho do arquivo: ");
        double tamArquivo = scan.nextDouble();

        System.out.println("Velocidade da internet: ");
        double velInternet = scan.nextDouble();

        double tempo = tamArquivo / velInternet;
        System.out.println("Tempo de download: " + tempo);
    }
}