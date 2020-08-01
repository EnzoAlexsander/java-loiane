package modulo1_basico.aula06.operadores;

public class OperadoresAritmeticos {
    public static void main(String[] args) {

        int resultado = 1 + 2;
        System.out.println(resultado);

        resultado = resultado - 1;
        System.out.println(resultado);

        resultado = resultado * 2;
        System.out.println(resultado);

        resultado = resultado / 2;
        System.out.println(resultado);

        resultado = resultado + 8;
        System.out.println(resultado);

        resultado = resultado % 7;
        System.out.println(resultado);

        String primeiroNome = "Esta é ";
        String segundoNome = "uma String concatenada.";
        String terceiroNome = primeiroNome + segundoNome;
        System.out.println(terceiroNome);

        //3 códigos feitos de maneiras diferentes, mas que resulta na mesma coisa = somar 1

        //1- System.out.println(resultado++);

        //2- resultado = resultado + 1;

        //3- resultado += 1;
    }
}