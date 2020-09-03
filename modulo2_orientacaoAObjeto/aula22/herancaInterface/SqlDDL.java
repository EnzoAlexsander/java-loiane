package modulo2_orientacaoAObjeto.aula22.herancaInterface;

public interface SqlDDL {

    void create(String query);

    void alter(String query);

    void drop(String query);
}