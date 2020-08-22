package modulo2_orientacaoAObjeto.aula12.relacionamentoEntreClasses;

public class ContatoTest {
    public static void main(String[] args) {

        Contato contato = new Contato();
        contato.setNome("Enzo");
        //contato.setEndereco("Taguatinga");
        //contato.setTelefone("61 1 2345-6789");

        //relacionamento tem um endereço
        Endereco end = new Endereco();
        end.setNomeRua("Rua sebesela");
        end.setNumero("21");
        end.setComplemento("-");
        end.setCidade("Taguatinga");
        end.setEstado("Distrito Federal");
        end.setCep("99999-999");

        contato.setEndereco(end);

        //relacionamento tem um telefone
        Telefone telefone = new Telefone();
        telefone.setTipo("Celular");
        telefone.setDdd("61");
        telefone.setNumero("1 2345-6789");

        Telefone telefone2 = new Telefone();
        telefone2.setTipo("Casa");
        telefone2.setDdd("61");
        telefone2.setNumero("9 8765-4321");

        Telefone[] telefones = new Telefone[2];
        telefones[0] = telefone;
        telefones[1] = telefone2;

        //contato.setTelefone(telefone);
        contato.setTelefones(telefones);

        //Teste saída no console
        System.out.println(contato.getNome());
        //System.out.println(contato.getTelefone());

        if (contato != null && contato.getEndereco() != null) {
            System.out.println(contato.getEndereco().getCidade());
        }

        /*if(contato != null && contato.getTelefone() != null){
            System.out.println(contato.getTelefone().getDdd()+ " "+contato.getTelefone().getNumero());
        }*/

        if (contato != null && contato.getTelefones() != null) {
            for (Telefone tel : contato.getTelefones()) {
                System.out.println(tel.getDdd() + " " + tel.getNumero());
            }
        }
    }
}