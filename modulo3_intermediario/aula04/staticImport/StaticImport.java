package modulo3_intermediario.aula04.staticImport;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
//import static java.lang.Math.*;

//obs: é melhor usar cada import específicamente invés de importar todos como comentado acima.

public class StaticImport {
    public static void main(String[] args) {

        double a = 2;
        double b = 3;
        double c = 4;

        System.out.println(Math.pow(a, b));
        System.out.println(pow(a, b));

        System.out.println(Math.sqrt(c));
        System.out.println(sqrt(c));


    }
}