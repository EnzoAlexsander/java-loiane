package modulo1_basico.aula09.loops.exercicios;

import java.util.Scanner;

public class Ex32_CardapioLanchonete {
    public static void main(String[] args) {
        //32- O cardápio de uma lanchonete é o seguinte:
        /*
        Especificação   | Código| Preço
        Cachorro Quente | 100   | R$ 1,20
        Bauru Simples   | 101   | R$ 1,30
        Bauru com ovo   | 102   | R$ 1,50
        Hambúrguer      | 103   | R$ 1,20
        Cheeseburguer   | 104   | R$ 1,30
        Refrigerante    | 105   | R$ 1,00
         */
        //Faça um programa que leia o código dos itens pedidos e as quantidades desejadas. Calcule e mostre o valor a
        // ser pago por item (preço * quantidade) e o total geral do pedido. Considere que o cliente deve informar
        // quando o pedido deve ser encerrado.

        Scanner scan = new Scanner(System.in);
        boolean naoTerminar = true;
        int cod;
        int qtd;
        double total = 0;
        String output = " ";


        do {
            System.out.print("Digite o código do lanche ou 0 para finalizar: ");
            cod = scan.nextInt();

            System.out.print("Informe a quantidade do produto ou 0 para finalizar: ");
            qtd = scan.nextInt();

            if (cod == 0 && qtd == 0) {
                naoTerminar = false;
                output += "Total a pagar = " + total;
            } else {
                if (cod == 100) {
                    output += "Cachorro Quente| R$ 1,20 * " + qtd;
                    output += " = " + ("R$ " + 1.2 * qtd) + "\n";
                    total += 1.2 * qtd;

                } else if (cod == 101) {
                    output += "Bauru Simples   | R$ 1,30 * " + qtd;
                    output += " = " + ("R$ " + 1.3 * qtd) + "\n";
                    total += 1.3 * qtd;

                } else if (cod == 102) {
                    output += "Bauru com ovo   | R$ 1,50 * " + qtd;
                    output += " = " + ("R$ " + 1.5 * qtd) + "\n";
                    total += 1.5 * qtd;

                } else if (cod == 103) {
                    output += "Hambúrguer      | R$ 1,20 * " + qtd;
                    output += " = " + ("R$ " + 1.2 * qtd) + "\n";
                    total += 1.2 * qtd;

                } else if (cod == 104) {
                    output += "Cheeseburguer   | R$ 1,30 * " + qtd;
                    output += " = " + ("R$ " + 1.3 * qtd) + "\n";
                    total += 1.3 * qtd;

                } else if (cod == 105) {
                    output += "Refrigerante    | R$ 1,00 * " + qtd;
                    output += " = " + ("R$ " + 1 * qtd) + "\n";
                    total += 1 * qtd;

                }
            }
        } while (naoTerminar);
        System.out.println(output);
    }
}