package modulo3_intermediario.aula08.printf;

public class ExemploPrintf {
    public static void main(String[] args) {

        System.out.printf("Gang %s", "Olá, Mundo!");
        System.out.println();
        System.out.printf("%S", "Olá, Mundo!");
        System.out.println();

        System.out.printf("%c", 'c');
        System.out.println();
        System.out.printf("%C", 'c');
        System.out.println();

        System.out.println("%n");

        int valor = 1234556789;
        System.out.printf("%d", valor);
        System.out.println();

        double pontoFlutuante = 3.1456789;
        System.out.printf("%f", pontoFlutuante);
        System.out.println();

        String olaMundo = "Ola Mundo!";
        System.out.printf("%20s", olaMundo);
        System.out.println();
        System.out.printf("%-20s", olaMundo);

        System.out.println();

        System.out.printf("%+d", valor);

        System.out.println();

        System.out.printf("%015d", valor);

        System.out.println();

        System.out.printf("%,d", valor); //se o pc estiver com a tradução PT-BR usar .

        System.out.println();

        int valor2 = -123456789;
        System.out.printf("% d", valor2);
        System.out.println();
        System.out.printf("% d", valor);

        System.out.println();

        System.out.printf("%.2f", pontoFlutuante);
        System.out.println();

        System.out.printf("R$%10.2f", pontoFlutuante);
        System.out.println();
    }
}