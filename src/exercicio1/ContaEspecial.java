package exercicio1;

public class ContaEspecial extends ContaBancaria {

    private Double limite;

    public ContaEspecial(String nomeCliente, Long numeroConta, Double saldo, Double limite) {

        super(nomeCliente, numeroConta, saldo);
        this.limite = limite;

    }

    @Override
    public void sacar(double valorSaque) {

        super.setSaldo(super.getSaldo() + limite);

        super.sacar(valorSaque);

        super.setSaldo(super.getSaldo() - limite);

        if(super.getSaldo() >= 0) {

            this.limite = limite - getSaldo();

        }

        this.limite = getSaldo() + limite;
        System.out.println("Saldo: " + super.getSaldo());
        System.out.println("Limite: " + this.limite);

    }


    /* @Override
    public void sacar(double valorSaque) {
            double valorDisponivel = super.getSaldo() +this.limite;
        if (valorDisponivel > 0) {

            System.out.println("Saque de " + valorSaque + " da conta nº " + super.getNumeroConta());
            valorDisponivel = valorDisponivel - valorSaque;
            super.setSaldo(valorDisponivel - limite);

        }

        System.out.println("A conta " + super.getNumeroConta() + "não possui saldo disponível.");

    }


    }*/
}
