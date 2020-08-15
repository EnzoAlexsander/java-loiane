package modulo2_orientacaoAObjeto.aula04.metodocomparametro.exercicios.ex03;

public class Aluno {
    //3- Escreva uma classe para representar um Aluno. Adicione atributos relacionados às características de um Aluno,
    // como nome, matricula, curso, que está matriculado, nome de 3 disciplinas que está cursando e as noras dessas 3
    // disciplinas. Desenvolva um método para verificar se o aluno está aprovado (nota maior ou igual a 7) em uma
    // determinada disciplina. Escreva um programa para testar essa classe, que pede as informações do aluno ao usuário
    // e ao final informa o nome das disciplinas, mostra as notas e mostra se o aluno foi aprovado ou não.

    String nome;
    String matricula;
    String nomeCurso;
    String[] nomeDisciplinas = new String[3];
    double[][] notasDisciplinas = new double[3][4];
    double soma = 0;

    void mostrarInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome do Curso: " + nomeCurso);

        for (int i = 0; i < notasDisciplinas.length; i++) {
            System.out.println("Notas da disciplina " + nomeDisciplinas[i]);
            for (int j = 0; j < notasDisciplinas[i].length; j++) {
                System.out.println(notasDisciplinas[i][j] + " ");
            }
            System.out.println();
        }
    }

    boolean verificarAprovado(int indice) {

        if (obterMedia(indice) >= 7) {
            return true;
        } else {
            return false;
        }
    }

    double obterMedia(int indice) {
        for (int i = 0; i < notasDisciplinas[indice].length; i++) {
            soma += notasDisciplinas[indice][i];
        }
        double media = soma / 4;

        return media;
    }
}