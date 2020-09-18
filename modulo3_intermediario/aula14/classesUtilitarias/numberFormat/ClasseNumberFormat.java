package modulo3_intermediario.aula14.classesUtilitarias.numberFormat;

import java.math.RoundingMode;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Currency;
import java.util.Locale;

public class ClasseNumberFormat {
    public static void main(String[] args) throws ParseException {

        //1.000,00 - Brasil
        //1,000.00 - EUA
        NumberFormat nf;
        String num;

        Locale en = new Locale("en", "United Stated");
        nf = NumberFormat.getInstance(en);

        num = nf.format(100.99);
        System.out.println(num);

        Locale br = new Locale("pt", "Brazil");
        nf = NumberFormat.getInstance(br);

        num = nf.format((100.99));
        System.out.println(num);

        //MOEDA
        NumberFormat moeda;
        String valor;

        moeda = NumberFormat.getCurrencyInstance(Locale.getDefault());
        valor = moeda.format(100.99);
        System.out.println(valor);

        Currency currency;

        currency = moeda.getCurrency();
        System.out.println(currency);

        //PORCENTAGEM

        NumberFormat porcent;
        String porcentagem;

        porcent = NumberFormat.getPercentInstance();
        porcentagem = porcent.format(99.987);
        System.out.println(porcentagem);

        porcent.setMaximumIntegerDigits(4);
        porcent.setMinimumIntegerDigits(3);

        porcent.setMaximumFractionDigits(2);
        porcent.setMinimumFractionDigits(1);

        porcentagem = porcent.format(99.987);
        System.out.println(porcentagem);

        //ARREDONDAMENTO

        nf = NumberFormat.getInstance();
        nf.setRoundingMode(RoundingMode.DOWN);
        nf.setMaximumFractionDigits(0);
        nf.setMinimumFractionDigits(0);
        System.out.println(nf.format(99.50));

        nf = NumberFormat.getInstance();
        nf.setRoundingMode(RoundingMode.UP);
        nf.setMaximumFractionDigits(0);
        nf.setMinimumFractionDigits(0);
        System.out.println(nf.format(99.50));

        Number num3 = nf.parse("100.00");
        System.out.println(num3.intValue());
    }
}