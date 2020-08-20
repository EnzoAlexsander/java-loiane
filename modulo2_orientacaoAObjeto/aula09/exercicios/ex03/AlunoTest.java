package modulo2_orientacaoAObjeto.aula09.exercicios.ex03;

import java.util.Scanner;

public class AlunoTest {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.print("Nome do aluno: ");
        aluno.setNome(scan.next());

        System.out.print("Nome do curso: ");
        aluno.setNomeCurso(scan.next());

        System.out.print("Matrícula: ");
        aluno.setMatricula(scan.next());

        for (int i = 0; i < aluno.getNomeDisciplinas().length; i++) {
            System.out.println("Nome da disciplina: ");
            aluno.setNomeDisciplinaPosicao(i, scan.next());
        }

        for (int i = 0; i < aluno.getNotasDisciplinas().length; i++) {
            System.out.println("Obtendo notas da disciplina: " + aluno.getNomeDisciplinas()[i]);
            for (int j = 0; j < aluno.getNotasDisciplinas()[i].length; j++) {
                System.out.println("Nota " + (j + 1));
                aluno.setNotaPosicaoIJ(i, j, scan.nextDouble());
            }
        }

        aluno.mostrarInfo();

        for (int i = 0; i < aluno.getNomeDisciplinas().length; i++) {
            if (aluno.verificarAprovado(i)) {
                System.out.println("Disciplina " + aluno.getNomeDisciplinas()[i] + " - Aprovado");
            } else {
                System.out.println("Disciplina " + aluno.getNomeDisciplinas()[i] + " - Reprovado");
            }
        }

    }
}