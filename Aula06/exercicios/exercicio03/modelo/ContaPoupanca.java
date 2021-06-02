package exercicios.exercicio03.modelo;

/**
 * ContaPoupanca
 */
public class ContaPoupanca extends Conta {
    private static double taxaSaque=0.05;// Static: atributo de classe e não de objeto.

    public ContaPoupanca(int numero, int digito){

        super(numero, digito); 
        
    }

    
    @Override
    public boolean saque(double valor) {
        if (getSaldo() >=taxaSaque + valor) {
            return super.saque(valor+taxaSaque);

        } else {
            return false;
        }
    }
}