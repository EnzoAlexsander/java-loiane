package modulo2_orientacaoAObjeto.aula22.herancaInterface;

public interface SqlDML {

    void select(String query);

    void insert(String query);

    void delete(String query);

    void update(String query);

}