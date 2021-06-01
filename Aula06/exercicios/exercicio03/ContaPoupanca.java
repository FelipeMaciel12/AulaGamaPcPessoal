package exercicios.exercicio03;

/**
 * ContaPoupanca
 */
public class ContaPoupanca extends Conta {

    public ContaPoupanca(int numero, int digito, double saldo){

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
}