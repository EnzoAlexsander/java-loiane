package modulo2_orientacaoAObjeto.aula01.classesAtributos.exercicios.ex03;

public class LivroLivrariaTest {
    public static void main(String[] args) {

        LivroLivraria livro = new LivroLivraria();
        livro.nome = "Casamento Blindado";
        livro.autor = "Renato e Cristiane Cardoso";
        livro.anoLancamento = 2011;
        livro.qtdPaginas = 100;
        livro.isbn = "Nao sei";
        livro.preco = 29.99;

        System.out.println("Nome do livro: "+livro.nome);
        System.out.println("Autor do livro: "+livro.autor);
        System.out.println("Valor do livro: "+livro.preco);
    }
}