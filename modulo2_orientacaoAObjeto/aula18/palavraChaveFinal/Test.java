package modulo2_orientacaoAObjeto.aula18.palavraChaveFinal;

public class Test {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        //Pessoa aluno = new Aluno();
        //Pessoa professor = new Professor();
        Aluno aluno = new Aluno();
        Professor professor = new Professor();

        //exemplo 02
        System.out.println(Constantes.URL_BLOG);
        //Constantes.URL_BLOG = "fsgsagdasga";
        System.out.println(Constantes.URL_BLOG);

        final int TOTAL = 1;
        //total = total +1;
        System.out.println(TOTAL);
    }
}