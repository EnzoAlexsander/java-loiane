package modulo2_orientacaoAObjeto.aula28.criandoMinhaException.exercicios;

public class Contato {

    //Escreva  uma  classe  Contato  que  contenha  nome,  telefone  e  um   identificador.
    // Esse  identificador  deve  ser  gerado  automaticamente  pela   classe  através  de
    // um  contador  (cada  vez  que  um  Contato  é  criado  o   contador  é  incrementado
    // e  atribuído  ao  identificador).
    // Crie  uma  classe   Agenda  que  irá  funcionar  para  gerenciar  os  Contatos.
    // Essa  classe  precisa   de  ter  um  método  para  adicionar  um  Contato  e  também
    // para  consultar.   Crie  uma  classe  Teste  que  informe  um  menu  ao  usuário:
    // 1-­‐  para  consultar   um  contato  da  agenda  e  2  –  para  adicionar  um
    // contato na  agenda.   Se  o  contato  não  existir,  o  programa  deve  lançar  uma
    // exceção  de   ContatoNaoExisteException.  Caso  a  agenda  esteja  cheia  quando  o
    // usuário   quiser  adicionar  um  novo  contato,  o  programa  deve  lançar  uma
    // exceção   AgendaCheiaExeption.  Trate  também  as  exceções  de  tipo  de  dados
    // (caso  o   usuário  entre  com  um  tipo  de  dado  invalido.

    private static int contador = 0;
    private int id;
    private String nome;
    private String telefone;
    private String email;

    public Contato() {
        contador++;
        id = contador;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "Id=" + id +
                ", Nome='" + nome + '\'' +
                ", Telefone='" + telefone + '\'' +
                ", Email='" + email + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}