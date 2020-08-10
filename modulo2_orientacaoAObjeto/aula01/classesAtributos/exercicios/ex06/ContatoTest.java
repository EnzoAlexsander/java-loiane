package modulo2_orientacaoAObjeto.aula01.classesAtributos.exercicios.ex06;

public class ContatoTest {
    public static void main(String[] args) {

        Contato contato1 = new Contato();
        contato1.nome = "Alessandra";
        contato1.endereço = "Taguatinga";
        contato1.email = "alehrodriguesd@enzo.com";

        contato1.telefones = new String[1];
        contato1.telefones[0] = "9 9999-9999";
        contato1.telefones[1] = "9 8888-8888";
    }
}