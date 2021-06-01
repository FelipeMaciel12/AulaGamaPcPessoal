package exercicios.exercicio03;

public class ContaEspecial extends Conta {
    
    private final double limite=1000.00;

    public ContaEspecial(int numero, int digito, double saldo){

        super(numero, digito, saldo);
        
    }

    @Override
    public boolean saque(double valor) {
        if (getSaldo() + limite >= valor) {
            return super.saque(valor);

        } else {
            return false;
        }
    }

}
