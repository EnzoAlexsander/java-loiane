package modulo3_intermediario.aula01.enumeradores.constantes;

public class EnumTest {
    public static void main(String[] args) {

        usandoEnum();
    }

    private static void usandoEnum() {

        DiaSemanaEnum segunda = DiaSemanaEnum.SEGUNDA;
        DiaSemanaEnum terca = DiaSemanaEnum.TERCA;
        DiaSemanaEnum quarta = DiaSemanaEnum.QUARTA;
        DiaSemanaEnum quinta = DiaSemanaEnum.QUINTA;
        DiaSemanaEnum sexta = DiaSemanaEnum.SEXTA;
        DiaSemanaEnum sabado = DiaSemanaEnum.SABADO;
        DiaSemanaEnum domingo = DiaSemanaEnum.DOMINGO;

        System.out.println("Teste utilizando enum no Java");

        imprimeDiaSemana(segunda);
        imprimeDiaSemana(terca);
        imprimeDiaSemana(quarta);
        imprimeDiaSemana(quinta);
        imprimeDiaSemana(sexta);
        imprimeDiaSemana(sabado);
        imprimeDiaSemana(domingo);
    }

    private static void imprimeDiaSemana(DiaSemanaEnum dia) {
        switch (dia) {
            case SEGUNDA:
                System.out.println("Segunda-feira");
                break;
            case TERCA:
                System.out.println("Terça-feira");
                break;
            case QUARTA:
                System.out.println("Quarta-feira");
                break;
            case QUINTA:
                System.out.println("Quinta-feira");
                break;
            case SEXTA:
                System.out.println("Sexta-feira");
                break;
            case SABADO:
                System.out.println("Sábado");
                break;
            case DOMINGO:
                System.out.println("Domingo");
                break;
        }
    }
}