package modulo2_orientacaoAObjeto.aula04.metodocomparametro.exercicios.ex02;

public class ContaCorrenteTest {
    public static void main(String[] args) {

        ContaCorrente conta = new ContaCorrente();
        conta.numero = "12345-6";
        conta.agencia = "1234";
        conta.especial = true;
        conta.limiteEspecial = 500;
        conta.saldo = -10;

        System.out.println("Saldo da conta " + conta.numero + " = R$ " + conta.saldo);

        boolean saqueEfetuado = conta.realizarSaque(10);
        if (saqueEfetuado) {
            System.out.println("Saque efetuado com sucesso");
            conta.consultarSaldo();
        } else {
            System.out.println("Não é possível sacar. Saldo insuficiente");
        }

        System.out.println("---------------------------------------------------");

        saqueEfetuado = conta.realizarSaque(500);
        System.out.println("Tentativa de saque de 500 reais");
        if (saqueEfetuado) {
            System.out.println("Saque efetuado com sucesso");
            conta.consultarSaldo();
        } else {
            System.out.println("Não é possível sacar. Saldo insuficiente");
        }

        System.out.println("---------------------------------------------------");

        System.out.println("Depósito de 500 reais");
        conta.depositar(500);
        conta.consultarSaldo();

        System.out.println("---------------------------------------------------");

        if (conta.verificarUsoChequeEspecial()) {
            System.out.println("Está usando cheque especial");
        } else {
            System.out.println("Não está usando cheque especial");
        }

        System.out.println("---------------------------------------------------");

        conta.realizarSaque(600);
        conta.consultarSaldo();
        if (conta.verificarUsoChequeEspecial()) {
            System.out.println("Está usando cheque especial");
        } else {
            System.out.println("Não está usando cheque especial");
        }
    }
}