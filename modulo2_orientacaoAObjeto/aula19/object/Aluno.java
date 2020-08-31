package modulo2_orientacaoAObjeto.aula19.object;

import java.util.Arrays;

public class Aluno {

    private String curso;
    private double[] notas;

    public Aluno() {
        super();
    }

    public Aluno(String nome, String endereco, String telefone, String curso) {
        //super(nome, endereco, telefone);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double calcularMedia() {
        return 0;
    }

    public boolean verificarAprovado() {
        return true;
    }

    public void metodoQualquer() {
        //super.setCpf("45364574577");

        //this.setCpf("234533446436");
    }

    public String obterEtiquetaEndereco() {
        String s = "Enredeço do Aluno: ";
        //s += super.getEndereco();

        return s;
    }

    //@Override
    public void imprimirEtiquetaEndereco() {
        System.out.println(this.obterEtiquetaEndereco());
    }

    /* //Feito a mão
    public String toString(){
        String s = curso + "\n";
        for(double nota : notas){
            s += nota + " ";
        }
        return s;
    }*/

    @Override //feito pelo alt insert
    public String toString() {
        return "Aluno{" +
                "curso='" + curso + '\'' +
                ", notas=" + Arrays.toString(notas) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null)
            return false;
        Aluno aluno = (Aluno) o;
        if (curso.equalsIgnoreCase(aluno.getCurso())) {
            return true;
        }
        return false;
    }
}