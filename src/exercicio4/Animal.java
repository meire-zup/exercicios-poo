package exercicio4;

public class Animal {

    private String nome;
    private int comprimento;
    private int numPatas;
    private String cor;
    private String ambiente;
    private int velocidade;


    public Animal(String nome, int comprimento, String cor, String ambiente, int velocidade) {
        this.nome = nome;
        this.comprimento = comprimento;
        this.numPatas = 4;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velocidade = velocidade;
    }

    public Animal() {

    }

    public String getNome() {
        return nome;
    }

    public int getComprimento() {
        return comprimento;
    }

    public int getNumPatas() {
        return numPatas;
    }

    public String getCor() {
        return cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public void setNumPatas(int numeroPatas) {
        this.numPatas = numeroPatas;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }


    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public void imprimeAnimal() {
        System.out.println("***********************");
        System.out.println("nome: "+ this.nome);
        System.out.println("comprimento: "+ this.comprimento);
        System.out.println("número de patas: "+ this.numPatas);
        System.out.println("cor: "+ this.cor);
        System.out.println("ambiente: "+ this.ambiente);
        System.out.println("velocidade: "+ this.velocidade);

    }

}
