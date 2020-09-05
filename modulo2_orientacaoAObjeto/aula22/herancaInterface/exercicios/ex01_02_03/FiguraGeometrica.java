package modulo2_orientacaoAObjeto.aula22.herancaInterface.exercicios.ex01_02_03;

public abstract class FiguraGeometrica implements DimensaoSuperficial {
    /*
    1- Escreva	uma	classe FiguraGeometrica	com	atributos	nome	e	cor.	Escreva
    uma	classe	Figura2D	e	uma	classe	Figura3D.	Ambas	classes	Figura2D	e
    Figura3D	são	subclasses	da	classe	FiguraGeometrica.	Crie	ainda	as	classes
    Circulo,	Quadrado	e	Triangulo	que	estendem	a	classe Figura2D	e crie
    também	as	classes	Cubo	e	Cilindro e	Piramide que	estendem	a	classe
    Figura3D.

    2- Escreva	a	interface	DimensaoSuperficial	que	contém	o	método
    calcularArea. Escreva	a	interface	DimensaoVolumetrica	que	contém	o
    método	calcularVolume.	Aplique	a	interface	DimensaoSuperficial	em
    todas	as	subclasses	de	Figura2D	e	Figura3D	e	aplique	a	interface
    DimensaoVolumetrica	nas	subclasses	de	Figura3D,	implementando	seus
    métodos	de	acordo	com	as	regras	de	cada	figura	geométrica	(crie	os
    atributos	necessários).

    3- Crie	pelo	menos	uma	instância	de	cada	classe	e	adicione	em	um	array	do
    tipo	FiguraGeometrica.	Itere	esse	array,	imprimindo	na	tela	a	area	e	o
    volume	(quando	aplicável). Dica:	você	pode	usar	o	operador	instaceOf.
    */

    private String nome;
    private String cor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}