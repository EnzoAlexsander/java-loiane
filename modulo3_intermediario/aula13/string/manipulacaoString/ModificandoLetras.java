package modulo3_intermediario.aula13.string.manipulacaoString;

public class ModificandoLetras {
    public static void main(String[] args) {

        String teste = "Teste";

        String testeMinusc = teste.toLowerCase();
        String testeMaiusc = teste.toUpperCase();

        System.out.println(testeMinusc); //tudo em minúsculo
        System.out.println(testeMaiusc); //tudo em maiúsculo

        //if(teste.toLowerCase().equals(teste.toLowerCase()));
    }
}