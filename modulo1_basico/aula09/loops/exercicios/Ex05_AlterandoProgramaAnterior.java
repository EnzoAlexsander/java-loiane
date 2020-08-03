package modulo1_basico.aula09.loops.exercicios;

import java.util.Scanner;

public class Ex05_AlterandoProgramaAnterior {
    public static void main(String[] args) {
        //5- Altere o programa anterior permitindo ao usuário informar as populações e as taxas de crescimento iniciais.
        // Valide a entrada e permita repetir a operação.

        Scanner scan = new Scanner(System.in);

        double popA;
        double taxaA;
        double popB;
        double taxaB;
        int cont = 0;

        boolean valido = false;

        do {
            System.out.println("População A: ");
            popA = scan.nextDouble();

            if (popA > 0) {
                valido = true;
            } else {
                System.out.println("População A precisa ser maior que 0.");
            }

            System.out.println("População B: ");
            popB = scan.nextDouble();

            if (popB > 0) {
                valido = true;
            } else {
                System.out.println("População B precisa ser maior que 0.");
            }
        } while (!valido);

        do {
            System.out.println("Taxa de crescimento da População A: ");
            taxaA = scan.nextDouble();

            if (taxaA > 0) {
                valido = true;
            } else {
                System.out.println("Taxa de crescimento da População A precisa ser maior que 0.");
            }
        } while (!valido);

        do {
            System.out.println("Taxa de crescimento da População B: ");
            taxaB = scan.nextDouble();

            if (taxaB > 0) {
                valido = true;
            } else {
                System.out.println("Taxa de crescimento da População B precisa ser maior que 0.");
            }
        } while (!valido);

        while (popA <= popB) {
            popA += (popA / 100) * taxaA;
            popB += (popB / 100) * taxaB;
            cont++;
        }

        System.out.println("População A: " + popA);
        System.out.println("População B: " + popB);
        System.out.println("Com quantos anos a população A ultrapassa a população B? " + cont + " anos.");
    }
}