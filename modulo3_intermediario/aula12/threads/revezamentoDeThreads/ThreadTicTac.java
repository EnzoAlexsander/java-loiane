package modulo3_intermediario.aula12.threads.revezamentoDeThreads;

public class ThreadTicTac implements Runnable {

    TicTac tt;
    Thread thread;

    final int NUM = 5;

    public ThreadTicTac(String nome, TicTac tt) {
        this.tt = tt;
        thread = new Thread(this, nome);
        thread.start();
    }

    @Override
    public void run() {

        if (thread.getName().equalsIgnoreCase("Tic")) {
            for (int i = 0; i < NUM; i++) {
                tt.tic(true);
            }
            tt.tic(false);
        } else {
            for (int i = 0; i < NUM; i++) {
                tt.tac(true);
            }
            tt.tac(false);
        }
    }
}