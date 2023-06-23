package exercicio2;

public class ContaPoupanca extends Servico {

        private String numeroConta;

        private Double saldo;

        public ContaPoupanca(String nomeDoTitular, String cpf, String numeroConta, Double saldo) {

            super(nomeDoTitular, cpf);
            this.saldo = saldo;
            this.numeroConta = numeroConta;

        }

        @Override
        public void calcularTaxas() {

            System.out.println("ISENTO DE TAXAS");

        }

}
