package modulo2_orientacaoAObjeto.aula22.herancaInterface;

public interface BancoDados extends SqlDCL, SqlDML, SqlDDL {

    void abrirConexao();

    void fecharConexao();

}