package modulo3_intermediario.aula12.threads.resume_suspend_stop;

public class Test {
    public static void main(String[] args) {

        MinhaThread thread1 = new MinhaThread("#1");
        MinhaThread thread2 = new MinhaThread("#2");

        System.out.println("Pausando a Thread #1");

        thread1.suspend();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Pausando a Thread #2");

        thread2.suspend();

        System.out.println("Resumindo a Thread #1");

        thread1.resume();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Resumindo a Thread #2");

        thread2.resume();

        System.out.println("Terminando a Thread #2");

        thread2.stop();
    }
}