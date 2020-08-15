package modulo2_orientacaoAObjeto.aula04.metodocomparametro.exercicios.ex02;

public class ContaCorrente {
    //2- Cria uma classe para representar uma conta corrente que possui um número, um saldo, um status que informa se
    // ela é especialou não, um limite. Desenvolva métodos para realizar saque(verificando se o cliente pode realizar
    // saques), depositar dinheiro, consultar saldo e verificar se o cliente está usando cheque especial ou não.
    // Desenvolva um programa para testar essa classe.

    String numero;
    String agencia;
    boolean especial;
    double limiteEspecial;
    double valorEspecialUsado = 0;
    double saldo;

    boolean realizarSaque(double quantiaASacar) {

        //tem saldo na conta
        if (saldo > quantiaASacar) {
            saldo -= quantiaASacar;
            return true;
        }
        //não tem saldo na conta
        else {
            if (especial) {
                //verificar se o limite especial tem saldo
                double limite = limiteEspecial + saldo;
                if (limite >= quantiaASacar) {
                    saldo -= quantiaASacar;
                    return true;
                } else {
                    return false;
                }

            } else {
                return false; //não é especial e não tem saldo suficiente
            }
        }
    }

    void depositar(double valorDepositado) {
        saldo += valorDepositado;
    }

    void consultarSaldo() {
        System.out.println("Saldo atual da conta = " + saldo);
    }

    boolean verificarUsoChequeEspecial() {
        return saldo < 0;
    }
}