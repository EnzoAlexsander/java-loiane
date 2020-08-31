package modulo2_orientacaoAObjeto.aula19.object;

public class Test {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        aluno.setCurso("Ciencia da Computação");
        double[] notas = {10, 9, 8, 7};
        aluno.setNotas(notas);

        System.out.println(aluno);

        String s1 = "afsdafsgfs";
        String s2 = "afsdafsgfs";

        System.out.println(s1.equals(s2));

        Aluno aluno2 = new Aluno();
        aluno.setCurso("Ciencia da Computação");
        double[] notas2 = {6, 5, 4, 3};
        aluno.setNotas(notas2);

        System.out.println(aluno.equals(aluno2));
    }
}