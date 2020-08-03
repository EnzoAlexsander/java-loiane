package modulo1_basico.aula09.loops;

public class LoopWhileDoWhile {
    public static void main(String[] args) {

        int i = 1; // count ou cont
        int max = 10;

        System.out.println("Contando até: " + max);

        while (i <= max) {
            System.out.println("Valor de i:" + i);
            i++; // i = i + 1; || i += 1;
        }
        System.out.println(i);

        do {
            i++;
            System.out.println("Valor de i: " + i);
        } while (i < 15);

        System.out.println(i);
    }
}