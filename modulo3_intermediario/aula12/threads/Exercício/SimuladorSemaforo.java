package modulo3_intermediario.aula12.threads.Exercício;

public class SimuladorSemaforo {
    //Crie um semáforo usando Threads. O semáforo deve ficar verde por x segundos, depois brevementes
    //amarelo seguido de Y segundos na cor vermelha.

    public static void main(String[] args) {

        ThreadSemaforo semaforo = new ThreadSemaforo();
        for (int i = 0; i < 10; i++) {
            System.out.println(semaforo.getCor());
            semaforo.esperaCorMudar();
        }

        semaforo.desligarSemaforo();
    }

}