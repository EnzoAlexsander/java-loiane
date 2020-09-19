package modulo3_intermediario.aula14.classesUtilitarias.random;

import java.util.Random;

public class ClasseRandom {
    public static void main(String[] args) {

        System.out.println(Math.floor(Math.random() * 10));
        System.out.println(Math.floor(Math.random() * 100));
        System.out.println(Math.floor(Math.random() * 1000));

        Random aleatorio = new Random();
        System.out.println(aleatorio.nextInt());
        System.out.println(aleatorio.nextInt(101)); //0 a 100
        System.out.println(aleatorio.nextInt(5 + 1)); //0 a 5

    }
}