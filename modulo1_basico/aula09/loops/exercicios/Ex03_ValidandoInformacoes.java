package modulo1_basico.aula09.loops.exercicios;

import java.util.Scanner;

public class Ex03_ValidandoInformacoes {
    public static void main(String[] args) {
        //3- Faça um programa que leia e valide as seguintes informações:
        //a- Nome: maior que 3 caracteres;
        //b- Idade: entre 0 e 150 caracteres;
        //c- Salário: maior que zero;
        //d- Sexo: 'f' ou 'm';
        //e- Estado Civil: 's', 'c', 'v', 'd';

        Scanner scan = new Scanner(System.in);

        boolean infoValida = false;
        String nome;
        String sexo;
        String estadoCivil;
        int idade;
        double salario;

        do {
            System.out.println("Digite o Nome: ");
            nome = scan.next();

            if (nome.length() > 3) {
                infoValida = true;
            } else {
                System.out.println("Nome precisa ter no mínimo 3 caracteres.");
            }
        } while (!infoValida);

        infoValida = false;

        do {
            System.out.println("Digite a Idade: ");
            idade = scan.nextInt();

            if (idade >= 0 && idade <= 150) {
                infoValida = true;
            } else {
                System.out.println("Idade precisa ser entre 0 e 150.");
            }
        } while (!infoValida);

        infoValida = false;
        do {
            System.out.println("Digite o Sexo: ");
            sexo = scan.next();

            switch (sexo) {
                case "f":
                case "F":
                case "m":
                case "M":
                    infoValida = true;
                    break;
                default:
                    System.out.println("Sexo precisa ser 'f' ou 'm'.");
            }

        } while (!infoValida);

        infoValida = false;
        do {
            System.out.println("Digite o Estado Civil: ");
            estadoCivil = scan.next();

            switch (estadoCivil) {
                case "s":
                case "S":
                case "c":
                case "C":
                case "v":
                case "V":
                case "d":
                case "D":
                    infoValida = true;
                    break;
                default:
                    System.out.println("Estado Civil precisa ser 's', 'c', 'v', ou 'd'.");
            }
        } while (!infoValida);

        infoValida = false;
        do {
            System.out.println("Digite o Salário: ");
            salario = scan.nextDouble();

            if (salario > 0) {
                infoValida = true;
            } else {
                System.out.println("Salário precisa ser maior que 0.");
            }
        } while (!infoValida);

        System.out.println("As seguintes informações foram coletadas:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado Civil: " + estadoCivil);
        System.out.println("Salário: " + salario);
    }
}