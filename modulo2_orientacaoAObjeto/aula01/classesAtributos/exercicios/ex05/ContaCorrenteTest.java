package modulo2_orientacaoAObjeto.aula01.classesAtributos.exercicios.ex05;

public class ContaCorrenteTest {
    public static void main(String[] args) {

        ContaCorrente conta = new ContaCorrente();
        conta.numero = "12345-6";
        conta.agencia = "1234";
        conta.especial = true;
        conta.limiteEspecial = 500;
        conta.saldo = -10;

        System.out.println("Saldo da conta " + conta.numero + " = R$ " + conta.saldo);
    }
}
