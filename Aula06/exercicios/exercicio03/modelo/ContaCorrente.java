package exercicios.exercicio03.modelo;

public class ContaCorrente extends Conta {

    private final double Taxa_Deposito=0.1;

    public ContaCorrente(int numero, int digito) {

        super(numero, digito);

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
