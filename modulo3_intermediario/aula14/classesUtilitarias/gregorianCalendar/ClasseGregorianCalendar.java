package modulo3_intermediario.aula14.classesUtilitarias.gregorianCalendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class ClasseGregorianCalendar {
    public static void main(String[] args) {

        Calendar hoje1 = Calendar.getInstance();

        GregorianCalendar hoje = new GregorianCalendar();
        //System.out.println(hoje);
        imprimirData(hoje);

        // 2020 é um ano bissexto?
        System.out.println("2020 é um ano bissexto: " + hoje.isLeapYear(2020));

        GregorianCalendar hoje2 = new GregorianCalendar(2080, 9, 20);
        imprimirData(hoje2);

        GregorianCalendar hoje3 = new GregorianCalendar(2080, 9, 20, 7, 17, 27);
        imprimirData(hoje3);

    }

    private static void imprimirData(Calendar hoje) {

        int ano = hoje.get(Calendar.YEAR);
        int mes = hoje.get(Calendar.MONTH);
        int dia = hoje.get(Calendar.DAY_OF_MONTH);
        int hora = hoje.get(Calendar.HOUR_OF_DAY);
        int minutos = hoje.get(Calendar.MINUTE);
        int segundos = hoje.get(Calendar.SECOND);

        System.out.printf("Hoje é : %02d/%02d/%d %02d:%02d:%02d",
                dia, (mes + 1), ano, hora, minutos, segundos);

        System.out.println();
    }
}