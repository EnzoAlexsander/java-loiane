package modulo1_basico.aula08.switchCase.exercicios;

import java.util.Scanner;

public class Ex21_DescontoGasolina {
    public static void main(String[] args) {
        //21- Um posto está vendendo combustíveis com a seguinte tabela de descontos:
        //Alcool: 1- até 20 litros, desconto de 3% por litro / 2- acima de 20 litros, desconto de 5% por litro
        //Gasolina: 1- até 20 litros, desconto de 4% por litro / 2- acima de 20 litros, desconto de 6% por litro
        // Escreva um algoritmo que leia o número de litros vendidos, o tipo de combustível
        // (codificado da seguinte forma: A-alcool, G-gasolina), calcule e imprima o valor a ser pago pelo cliente
        // sabendo-se que o preço do litro da gasolina é R$ 2,50. E do litro de alcool é de R$ 1,90.

        Scanner scan = new Scanner(System.in);

        System.out.println("Quantidade de litros adquiridos: ");
        double litros = scan.nextDouble();

        System.out.println("Tipo de combustível (g ou a): ");
        String tipo = scan.next();

        double precoGas = 2.5;
        double precoAlc = 1.9;
        int percDesconto = 0;
        double total = 0;
        double totalDesc = 0;

        if (tipo.equalsIgnoreCase("a")) {
            if (litros <= 20) {
                percDesconto = 3;
            } else {
                percDesconto = 5;
            }
            total = litros * precoAlc;

        } else if (tipo.equalsIgnoreCase("g")) {
            if (litros <= 20) {
                percDesconto = 4;
            } else {
                percDesconto = 6;
            }
            total = litros * precoGas;

        }
        totalDesc = (total / 100) * percDesconto;
        double precoAPagar = total - totalDesc;
        System.out.println("Valor a ser pago: R$ " + precoAPagar);
    }
}