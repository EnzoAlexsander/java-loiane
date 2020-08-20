package modulo2_orientacaoAObjeto.aula10.exercicios.ex03;

import java.util.Scanner;

public class CalcFatorialTest {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num;

        do{
            System.out.print("Digite um número positivo: ");
            num = scan.nextInt();

            if(num < 0){
                System.out.println("Número inválido, digite novamente.");
            }
        }while (num < 0);
        System.out.println(CalcFatorial.fatorialNaoRecursivo(num));
    }
}
