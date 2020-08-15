package modulo2_orientacaoAObjeto.aula04.metodocomparametro.exercicios.ex04;

import java.util.Scanner;

public class JogoDaVelhaTest {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        JogoDaVelha jogoDaVelha = new JogoDaVelha();

        System.out.println("Jogador 1 = x");
        System.out.println("Jogador 2 = o");
        System.out.println();

        boolean ganhou = false;
        char sinal;
        int linha = 0;
        int coluna = 0;

        while (!ganhou) {
            if (jogoDaVelha.vezJogador1()) {
                System.out.println("Vez do jogador 1. Escolha a linha e a coluna(1-3)");
                sinal = 'x';
            } else {
                System.out.println("Vez do jogador 2. Escolha a linha e a coluna(1-3)");
                sinal = 'o';
            }
            linha = valor("Linha", scan);
            coluna = valor("Coluna", scan);

            if (!jogoDaVelha.validarJogada(linha, coluna, sinal)) {
                System.out.println("Posição já usada, tente novamente");
            }

            jogoDaVelha.imprimirTabuleiro();

            if (jogoDaVelha.verificarGanhador('x')) {
                ganhou = true;
                System.out.println("Parabéns! Jogador 1 ganhou!");
            } else if (jogoDaVelha.verificarGanhador('o')) {
                ganhou = true;
                System.out.println("Parabéns! Jogador 2 ganhou!");
            } else if (jogoDaVelha.jogada > 9) {
                ganhou = true;
                System.out.println("Deu velha!!!");
            }
        }
    }

    static int valor(String tipoValor, Scanner scan) {
        int valor = 0;
        boolean valorValido = false;
        while (!valorValido) {
            System.out.print("Digite a " + tipoValor + " (1, 2 ou 3): ");
            valor = scan.nextInt();
            if (valor >= 1 && valor <= 3) {
                valorValido = true;
            } else {
                System.out.println("Entrada inválida, tente novamente: ");
            }
        }
        valor--;
        return valor;
    }
}