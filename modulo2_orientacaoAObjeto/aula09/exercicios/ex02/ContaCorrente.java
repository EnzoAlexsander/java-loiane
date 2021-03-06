package modulo2_orientacaoAObjeto.aula09.exercicios.ex02;

public class ContaCorrente {
    //2- Cria	uma	classe	para	representar	uma	conta	corrente	que	possui	um
    //número,	um	saldo,	um	status	que	informa	se	ela	é	especial	ou	não, um
    //limite. Desenvolva	métodos	para	realizar	saque	(verificando	se	o	cliente
    //pode	realizar	saques),	despositar	dinheiro,	consultar	saldo	e	verificar	se	o
    //cliente	está	usando	cheque	especial	ou	não.	Desenvolva	um	programa
    //para	testar	essa	classe.

    private String numero;
    private String agencia;
    private boolean especial;
    private double limiteEspecial;
    private double valorEspecialUsado = 0;
    private double saldo;

    public ContaCorrente() {
    }

    public ContaCorrente(String numero, String agencia, boolean especial,
                         double limiteEspecial, double valorEspecialUsado, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.especial = especial;
        this.limiteEspecial = limiteEspecial;
        this.valorEspecialUsado = valorEspecialUsado;
        this.saldo = saldo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    public double getLimiteEspecial() {
        return limiteEspecial;
    }

    public void setLimiteEspecial(double limiteEspecial) {
        this.limiteEspecial = limiteEspecial;
    }

    public double getValorEspecialUsado() {
        return valorEspecialUsado;
    }

    public void setValorEspecialUsado(double valorEspecialUsado) {
        this.valorEspecialUsado = valorEspecialUsado;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean realizarSaque(double quantiaASacar) {

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

    public void depositar(double valorDepositado) {
        saldo += valorDepositado;
    }

    public void consultarSaldo() {
        System.out.println("Saldo atual da conta = " + saldo);
    }

    public boolean verificarUsoChequeEspecial() {
        return saldo < 0;
    }

}