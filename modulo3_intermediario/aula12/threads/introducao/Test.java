package modulo3_intermediario.aula12.threads.introducao;

public class Test {
    public static void main(String[] args) {

        MinhaThread thread = new MinhaThread("Thread #1", 500);

        MinhaThread thread2 = new MinhaThread("Thread #2", 1000);

        MinhaThread thread3 = new MinhaThread("Thread #3", 1500);
    }
}