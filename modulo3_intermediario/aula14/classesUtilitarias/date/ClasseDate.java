package modulo3_intermediario.aula14.classesUtilitarias.date;

import java.util.Date;

public class ClasseDate {
    public static void main(String[] args) {

        Date hoje = new Date();
        System.out.println(hoje);

        System.out.println("Milisegundos desde 1 de Janeiro de 1970: " + hoje.getTime());

        System.out.println(hoje.getDate());
    }
}