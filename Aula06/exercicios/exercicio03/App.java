package exercicios.exercicio03;

//import java.util.ArrayList;
import java.util.Scanner;

import exercicios.exercicio03.modelo.Conta;
//import exercicios.exercicio03.modelo.Conta;
//import exercicios.exercicio03.modelo.ContaCorrente;
//import exercicios.exercicio03.modelo.ContaEspecial;
//import exercicios.exercicio03.modelo.ContaPoupanca;
import exercicios.exercicio03.util.GerenciaContas;

public class App {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int menu, numero, digito;
        double valor, limite;
        // ContaCorrente cc; Passando para a classe gerencia contas
        // ContaEspecial ce; Passando para a classe gerencia contas
        // ContaPoupanca cp; Passando para a classe gerencia contas

        // ArrayList<Conta> contas = new ArrayList<>(); passando o array para a classe
        // Gerencia Contas

        GerenciaContas contas = new GerenciaContas();

        do {
            System.out.print("\033[H\033[2J"); // limpar tela
            System.out.println("=====BEM VINDO AO BANCO FEMA======");
            System.out.println("1-NOVA CONTA CORRENTE");
            System.out.println("2-NOVA CONTA ESPECIAL");
            System.out.println("3-NOVA CONTA POUPANÇA");
            System.out.println("4-SAQUE");
            System.out.println("5-DEPOSITO");
            System.out.println("6-SALDO");
            System.out.println("7-SAIR");
            menu = entrada.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Informe o numero da Conta:");
                    numero = entrada.nextInt();
                    System.out.println("Informe o digito da Conta:");
                    digito = entrada.nextInt();
                    contas.novaContaCorrente(numero, digito);
                    // cc = new ContaCorrente(numero, digito); --> Passando para a gerencia contas
                    // contas.add(cc);--> Passando para a gerencia contas
                    break;

                case 2:
                    System.out.println("Informe o numero da Conta:");
                    numero = entrada.nextInt();
                    System.out.println("Informe o digito da Conta:");
                    digito = entrada.nextInt();
                    System.out.println("Informe o limite:");
                    limite = entrada.nextDouble();
                    contas.novaContaEspecial(numero, digito, limite);
                    // ce = new ContaEspecial(numero, digito, limite);
                    // contas.add(ce);
                    break;

                case 3:
                    System.out.println("Informe o numero da Conta:");
                    numero = entrada.nextInt();
                    System.out.println("Informe o digito da Conta:");
                    digito = entrada.nextInt();
                    contas.novaContaPoupanca(numero, digito);
                    // cp = new ContaPoupanca(numero, digito);
                    // contas.add(cp);
                    break;

                case 4:

                    System.out.println("Informe o numero da Conta:");
                    numero = entrada.nextInt();
                    System.out.println("Informe o digito da Conta:");
                    digito = entrada.nextInt();
                    System.out.println("Qual o valor do Saque:");
                    valor = entrada.nextDouble();

                    // for (Conta conta : contas) {
                    // if (conta.getnumeroConta() == numero && conta.getdigitoConta() == digito) {
                    // if (conta.saque(valor)) {
                    // System.out.println("Saque realizado");
                    // } else {
                    // System.out.println("Falha na operação");
                    // }
                    // break;
                    // }
                    // }

                    if (contas.sacar(numero, digito, valor)) {
                        System.out.println("Saque realizado");
                    } else {
                        System.out.println("Falha na operação");
                    }
                    break;

                case 5:
                    System.out.println("Informe o numero da Conta:");
                    numero = entrada.nextInt();
                    System.out.println("Informe o digito da Conta:");
                    digito = entrada.nextInt();
                    System.out.println("Qual o valor do deposito:");
                    valor = entrada.nextDouble();

                    // for (Conta conta : contas) {
                    // if (conta.getnumeroConta() == numero && conta.getdigitoConta() == digito) {
                    // if (conta.deposito(valor)) {
                    // System.out.println("Depósito realizado");
                    // } else {
                    // System.out.println("Falha na operação");
                    // }
                    // break;
                    // }
                    // }
                    if (contas.depositar(numero, digito, valor)) {
                        System.out.println("Depósito realizado");
                    } else {
                        System.out.println("Falha na operação");
                    }
                    break;

                case 6:
                    System.out.println("Informe o numero da Conta:");
                    numero = entrada.nextInt();
                    System.out.println("Informe o digito da Conta:");
                    digito = entrada.nextInt();
                    
                    Conta conta = contas.getConta(numero, digito);
                    if (conta!=null) {
                        System.out.println(conta);
                    } else{
                        System.out.println("Conta não encontrada!");
                    }                  
                    break;

                // for (Conta conta : contas) {
                // if (conta.getnumeroConta() == numero && conta.getdigitoConta() == digito) {
                // System.out.println(conta);
                // break;
                // }
                // }

                case 7:

                    System.out.println("Até mais tarde");
                    break;

                default:// CASO CONTRARIO
                    System.out.println("OPÇÃO INVALIDA!");
            }
            System.out.println("Tecle enter para continuar...");
            entrada.nextLine();
            entrada.nextLine();

        } while (menu != 7);
        entrada.close();
    }
}
