package modulo2_orientacaoAObjeto.aula01.classesAtributos.exercicios.ex02;

public class LivroTest {
    public static void main(String[] args) {

        Livro livro = new Livro();
        livro.nome = "Casamento Blindado";
        livro.autor = "Renato e Cristiane Cardoso";
        livro.anoLancamento = 2011;
        livro.qtdPaginas = 100;
        livro.isbn = "Nao sei";

        System.out.println("Nome do livro: "+livro.nome);
        System.out.println("Autor do livro: "+livro.autor);
    }
}