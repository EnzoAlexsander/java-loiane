package modulo2_orientacaoAObjeto.aula10.exercicios.ex02;

public class Calculadora {
    //2- Escreva uma classe Calculadora que tenha os seguintes métodos: somar, subtrair, multiplicar,
    // dividir (dois números), elevar a potência n. Desenvolva um programa para testar essa classe.

    public static int somar(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtrair(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    public static int dividir(int num1, int num2) {
        return num1 / num2;
    }

    //x^n
    //x*x*x*x(n vezes)
    public static int potencia(int num1, int num2) {
        int total = num1;
        for (int i = 1; i < num2; i++) {
            total *= num1;
        }
        return total;
    }


}