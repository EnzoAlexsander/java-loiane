package modulo2_orientacaoAObjeto.aula22.herancaInterface.exercicios.ex01_02_03;

public class Test {
    public static void main(String[] args) {

        Quadrado quadrado = new Quadrado();
        quadrado.setLado(2);
        quadrado.setNome("Quadrado");

        Circulo circulo = new Circulo();
        circulo.setRaio(2);
        circulo.setNome("Círculo");

        Triangulo triangulo = new Triangulo();
        triangulo.setAltura(2);
        triangulo.setBase(3);
        triangulo.setNome("Triângulo");

        Cubo cubo = new Cubo();
        cubo.setLado(3);
        cubo.setNome("Cubo");

        Cilindro cilindro = new Cilindro();
        cilindro.setAltura(3);
        cilindro.setRaio(2);
        cilindro.setNome("Cilindro");

        Piramide piramide = new Piramide();
        piramide.setAltura(3);
        piramide.setApotema(4);
        piramide.setArestaBase(2);
        piramide.setNumPoliBase(4);
        piramide.setBase(quadrado);
        piramide.setNome("Pirâmide");

        FiguraGeometrica[] figuras = new FiguraGeometrica[6];
        figuras[0] = quadrado;
        figuras[1] = circulo;
        figuras[2] = triangulo;
        figuras[3] = cubo;
        figuras[4] = cilindro;
        figuras[5] = piramide;

        for (FiguraGeometrica figura : figuras) {
            System.out.println("--------------------");
            System.out.println(figura.getNome());

            if (figura instanceof Figura2D) {
                Figura2D f2D = (Figura2D) figura;
                System.out.println(f2D.calcularArea());
            }

            if (figura instanceof Figura3D) {
                Figura3D f3D = (Figura3D) figura;
                System.out.println(f3D.calcularArea());
                System.out.println(f3D.calcularVolume());
            }
        }
    }
}