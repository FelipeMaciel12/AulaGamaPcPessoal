package exercicios.exercicio03.util;

//import java.util.ArrayList;
import java.util.HashMap;

import exercicios.exercicio03.modelo.Conta;
import exercicios.exercicio03.modelo.ContaCorrente;
import exercicios.exercicio03.modelo.ContaEspecial;
import exercicios.exercicio03.modelo.ContaPoupanca;

public class GerenciaContas {

    private HashMap<Integer, Conta> contas;

    public GerenciaContas() {
        contas = new HashMap<>();
    }

    public void novaContaCorrente(int numero, int digito) {
        contas.put(numero, new ContaCorrente(numero, digito));
    }

    public void novaContaEspecial(int numero, int digito, double limite) {
        contas.put(numero, new ContaEspecial(numero, digito, limite));
    }

    public void novaContaPoupanca(int numero, int digito) {
        contas.put(numero, new ContaPoupanca(numero, digito));
    }

    public boolean sacar(int numero, int digito, double valor) {

        Conta conta = contas.get(numero);
        if (conta == null) {
            return false;
        }
        return (conta.saque(valor));

        /*
         * for (Conta conta : contas) { if (conta.getnumeroConta() == numero &&
         * conta.getdigitoConta() == digito) { return (conta.saque(valor)); } } return
         * false;
         */
    }

    public boolean depositar(int numero, int digito, double valor) {

        Conta conta = contas.get(numero);
        if (conta == null) {
            return false;
        }
        return (conta.deposito(valor));

        /*
         * for (Conta conta : contas) { if (conta.getnumeroConta() == numero &&
         * conta.getdigitoConta() == digito) { return (conta.deposito(valor)); } }
         * return false;
         */
    }

    public String getSaldo(int numero, int digito) {
        Conta conta = contas.get(numero);
        if (conta == null) {
            return "Conta não encontrada!";
        }
        return (conta.toString());

        /*
         * for (Conta conta : contas) { if (conta.getnumeroConta() == numero &&
         * conta.getdigitoConta() == digito) { return conta.toString(); } } return
         * "Conta não encontrada";
         */
    }

    public Conta getConta(int numero, int digito) {

        Conta conta = contas.get(numero);
        if (conta == null) {
            return null;
        }
        return (conta);

        /*
         * for (Conta conta : contas) { if (conta.getnumeroConta() == numero &&
         * conta.getdigitoConta() == digito) { return conta; } } return null;
         */
    }
}
