package exercicios.exercicio03.util;

import java.util.ArrayList;

import exercicios.exercicio03.modelo.Conta;
import exercicios.exercicio03.modelo.ContaCorrente;
import exercicios.exercicio03.modelo.ContaEspecial;
import exercicios.exercicio03.modelo.ContaPoupanca;

public class GerenciaContas {

    private ArrayList<Conta> contas;

    public GerenciaContas() {
        contas = new ArrayList<>();
    }

    public void novaContaCorrente(int numero, int digito) {
        contas.add(new ContaCorrente(numero, digito));
    }

    public void novaContaEspecial(int numero, int digito, double limite) {
        contas.add(new ContaEspecial(numero, digito, limite));
    }

    public void novaContaPoupanca(int numero, int digito) {
        contas.add(new ContaPoupanca(numero, digito));
    }

    public boolean sacar(int numero, int digito, double valor) {
        for (Conta conta : contas) {
            if (conta.getnumeroConta() == numero && conta.getdigitoConta() == digito) {
                return (conta.saque(valor));
            }
        }
        return false;
    }

    public boolean depositar(int numero, int digito, double valor) {
        for (Conta conta : contas) {
            if (conta.getnumeroConta() == numero && conta.getdigitoConta() == digito) {
                return (conta.deposito(valor));
            }
        }
        return false;
    }

    public String getSaldo(int numero, int digito) {
        for (Conta conta : contas) {
            if (conta.getnumeroConta() == numero && conta.getdigitoConta() == digito) {
                return conta.toString();
            }
        }
        return "Conta não encontrada";
    }
}
