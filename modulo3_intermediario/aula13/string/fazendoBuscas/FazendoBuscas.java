package modulo3_intermediario.aula13.string.fazendoBuscas;

public class FazendoBuscas {
    public static void main(String[] args) {

        String banana = "banana";
        String ana = "ana";

        System.out.println(banana.indexOf('x'));
        System.out.println(banana.indexOf('b'));
        System.out.println(banana.indexOf('a'));

        System.out.println(banana.indexOf(ana));

        System.out.println(banana.lastIndexOf('a'));
        System.out.println(banana.lastIndexOf(ana));

        System.out.println(banana.contains(ana));
        System.out.println(banana.contains("laranja"));

    }
}