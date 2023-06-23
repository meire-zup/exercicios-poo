package exercicio2;

public class SeguroDeVida extends Servico implements Tributos {

    private String numeroApolice;
    private  Double valorApolice;

    public SeguroDeVida(String nomeDoTitular, String cpf, String numeroApolice, Double valorApolice) {

        super(nomeDoTitular, cpf);
        this.numeroApolice = numeroApolice;
        this.valorApolice = valorApolice;

    }

    @Override
    public Double calcularTributos() {

        return 42.0;
    }

    @Override
    public void calcularTaxas() {

        System.out.println("VALOR A SER PAGO DE TAXAS: "+ calcularTributos());

    }
}
