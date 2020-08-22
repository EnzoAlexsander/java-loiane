package modulo2_orientacaoAObjeto.aula11.exercicios.ex02;

public class Calculadora {
    //2- Escreva um método recursivo e estático que receba um número inteiro positivo N e calcule o
    // somatório dos números de 1 a N.

    public static int fibonacci(int num) {

        if (num < 2) {
            return 1;
        }

        return fibonacci(num - 1) + fibonacci(num - 2);
    }

    //5 = 5 + (somatorio(4)
    //4 = 4 + (somatorio(3)
    //3 = 3 + (somatorio(2)
    //2 = 2 + (somatorio(1)
    //1 = 1

    public static int somatorio(int num) {
        if (num == 1) {
            return 1;
        }
        return num + somatorio(num - 1);
    }
}