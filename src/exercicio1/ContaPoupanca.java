package exercicio1;

public class ContaPoupanca extends ContaBancaria{

    private int diaRendimento;

    public ContaPoupanca(String nomeCliente, Long numeroConta, Double saldo) {

        super(nomeCliente, numeroConta, saldo);

    }

    public Double calcularNovoSaldo(int taxaRendimento){

        double novoSaldo = ((taxaRendimento/100)+1) * super.getSaldo();

        return novoSaldo;

    }


}
