package modulo3_intermediario.aula12.threads.Exercício;

public enum CorSemaforo {
    VERDE(2000), AMARELO(400), VERMELHO(1200);

    private int tempoEspera;

    CorSemaforo(int tempoEspera) {
        this.tempoEspera = tempoEspera;
    }

    public int getTempoEspera() {
        return tempoEspera;
    }
}