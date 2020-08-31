package modulo2_orientacaoAObjeto.aula19.exercicios.ex01;

public class ContaEspecial extends ContaBancaria {

    private double limite;

    @Override
    public String toString() {
        String s = "ContaEspecial {";
        s += "diaRendimento: " + limite + "\n";
        s += super.toString();
        s += " }";
        return s;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public boolean sacar(double valor) {
        double saldoComLimite = this.getSaldo() + limite;
        if ((saldoComLimite - valor) >= 0) {
            this.setSaldo(this.getSaldo() - valor);
            return true;
        }
        return false;
    }
}