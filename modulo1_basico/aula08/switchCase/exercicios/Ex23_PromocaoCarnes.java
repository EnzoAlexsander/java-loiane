package modulo1_basico.aula08.switchCase.exercicios;

import java.util.Scanner;

public class Ex23_PromocaoCarnes {
    public static void main(String[] args) {
        //23- O hipermecado tabajara está com uma promoção de carnes que é imperdível. Confira:
/*
                   | Até 5kg        | Acima de 5kg
        Filé Duplo | R$ 4,90 por kg | R$ 5,80 por kg
        Alcatra    | R$ 5,90 por kg | R$ 6,80 por kg
        Picanha    | R$ 6,90 por kg | R$ 7,80 por kg
*/
        // Para atender a todos os clientes, cada cliente poderá levar apenas um dos tipos de carne da promoção, porém
        // não há limites para a quantidade de carne por cliente.
        // Se a compra for feita no cartão Tabajara o cliente receberá ainda um desconto de %5 sobre o total da compra.
        // Escreva um programa que peça o tipo e a quantidade de carne comprada pelo usuário e gere um cupom fiscal,
        // contendo as informações da compra: tp e qtd de carne, preço total, tp de pagamento, valor do desconto e valor a pagar

        Scanner scan = new Scanner(System.in);

        System.out.println("Tipo da carne: ");
        System.out.println("1- Filé Duplo");
        System.out.println("2- Alcatra");
        System.out.println("3- Picanha");
        int tpCarne = scan.nextInt();

        System.out.println("Quantidade (kg): ");
        double qtd = scan.nextDouble();

        double precoKg = 0;

        if (tpCarne == 1) {
            System.out.println(qtd + "Kg - Filé Duplo");

            if (qtd < 5) {
                precoKg = 4.9;
            } else {
                precoKg = 5.8;
            }
        } else if (tpCarne == 2) {
            System.out.println(qtd + "Kg - Alcatra");
            if (qtd < 5) {
                precoKg = 5.9;
            } else {
                precoKg = 6.8;
            }
        } else if (tpCarne == 3) {
            System.out.println(qtd + "Kg - Picanha");
            if (qtd < 5) {
                precoKg = 6.9;
            } else {
                precoKg = 7.8;
            }
        }

        double total = qtd + precoKg;
        System.out.println(qtd + "kg * " + precoKg + " = " + total);

        System.out.println("Compra no cartão?");
        System.out.println("Digite 1 para Sim: ");
        int cartao = scan.nextInt();

        if (cartao == 1) {
            double desconto = (total / 100) * 5;
            System.out.println("Desconto de: " + desconto);
            System.out.println("Valor a pagar: " + (total - desconto));
        } else {
            System.out.println("Valor a pagar: " + total);
        }
    }
}