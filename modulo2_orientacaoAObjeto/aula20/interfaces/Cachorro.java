package modulo2_orientacaoAObjeto.aula20.interfaces;

public class Cachorro extends Mamifero implements AnimalEstimacao, AnimalDomesticado {

    private int tamanho;
    private String raça;

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public String getRaça() {
        return raça;
    }

    public void setRaça(String raça) {
        this.raça = raça;
    }

    @Override
    public void amamentar() {

    }

    @Override
    public void emitirSom() {

    }

    @Override
    public void brincar() {

    }

    @Override
    public void levarPassear() {

    }

    @Override
    public void imprimirNome() {

    }

    @Override
    public void levarVeterinario() {

    }

    @Override
    public void alimentar() {

    }
}