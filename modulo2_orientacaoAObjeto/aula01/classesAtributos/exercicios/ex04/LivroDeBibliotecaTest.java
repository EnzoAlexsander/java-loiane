package modulo2_orientacaoAObjeto.aula01.classesAtributos.exercicios.ex04;

import java.util.Date;

public class LivroDeBibliotecaTest {
    public static void main(String[] args) {

        LivroDeBiblioteca livro = new LivroDeBiblioteca();
        livro.nome = "Romarinho, joga sério essa buceta!";
        livro.autor = "Rogerio Ceni";
        livro.anoLancamento = 2020;
        livro.emprestado = true;
        livro.dataEntrega = new Date();
        livro.autorEmprestimo = "Enzo Alexsander";

        System.out.println("Nome do livro: "+livro.nome);
        System.out.println("Nome do autor: "+livro.autor);
        System.out.println("Ano de Lançamento: "+livro.anoLancamento);
        System.out.println("Quem pegou emprestado: "+livro.autorEmprestimo);
        System.out.println("Data de Entrega: "+livro.dataEntrega);
    }
}