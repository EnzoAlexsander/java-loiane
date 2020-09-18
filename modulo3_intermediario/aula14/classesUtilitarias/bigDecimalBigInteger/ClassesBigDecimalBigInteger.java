package modulo3_intermediario.aula14.classesUtilitarias.bigDecimalBigInteger;

import java.math.BigDecimal;
import java.math.BigInteger;

public class ClassesBigDecimalBigInteger {
    public static void main(String[] args) {

        double a = 0.03;
        double b = 0.04;
        double c = b - a;
        System.out.println(c);

        BigDecimal _a = new BigDecimal("0.03");
        BigDecimal _b = new BigDecimal("0.04");
        BigDecimal _c = _b.subtract(_a);
        System.out.println(_c);

        BigDecimal bd = new BigDecimal("1234567890.0987654321");
        BigDecimal bd2 = new BigDecimal("987654321.9876543210");

        System.out.println(bd.add(bd2));
        System.out.println(bd.multiply(bd2));
        System.out.println(bd.divide(new BigDecimal(2)));

        BigInteger bi = new BigInteger("100000000000000000000");
        System.out.println(bi);
    }
}