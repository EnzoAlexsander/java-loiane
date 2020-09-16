package modulo3_intermediario.aula12.threads.revezamentoDeThreads;

public class Test {
    public static void main(String[] args) {

        TicTac tt = new TicTac();
        ThreadTicTac tic = new ThreadTicTac("Tic", tt);
        ThreadTicTac tac = new ThreadTicTac("Tac", tt);

        try {
            tic.thread.join();
            tac.thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}