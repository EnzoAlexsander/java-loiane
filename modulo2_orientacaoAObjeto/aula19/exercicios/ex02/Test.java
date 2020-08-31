package modulo2_orientacaoAObjeto.aula19.exercicios.ex02;

public class Test {
    public static void main(String[] args) {

        PessoaFisica pessoa1 = new PessoaFisica();
        pessoa1.setNome("Contribuinte 01");
        pessoa1.setRendaBruta(1000);
        pessoa1.setCpf("812.287.080-53");

        PessoaJuridica pessoa2 = new PessoaJuridica();
        pessoa2.setNome("Contribuinte 02");
        pessoa2.setRendaBruta(5000);
        pessoa2.setCnpj("69.063.776/0001-57");

        PessoaFisica pessoa3 = new PessoaFisica();
        pessoa3.setNome("Contribuinte 03");
        pessoa3.setRendaBruta(2000);
        pessoa3.setCpf("400.030.030-00");

        PessoaJuridica pessoa4 = new PessoaJuridica();
        pessoa4.setNome("Contribuinte 04");
        pessoa4.setRendaBruta(3000);
        pessoa4.setCnpj("33.283.972/0001-90");

        PessoaFisica pessoa5 = new PessoaFisica();
        pessoa5.setNome("Contribuinte 05");
        pessoa5.setRendaBruta(3700);
        pessoa5.setCpf("885.395.440-08");

        PessoaJuridica pessoa6 = new PessoaJuridica();
        pessoa6.setNome("Contribuinte 06");
        pessoa6.setRendaBruta(4000);
        pessoa6.setCnpj("39.592.394/0001-50");

        Contribuinte[] contribuintes = new Contribuinte[6];
        contribuintes[0] = pessoa1;
        contribuintes[1] = pessoa2;
        contribuintes[2] = pessoa3;
        contribuintes[3] = pessoa4;
        contribuintes[4] = pessoa5;
        contribuintes[5] = pessoa6;

        for (Contribuinte c : contribuintes) {
            System.out.println(c.toString());
        }
    }
}