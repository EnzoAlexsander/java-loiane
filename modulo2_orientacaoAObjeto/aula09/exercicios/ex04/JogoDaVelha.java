package modulo2_orientacaoAObjeto.aula09.exercicios.ex04;

public class JogoDaVelha {
    //4- Reescreva	o	exercício	6	da	aula	20	(Jogo	da	Velha).	Desenvolva	uma	classe
    //para	representar	o	Jogo	da	Velha.	Desenvolva	uma	classe	para	testar	o
    //Jogo.

    private char[][] jogoDaVelha;
    private int jogada;

    public JogoDaVelha() {
        jogoDaVelha = new char[3][3];
        jogada = 1;
    }

    public char[][] getJogoDaVelha() {
        return jogoDaVelha;
    }

    public void setJogoDaVelha(char[][] jogoDaVelha) {
        this.jogoDaVelha = jogoDaVelha;
    }

    public int getJogada() {
        return jogada;
    }

    public void setJogada(int jogada) {
        this.jogada = jogada;
    }

    public boolean validarJogada(int linha, int coluna, char sinal) {

        if (jogoDaVelha[linha][coluna] == sinal || jogoDaVelha[linha][coluna] == 'o') {
            return false;

        } else { //jogada válida
            jogoDaVelha[linha][coluna] = sinal;
            jogada++;
            return true;
        }
    }

    public void imprimirTabuleiro() {
        for (int i = 0; i < jogoDaVelha.length; i++) {
            for (int j = 0; j < jogoDaVelha[i].length; j++) {
                System.out.print(jogoDaVelha[i][j] + " | ");
            }
            System.out.println();
        }
    }

    public boolean verificarGanhador(char sinal) {
        if ((jogoDaVelha[0][0] == sinal && jogoDaVelha[0][1] == sinal && jogoDaVelha[0][2] == sinal) ||      //linha 1
                (jogoDaVelha[1][0] == sinal && jogoDaVelha[1][1] == sinal && jogoDaVelha[1][2] == sinal) ||  //linha 2
                (jogoDaVelha[2][0] == sinal && jogoDaVelha[2][1] == sinal && jogoDaVelha[2][2] == sinal) ||  //linha 3
                (jogoDaVelha[0][0] == sinal && jogoDaVelha[1][0] == sinal && jogoDaVelha[2][0] == sinal) ||  //coluna 1
                (jogoDaVelha[0][1] == sinal && jogoDaVelha[1][1] == sinal && jogoDaVelha[2][1] == sinal) ||  //coluna 2
                (jogoDaVelha[0][2] == sinal && jogoDaVelha[1][2] == sinal && jogoDaVelha[2][2] == sinal) ||  //coluna 3
                (jogoDaVelha[0][0] == sinal && jogoDaVelha[1][1] == sinal && jogoDaVelha[2][2] == sinal) ||  //diagonal
                (jogoDaVelha[0][2] == sinal && jogoDaVelha[1][1] == sinal && jogoDaVelha[2][0] == sinal)) {  //diagonal inversa

            return true;
        }
        return false;
    }

    public boolean vezJogador1() {
        if (jogada % 2 == 1) {
            return true;
        }
        return false;
    }

}