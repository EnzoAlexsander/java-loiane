package modulo2_orientacaoAObjeto.aula12.relacionamentoEntreClasses.exercicios.ex01;

public class Agenda {
    //1- Escreva uma classe Agenda, que contém vários contatos do tipo Contato. Cada contato possui nome, telefone
    // e email. A Agenda possui um nome. Crie um programa teste que peça para o usuário entrar com o nome da Agenda
    // e em seguida 3 contatos. Crie métodos que retornem uma String com a informação de cada contato e também de
    // todos os contatos da agenda.

    private String nome;
    private Contato[] contatos;

    public Agenda() {
    }

    public Agenda(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Contato[] getContatos() {
        return contatos;
    }

    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
    }

    public String obterInfo() {
        String info = "Nome = " + nome + "\n";

        if (contatos != null) {
            for (Contato c : contatos) {
                info += c.obterInfo() + "\n";
            }
        }
        return info;
    }
}