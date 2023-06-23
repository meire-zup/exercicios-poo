package exercicio2;

public abstract class Servico{

    private String nomeDoTitular;
    private String cpf;

    public Servico(String nomeDoTitular, String cpf) {

        this.nomeDoTitular = nomeDoTitular;
        this.cpf = cpf;

    }

    public void calcularTaxas(){

    }
}
