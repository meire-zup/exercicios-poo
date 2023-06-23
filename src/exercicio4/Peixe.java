package exercicio4;

public class Peixe extends Animal{

    private String barbatanas;
    private String cauda;

    public Peixe(String nome, int comprimento, String cor, String ambiente,
                 int velocidade, String barbatanas, String cauda) {

        super(nome, comprimento, cor, ambiente, velocidade);

        super.setNumPatas(0);
        super.setAmbiente("mar");
        super.setCor("cinzenta");

        this.barbatanas = barbatanas;
        this.cauda = cauda;

    }

    @Override
    public void imprimeAnimal() {
        super.imprimeAnimal();
        System.out.println("barbatanas: "+ this.barbatanas);
        System.out.println("cauda: "+ this.cauda);

    }
}
