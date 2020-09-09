package modulo2_orientacaoAObjeto.aula28.criandoMinhaException.exercicios;

public class AgendaCheiaException extends Exception {

    @Override
    public String getMessage() {
        return "Agenda já está cheia";
    }
}