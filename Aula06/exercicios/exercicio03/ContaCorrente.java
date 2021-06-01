package exercicios.exercicio03;

public class ContaCorrente extends Conta {

    private final double Taxa_Deposito=0.1;

    public ContaCorrente(int numero, int digito, double saldo) {

        super(numero, digito, saldo);

    }

    @Override
    public boolean saque(double valor) {
        if (getSaldo() >= valor) {
            return super.saque(valor);

        } else {
            return false;
        }
    }

    @Override
    public boolean deposito (double valor) {
        return super.deposito(valor - Taxa_Deposito);
    }

}
