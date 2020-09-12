package modulo3_intermediario.aula05.escopo;

public class Test {
    public static void main(String[] args) {

        EscopoVariáveis escopo = new EscopoVariáveis();
        escopo.setValor(10);

        System.out.println(escopo.getValor()); //10
        System.out.println(escopo.calcularValor(20)); //20 ou 30?
        System.out.println(escopo.getValor()); //10 ou 20?
        System.out.println(escopo.teste()); //4 ou 9?
        System.out.println(escopo.getValor());
    }
}