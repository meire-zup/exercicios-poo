import exercicio1.ContaEspecial;
import exercicio1.ContaPoupanca;

public class Main {
    public static void main(String[] args) {

        ContaPoupanca contaPoupanca = new ContaPoupanca("João da Silva", 126745678L, 400.00);
        ContaEspecial contaEspecial = new ContaEspecial("Aline da Silva", 126745645L, 1000.00, 1000.00);

        // Sacar:
        //contaPoupanca.sacar(500);
        contaEspecial.sacar(2100);

    }

}