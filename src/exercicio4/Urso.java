package exercicio4;

public class Urso extends Mamifero{

    public Urso(String nome, int comprimento, String cor, String ambiente, int velocidade, String alimento) {

        super(nome, comprimento, cor, ambiente, velocidade, alimento);

    }

    public Urso(String nome, int comprimento, String ambiente, int velocidade ) {
        super();
        super.setNome(nome);
        super.setComprimento(comprimento);
        super.setNumPatas(4);
        super.setAmbiente(ambiente);
        super.setVelocidade(60);
        super.setCor("castanho");
        super.setAlimento("mel");

    }
    @Override
    public void imprimeAnimal() {
        super.imprimeAnimal();
    }

}
