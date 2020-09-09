package modulo2_orientacaoAObjeto.aula28.criandoMinhaException.exercicios;

public class ContatoNaoExisteException extends Exception {

    private String nomeContato;

    public ContatoNaoExisteException(String nomeContato) {
        this.nomeContato = nomeContato;
    }

    @Override
    public String getMessage() {
        return "Contato " + nomeContato + " não existe na agenda!";
    }
}