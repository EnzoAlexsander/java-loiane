package modulo1_basico.aula12.matriz.exercicios;

import java.util.Scanner;

public class Ex06_JogoDaVelha {
    public static void main(String[] args) {
        //06- Faça um programa para jogar o jogo da velha. O programa deve permitir que dois jogadores façam uma partida
        // do jogo da velha, usando o computador para ver o tabuleiro. Cada jogador vai alternadamente informando a
        // posição onde deseja colocar a sua peça (‘O’ ou ‘X’). O programa deve impedir jogadas inválidas e determinar
        // automaticamente quando o jogo terminou e quem foi o vencedor (jogador1 ou jogador2).
        // A cada nova jogada, o programa deve atualizar a situação do tabuleiro na tela.

        Scanner scan = new Scanner(System.in);

        char[][] jogoDaVelha = new char[3][3];

        System.out.println("Jogador 1 = x");
        System.out.println("Jogador 2 = o");
        System.out.println();

        boolean ganhou = false;
        int jogada = 1;
        char sinal;
        boolean linhaValida;
        boolean colunaValida;
        int linha = 0;
        int coluna = 0;


        while (!ganhou) {
            if (jogada % 2 == 1) { // jogador 1
                System.out.println("Vez do jogador 1. Escolha a linha e a coluna(1-3)");
                sinal = 'x';
            } else {
                System.out.println("Vez do jogador 2. Escolha a linha e a coluna(1-3)");
                sinal = 'o';
            }
            System.out.println();

            linhaValida = false;
            while (!linhaValida) {
                System.out.print("Digite a linha (1, 2 ou 3): ");
                linha = scan.nextInt();
                if (linha >= 1 && linha <= 3) {
                    linhaValida = true;
                } else {
                    System.out.println("Entrada inválida, tente novamente: ");
                }
            }
            colunaValida = false;
            while (!colunaValida) {
                System.out.print("Digite a linha (1, 2 ou 3): ");
                coluna = scan.nextInt();
                if (coluna >= 1 && coluna <= 3) {
                    colunaValida = true;
                } else {
                    System.out.println("Entrada inválida, tente novamente: ");
                }
            }

            linha--;
            coluna--;

            if (jogoDaVelha[linha][coluna] == 'x' || jogoDaVelha[linha][coluna] == 'o') {
                System.out.println("Posição já preenchida. Tente novamente");
            } else { //jogada válida
                jogoDaVelha[linha][coluna] = sinal;
                jogada++;
            }

            //imprimir tabuleiro
            for (int i = 0; i < jogoDaVelha.length; i++) {
                for (int j = 0; j < jogoDaVelha[i].length; j++) {
                    System.out.print(jogoDaVelha[i][j] + " | ");
                }
                System.out.println();
            }
            //verifica se tem ganhador
            if ((jogoDaVelha[0][0] == 'x' && jogoDaVelha[0][1] == 'x' && jogoDaVelha[0][2] == 'x') ||      //linha 1
                    (jogoDaVelha[1][0] == 'x' && jogoDaVelha[1][1] == 'x' && jogoDaVelha[1][2] == 'x') ||  //linha 2
                    (jogoDaVelha[2][0] == 'x' && jogoDaVelha[2][1] == 'x' && jogoDaVelha[2][2] == 'x') ||  //linha 3
                    (jogoDaVelha[0][0] == 'x' && jogoDaVelha[1][0] == 'x' && jogoDaVelha[2][0] == 'x') ||  //coluna 1
                    (jogoDaVelha[0][1] == 'x' && jogoDaVelha[1][1] == 'x' && jogoDaVelha[2][1] == 'x') ||  //coluna 2
                    (jogoDaVelha[0][2] == 'x' && jogoDaVelha[1][2] == 'x' && jogoDaVelha[2][2] == 'x') ||  //coluna 3
                    (jogoDaVelha[0][0] == 'x' && jogoDaVelha[1][1] == 'x' && jogoDaVelha[2][2] == 'x') ||  //diagonal
                    (jogoDaVelha[0][2] == 'x' && jogoDaVelha[1][1] == 'x' && jogoDaVelha[2][0] == 'x')) {  //diagonal inversa

                ganhou = true;
                System.out.println("Parabéns, jogador 1 ganhou!");

            } else if ((jogoDaVelha[0][0] == 'o' && jogoDaVelha[0][1] == 'o' && jogoDaVelha[0][2] == 'o') || //linha 1
                    (jogoDaVelha[1][0] == 'o' && jogoDaVelha[1][1] == 'o' && jogoDaVelha[1][2] == 'o') ||  //linha 2
                    (jogoDaVelha[2][0] == 'o' && jogoDaVelha[2][1] == 'o' && jogoDaVelha[2][2] == 'o') ||  //linha 3
                    (jogoDaVelha[0][0] == 'o' && jogoDaVelha[1][0] == 'o' && jogoDaVelha[2][0] == 'o') ||  //coluna 1
                    (jogoDaVelha[0][1] == 'o' && jogoDaVelha[1][1] == 'o' && jogoDaVelha[2][1] == 'o') ||  //coluna 2
                    (jogoDaVelha[0][2] == 'o' && jogoDaVelha[1][2] == 'o' && jogoDaVelha[2][2] == 'o') ||  //coluna 3
                    (jogoDaVelha[0][0] == 'o' && jogoDaVelha[1][1] == 'o' && jogoDaVelha[2][2] == 'o') ||  //diagonal
                    (jogoDaVelha[0][2] == 'o' && jogoDaVelha[1][1] == 'o' && jogoDaVelha[2][0] == 'o')) {   //diagonal inversa

                ganhou = true;
                System.out.println("Parabéns, jogador 2 ganhou!");

            } else if (jogada > 9) {
                ganhou = true;
                System.out.println("Deu Velha!!!");
            }
        }
    }
}