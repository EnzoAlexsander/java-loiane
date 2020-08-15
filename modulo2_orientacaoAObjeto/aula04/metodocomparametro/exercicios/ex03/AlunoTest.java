package modulo2_orientacaoAObjeto.aula04.metodocomparametro.exercicios.ex03;

import java.util.Scanner;

public class AlunoTest {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Aluno aluno = new Aluno();
        System.out.print("Nome do aluno: ");
        aluno.nome = scan.next();

        System.out.print("Nome do curso: ");
        aluno.nomeCurso = scan.next();

        System.out.print("Matrícula: ");
        aluno.matricula = scan.next();

        for (int i = 0; i < aluno.nomeDisciplinas.length; i++) {
            System.out.println("Nome da disciplina: ");
            aluno.nomeDisciplinas[i] = scan.next();
        }

        for (int i = 0; i < aluno.nomeDisciplinas.length; i++) {
            System.out.println("Obtendo notas da disciplina: " + aluno.nomeDisciplinas[i]);
            for (int j = 0; j < aluno.notasDisciplinas[i].length; j++) {
                System.out.println("Nota " + (j + 1));
                aluno.notasDisciplinas[i][j] = scan.nextDouble();
            }
        }

        aluno.mostrarInfo();

        for (int i = 0; i < aluno.nomeDisciplinas.length; i++) {
            if (aluno.verificarAprovado(i)) {
                System.out.println("Disciplina " + aluno.nomeDisciplinas[i] + " - Aprovado");
            } else {
                System.out.println("Disciplina " + aluno.nomeDisciplinas[i] + " - Reprovado");
            }
        }
    }
}