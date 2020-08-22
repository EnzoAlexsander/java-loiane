package modulo2_orientacaoAObjeto.aula11.recursividade;

import modulo2_orientacaoAObjeto.aula10.exercicios.ex03.CalcFatorial;

public class FatorialRecursivoTest {
    public static void main(String[] args) {

        int fatorialNaoRecursivo = CalcFatorial.fatorialNaoRecursivo(5);
        System.out.println(fatorialNaoRecursivo);

        int fatorialRecursivo = FatorialRecursivo.fatorial(5);
        System.out.println(fatorialRecursivo);
    }
}