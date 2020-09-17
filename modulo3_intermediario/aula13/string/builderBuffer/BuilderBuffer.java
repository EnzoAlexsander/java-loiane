package modulo3_intermediario.aula13.string.builderBuffer;

public class BuilderBuffer {
    public static void main(String[] args) {

        String[] letras = {"B", "C", "D", "E", "F"};
        String alfabeto = "";

        for (String letra : letras) {
            alfabeto += letra;
        }
        System.out.println(alfabeto);

        StringBuffer Sbuffer = new StringBuffer();
        for (String letra : letras) {
            Sbuffer.append(letra);
        }
        alfabeto = Sbuffer.toString();

        System.out.println(alfabeto);

        alfabeto = new String(Sbuffer);
        System.out.println(alfabeto);

        System.out.println(Sbuffer.reverse());

        StringBuilder Sbuilder = new StringBuilder();
        for (String letra : letras) {
            Sbuilder.append(letra);
        }
    }
}