package modulo2_orientacaoAObjeto.aula27.exceptions_throws;

import java.util.Scanner;

public class UsandoThrows {
    public static void main(String[] args) {

        System.out.print("Digite um número decimal: ");
        try {
            double num = leNumero();
            System.out.println("Você digitou " + num);
        } catch (Exception e) {
            System.out.println("Entrada inválida");
            e.printStackTrace(); //Só usar isso para desenvolvedor e não para usuário.
        }
    }

    public static double leNumero() throws Exception {
        Scanner scan = new Scanner(System.in);
        double num = scan.nextDouble();
        return num;
    }
}