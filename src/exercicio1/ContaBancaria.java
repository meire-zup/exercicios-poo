package exercicio1;

public abstract class ContaBancaria {

    private String nomeCliente;
    private Long numeroConta;
    private Double saldo;

    public ContaBancaria(String nomeCliente, Long numeroConta, Double saldo) {
        this.nomeCliente = nomeCliente;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getSaldo() {

        return saldo;


    }

    public Long getNumeroConta() {
        return numeroConta;
    }

    public void sacar(double valorSaque){

        if (this.saldo > valorSaque) {
            System.out.println("Saque de " + valorSaque + " da conta nº " + numeroConta);
        } else {
            System.out.println("A conta " + numeroConta + "não possui saldo disponível.");

        }

        this.saldo = this.saldo - valorSaque;

    }



    public void depositar(double valorDeposito){

        this.saldo = this.saldo + valorDeposito;
        System.out.println("Depósito de  " + valorDeposito + " na conta nº " + numeroConta );

    }
}
