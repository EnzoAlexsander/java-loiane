package modulo2_orientacaoAObjeto.aula16.polimorfismo;

public class Aluno extends Pessoa {

    private String curso;
    private double[] notas;

    public Aluno() {
        super();
    }

    public Aluno(String nome, String endereco, String telefone, String curso) {
        super(nome, endereco, telefone);
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
        super.setCpf("45364574577");

        this.setCpf("234533446436");
    }

    public String obterEtiquetaEndereco() {
        String s = "Enredeço do Aluno: ";
        s += super.getEndereco();

        return s;
    }
}