package modulo3_intermediario.aula01.enumeradores.value_valueOf;

import modulo3_intermediario.aula01.enumeradores.classes.DiaSemana;

public class TestEnum {
    public static void main(String[] args) {

        DiaSemana[] dias = DiaSemana.values();

        for (int i = 0; i < dias.length; i++) {
            System.out.println(dias[i]);
        }

        System.out.println();

        for (DiaSemana dia : DiaSemana.values()) {
            System.out.println(dia);
        }
    }
}