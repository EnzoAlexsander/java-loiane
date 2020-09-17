package modulo3_intermediario.aula13.string.manipulacaoString;

public class Juntando_SeparandoStrings {
    public static void main(String[] args) {

        String alfabeto = String.join(",", "A", "B", "C", "D");
        System.out.println(alfabeto);

        String[] letras = alfabeto.split(", ");
        for (String letra : letras) {
            System.out.println(letra);
        }

        String doArquivo = "1;Alessandra;30;";
        String[] infos = doArquivo.split(";");
        for (String info : infos) {
            System.out.println(info);
        }
    }
}