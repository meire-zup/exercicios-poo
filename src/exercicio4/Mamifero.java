package exercicio4;

public class Mamifero extends Animal{

    private String alimento;

    public Mamifero(String nome, int comprimento, String cor, String ambiente, int velocidade, String alimento) {

        super(nome, comprimento, cor, ambiente, velocidade);
        this.alimento = alimento;
    }

    public Mamifero() {
        super();
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    @Override
    public void imprimeAnimal() {
        super.imprimeAnimal();
        System.out.println("alimento: "+ this.alimento);

    }
}
