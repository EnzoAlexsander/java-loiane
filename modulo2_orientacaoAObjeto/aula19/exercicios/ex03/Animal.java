package modulo2_orientacaoAObjeto.aula19.exercicios.ex03;

public class Animal {
    /*
    3- Um animal contém nome, comprimento, número de patas (padrão é 4), cor, ambiente e velocidade (em m/s).
    Um peixe é um animal, tem 0 patas, seu ambiente é o mar (padrão), cor cinzenta (padrão). Além disso tem
    como características barbatanas e cauda.
    Um mamífero é um animal e seu ambiente padrão é terra.
    Um urso é um mamífero, cor castanho e seu alimento preferido é o mel.
    Crie as classes Animal, Peixe e Mamífero.
    Para a classe Animal, coloque os atributos:
    • Nome, comprimento, patas, cor, ambiente, velocidade
    Para a classe Peixe, codifique o atributo características.
    Para a classe Mamifero, coloque o atributo alimento.
    Por último, crie uma classe teste de forma a ter um jardim zoológico com os
    seguintes animais: camelo, tubarão, urso`do`canadá.
    Exemplo da execução:

    Zoo:
    ------------------------
    Animal: Camelo
    Comprimento: 150cm
    Patas: 4
    Cor: Amarelo
    Ambiente: Terra
    Velocidade: 2.0 m/s
    ------------------------
    Animal: Tubarão
    Comprimento: 300cm
    Patas: 0
    Cor: Cinzento
    Ambiente: Mar
    Velocidade: 1.5 m/s
    Característica: Barbatanas e cauda.
    -----------------------
    Animal: Urso-do-Canadá
    Comprimento: 180cm
    Patas: 4
    Cor: Vermelho
    Ambiente: Terra
    Velocidade: 0.5 m/s
    Alimento: Mel
     */

    private String nome;
    private int comprimento;
    private int patas;
    private String cor;
    private String ambiente;
    private double velocidade;

    public Animal() {
        this.patas = 4;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    @Override
    public String toString() {
        String s = "Animal: " + nome;
        s += "\nComprimento: " + comprimento + " cm";
        s += "\nPatas: " + patas;
        s += "\nCor: " + cor;
        s += "\nAmbiente: " + ambiente;
        s += "\nVelocidade: " + velocidade + " m/s";
        return s;
    }
}