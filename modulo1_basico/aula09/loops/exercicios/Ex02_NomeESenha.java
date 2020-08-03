package modulo1_basico.aula09.loops.exercicios;

import java.util.Scanner;

public class Ex02_NomeESenha {
    public static void main(String[] args) {
        //2- Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário,
        //mostrando uma mensagem de erro e voltando a pedir as informações.

        Scanner scan = new Scanner(System.in);
        boolean infoValidas = false;
        String nomeUser;
        String senha;

        do {
            System.out.println("Nome do usuário: ");
            nomeUser = scan.next();

            System.out.println("Senha: ");
            senha = scan.next();

            if (nomeUser.equalsIgnoreCase(senha)) {
                infoValidas = false;
                System.out.println("Senha igual a usuário, digite novamente.");
            } else {
                infoValidas = true;
                System.out.println("Senha e usuário válidos");
            }

        } while (!infoValidas);
    }
}