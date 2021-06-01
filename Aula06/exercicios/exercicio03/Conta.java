package exercicios.exercicio03;

public class Conta {

    private int numero, digito;
    private double saldo;

    public Conta(int numero, int digito, double saldo) {
        this.numero = numero;
        this.digito = digito;
        this.saldo = saldo;

    }

    public String getConta() {
        return "Conta: " + numero + "-" + digito +" R$ "+saldo;
    }

    public String toString() {
        return "Conta: " + numero + "-" + digito +" R$ "+saldo;
    }

    public double getSaldo(){
        return saldo;
    }

    public boolean deposito(double valor) {
        if (valor > 0) {
            this.saldo = this.saldo + valor;
            return true;
        } else {
            return false;
        }

    }

    public boolean saque(double valor) {
        if (valor > 0) {
            this.saldo = this.saldo - valor;
            return true;
        } else {
            return false;
        }

    }

}