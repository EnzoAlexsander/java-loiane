package basico.aula06.operadores.exercicios;

import java.util.Scanner;

public class Ex13_ImpostoDeRenda {
    public static void main(String[] args) {
        // 13- Faça um programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
        // Calcule e mostre o total do seu salário no referido mês,
        // sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o INSS e 5% para o sindicato,
        // faça um programa que nos dê:
        // salário bruto
        // a- quanto pagou ao INSS
        // b- quanto pagou ao sindicato
        // c- o salário líquido
        // d- calcule os descontos e o salário líquido, conforme a tabela abaixo:
/*
        + salario bruto : R$ - IR (11%) : R$ - INSS
        (8%) : R$ - Sindicato ( 5%) : R$ = Salário
        Liquido : R$
*/
        Scanner scan = new Scanner(System.in);

        System.out.println("Valor/hora: ");
        double valorHora = scan.nextDouble();

        System.out.println("Horas trabalhadas/mês: ");
        double horas = scan.nextDouble();

        double salarioBruto = valorHora * horas;
        double ir = (salarioBruto / 100) * 11;
        double inss = (salarioBruto / 100) * 8;
        double sindicato = (salarioBruto / 100) * 5;

        double totalDescontos = ir + inss + sindicato;
        double salarioLiquido = salarioBruto - totalDescontos;

        System.out.println("O salário bruto é de: " + salarioBruto);
        System.out.println("Imposto de Renda" + ir);
        System.out.println("INSS: " + inss);
        System.out.println("Sindicato" + sindicato);
        System.out.println("Total descontos: " + totalDescontos);
        System.out.println("Salário líquido: " + salarioLiquido);

    }
}