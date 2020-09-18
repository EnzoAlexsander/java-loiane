package modulo3_intermediario.aula14.classesUtilitarias.math;

public class ClasseMath {
    public static void main(String[] args) {

        System.out.println(Math.pow(2, 3)); // 2x2x2

        System.out.println(Math.round(4.7)); // arredonda pra cima

        System.out.println(Math.round(4.4)); // arredonda pra baixo

        System.out.println(Math.ceil(4.4));
        System.out.println(Math.ceil(4.7)); // Só arredonda pra cima

        System.out.println(Math.floor(4.4));
        System.out.println(Math.floor(4.7)); // Só arredonda pra baixo

        System.out.println(Math.random()); // Gera um número aleatório

        System.out.println(Math.round(Math.random() * 10)); // Gera um número aleatório de 1 a 10

        // Pra calcular funções trigonométricas ⤵
        System.out.println(Math.sin(Math.toRadians(30))); //seno

        System.out.println(Math.cos(Math.toRadians(1))); //coseno

        System.out.println(Math.tan(Math.toRadians(45))); //tangente

        //O Java não é bom com números precisos.
        //Não se deve usar em Sistemas financeiros os tipos primitivos do Java.
        //Existem Classes no Java que são mais apropriados pra isso.
        // São elas BigNumber e BigDecimal.
    }
}