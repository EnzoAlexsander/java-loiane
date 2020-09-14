package modulo3_intermediario.aula08.printf;

public class TabelaDePrecos {
    public static void main(String[] args) {

        testeMaisCompleto();
    }

    private static void testeMaisCompleto() {
        double[] precos = {10000, 123.54, 7843.567, 1, 4.56789};

        for (int i = 0; i < precos.length; i++) {
            System.out.printf("%s %02d: total de R$%,10.2f%n", "Item", i + 1, precos[i]);
        }

        //Java.util.Formater
    }
}