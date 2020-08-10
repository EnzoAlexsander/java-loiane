package modulo1_basico.aula12.matriz.exercicios;

import java.util.Scanner;

public class Ex04_AgendaPessoal {
    public static void main(String[] args) {
        //04- Faça um programa para armazenar em uma matriz os compromissos de uma agenda pessoal.
        // Cada dia do mês deve conter 24 horas, onde para cada uma destas 24 horas podemos associar um tarefa específica
        // (compromisso agendado). O programa deve ter um menu onde o usuário indica o dia do mês que deseja alterar e a
        // hora, entrando em seguida com o compromisso, ou então, o usuário pode também consultar a agenda, fornecendo o
        // dia e a hora para obter o compromisso armazenado.

        Scanner scan = new Scanner(System.in);

        String[][] compromissos = new String[31][24];
        boolean sair = false;
        boolean diaValido = false;
        boolean horaValida = false;
        byte opcao;
        int dia = 0;
        int hora = 0;

        while (!sair) {
            System.out.println("Digite 1 para adicionar compromisso.");
            System.out.println("Digite 2 para verificar compromisso.");
            System.out.println("Digite 0 para sair.");

            opcao = scan.nextByte();

            if (opcao == 1) { //adicionar compromisso
                diaValido = false;

                while (!diaValido) {
                    System.out.println("Informe o dia do mês: ");
                    dia = scan.nextInt();
                    if (dia > 0 && dia <= 31) {
                        diaValido = true;
                    } else {
                        System.out.println("Opção inválida. Digite novamente: ");
                    }
                }
                while (!horaValida) {
                    System.out.println("Informe a hora do compromisso: ");
                    hora = scan.nextInt();
                    if (hora >= 0 && hora <= 24) {
                        horaValida = true;
                    } else {
                        System.out.println("Opção inválida. Digite novamente: ");
                    }
                }
                dia--;
                System.out.println("Digite o compromisso");
                compromissos[dia][hora] = scan.next();

            } else if (opcao == 2) { //verificar compromisso

                while (!diaValido) {
                    System.out.println("Informe o dia do mês: ");
                    dia = scan.nextInt();
                    if (dia > 0 && dia <= 31) {
                        diaValido = true;
                    } else {
                        System.out.println("Opção inválida. Digite novamente: ");
                    }
                }
                while (!horaValida) {
                    System.out.println("Informe a hora do compromisso: ");
                    hora = scan.nextInt();
                    if (hora >= 0 && hora <= 24) {
                        horaValida = true;
                    } else {
                        System.out.println("Opção inválida. Digite novamente: ");
                    }
                }
                dia--;
                System.out.println("o compromisso agendado é: ");
                System.out.println(compromissos[dia][hora]);

            } else if (opcao == 0) { //verificar compromisso
                sair = true;
            } else {
                System.out.print("Opção inválida. Digite novamente: ");
            }
        }
    }
}