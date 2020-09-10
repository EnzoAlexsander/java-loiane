package modulo3_intermediario.aula01.enumeradores.value_valueOf;

import modulo3_intermediario.aula01.enumeradores.classes.DiaSemana;

public class TestEnum2 {
    public static void main(String[] args) {

        System.out.println(Enum.valueOf(DiaSemana.class, "DOMINGO"));

        DiaSemana dia = Enum.valueOf(DiaSemana.class, "DOMINGO");

        System.out.println(dia);
    }
}