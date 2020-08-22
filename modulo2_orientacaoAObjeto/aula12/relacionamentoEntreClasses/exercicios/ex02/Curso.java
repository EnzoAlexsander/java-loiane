package modulo2_orientacaoAObjeto.aula12.relacionamentoEntreClasses.exercicios.ex02;

public class Curso {
    //2- Escreva uma classe para representar um Curso, que tem nome e horário. Cada curso tem um Professor, que
    // possui nome, departamento e email. Cada Curso também pode ter vários alunos (tipo Aluno). Cada Aluno tem
    // nome, matrícula e 4 notas. Escreva um programa teste que crie um Curso com 5 alunos, e que peça para o
    // usuário entrar com as 4 notas de cada aluno. Ao final, imprima a média de cada aluno, se o mesmo está
    // aprovado (média maior ou igual a 7), e qual é a média da turma.

    private String nome;
    private String horario;
    private Professor professor;
    private Aluno[] alunos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public String obterInfo() {
        String info = "Nome do Curso = " + nome + "\n";

        if (professor != null) {
            info += professor.obterInfo();
        }

        if (alunos != null) {
            System.out.println("-----Alunos-----");
            for (Aluno aluno : alunos) {
                if (aluno != null) {
                    info += aluno.obterInfo();
                    info += "\n";
                }
            }
            info += "\nMédia da turma = " + obterMediaTurma();
        }
        return info;
    }

    public double obterMediaTurma() {
        double soma = 0;
        for (Aluno aluno : alunos) {
            if (aluno != null) {
                soma += aluno.obterMedia();
            }
        }
        return soma / alunos.length;
    }
}