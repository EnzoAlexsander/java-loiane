package modulo3_intermediario.aula14.classesUtilitarias.simpleDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class ClasseSimpleDateFormat {
    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy HH:mm:ss z");

        Calendar data = new GregorianCalendar(2010, 2, 20, 14, 32, 25);

        System.out.println(sdf.format(data.getTime()));

        Date hoje = new Date();

        System.out.println(sdf.format(hoje));

        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
        String minhaData = "20/02/2000";

        try {
            Date minhaDataEmDate = sdf2.parse(minhaData);

            System.out.println(minhaDataEmDate);
            System.out.println(sdf.format(minhaDataEmDate));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}