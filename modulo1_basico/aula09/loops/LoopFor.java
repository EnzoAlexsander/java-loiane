package modulo1_basico.aula09.loops;

public class LoopFor {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            //legenda =   Loop(inicialização da variável; expressão booleana, condição que deve ser executada; atualização da variável){}
            System.out.println("i tem valor: " + i);
        }
        for (int i = 5; i < 0; i--) {
            System.out.println("i tem valor: " + i);
        }

        for (int i = 0, j = 10; i < j; i++, j--) {
            System.out.println("i = " + i + "; j = " + j);
        }

        int cont = 0;
        for (; cont < 10; ) {
            System.out.println("Valor de cont: " + cont);
            cont += 2;
        }

        int soma = 0;
        for (int i = 1; i < 5; soma += i++) {
            System.out.println("O valor da soma é " + soma);
        }
    }
}