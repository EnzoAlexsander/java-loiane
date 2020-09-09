package modulo2_orientacaoAObjeto.aula24.exceptions_multiplosCatch;

public class MultiplosCatchGenerico {
    public static void main(String[] args) {

        int[] numeros = {4, 8, 16, 32, 64, 128};
        int[] denominadores = {2, 0, 4, 8, 0};

        for (int i = 0; i < numeros.length; i++) {
            try {
                System.out.println(numeros[i] + "/" + denominadores[i] + " = " + (numeros[i] / denominadores[i]));
            } catch (ArithmeticException e) {
                System.out.println("Erro ao dividir por zero");
            } catch (Throwable e) {
                System.out.println("Ocorreu um erro");
            }
        }
    }
}