package modulo3_intermediario.aula01.enumeradores.metodosAbstratos;

public class DocumentoTest {
    public static void main(String[] args) {

        /*for(TipoDocumento doc : TipoDocumento.values()){
            System.out.println(doc+" - "+doc.geraNumeroTeste());
        }*/

        Pessoa fisica = new Pessoa();
        fisica.setTipoDocumento(Enum.valueOf(TipoDocumento.class, "CPF"));
        fisica.setNumeroDocumento(fisica.getTipoDocumento().geraNumeroTeste());
        System.out.println(fisica);

        Pessoa jurididca = new Pessoa();
        jurididca.setTipoDocumento(Enum.valueOf(TipoDocumento.class, "CNPJ"));
        jurididca.setNumeroDocumento(jurididca.getTipoDocumento().geraNumeroTeste());
        System.out.println(jurididca);


    }
}