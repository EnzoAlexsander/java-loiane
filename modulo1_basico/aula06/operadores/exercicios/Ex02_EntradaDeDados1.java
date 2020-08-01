package modulo1_basico.aula06.operadores.exercicios;

import java.util.Scanner;

public class Ex02_EntradaDeDados1 {
    public static void main(String[] args) {
        // 2- Faça um programa que peça um número e então mostre a mensagem "O número informado foi [número].

        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com um numero inteiro: ");
        int numero = scan.nextInt();
        System.out.println("O número informado foi: " + numero);
    }
}
