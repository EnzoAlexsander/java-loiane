package modulo1_basico.aula06.operadores.exercicios;

import java.util.Scanner;

public class Ex08_CalcularHorasTrabalhadas {
    public static void main(String[] args) {
        // 8- Faça um programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
        // Calcule e mostre o total do seu salário no referido mês.

        Scanner scan = new Scanner(System.in);

        System.out.println("Valor/hora: ");
        double valorHora = scan.nextDouble();

        System.out.println("Horas trabalhadas/mês: ");
        double horas = scan.nextDouble();

        double salario = valorHora * horas;
        System.out.println("O salário é de: " + salario);
    }
}