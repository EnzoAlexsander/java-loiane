package modulo3_intermediario.aula01.enumeradores.classes;

public class TestEnum {
    public static void main(String[] args) {

        DiaSemana dia = DiaSemana.DOMINGO;

        System.out.println(dia.toString() + " = " + dia.getValor());

        Data data = new Data(13, 8, 2020, DiaSemana.QUINTA);
    }
}