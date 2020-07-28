package basico.aula06.operadores.exercicios;

import java.util.Scanner;

public class Ex12_PesoIdeal {
    public static void main(String[] args) {
        // 12- Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal,
        // usando a seguinte fórmula: (72,7*altura)-58

        Scanner scan = new Scanner(System.in);

        System.out.println("Altura: ");
        double altura = scan.nextDouble();

        double pesoIdeal = (72.7 * altura) - 58;

        System.out.println("O peso ideal é: " + pesoIdeal);
    }
}