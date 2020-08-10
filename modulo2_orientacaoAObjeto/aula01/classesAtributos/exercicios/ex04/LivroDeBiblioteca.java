package modulo2_orientacaoAObjeto.aula01.classesAtributos.exercicios.ex04;

import java.util.Date;

public class LivroDeBiblioteca {
        //4- Usando o resultado do modelo "Livro" como base, crie uma classe "LivroDeBiblioteca" que represente os dados
        // básicos de um livro de uma biblioteca, que pode ser emprestado a leitores.

    String nome;
    String autor;
    int qtdPaginas;
    int anoLancamento;
    String isbn;

    boolean emprestado;
    Date dataEntrega;
    String autorEmprestimo;
}