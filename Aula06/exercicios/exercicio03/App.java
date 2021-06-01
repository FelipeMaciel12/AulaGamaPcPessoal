package exercicios.exercicio03;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int menu, numero, digito;
        double valor;
        ContaCorrente cc;
        ArrayList<ContaCorrente> contas = new ArrayList<>();
        
        System.out.print("\033[H\033[2J"); // limpar tela

        do {

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
                    cc = new ContaCorrente(numero, digito);
                    contas.add(cc);
                    // System.out.println("Conta Cadastrada: "+ cc.getConta());
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Informe o numero da Conta:");
                    numero = entrada.nextInt();
                    System.out.println("Informe o digito da Conta:");
                    digito = entrada.nextInt();
                    System.out.println("Qual o valor do deposito:");
                    valor = entrada.nextDouble();

                    for (ContaCorrente contaCorrente : contas) {

                        if (contaCorrente.getnumeroConta() == numero && contaCorrente.getdigitoConta() == digito) {
                            if (contaCorrente.deposito(valor)) {
                                System.out.println("Depósito realizado");

                            } else {
                                System.out.println("Falha na operação");
                            }
                            break;
                        }
                    }
                case 6:
                    System.out.println("Informe o numero da Conta:");
                    numero = entrada.nextInt();
                    System.out.println("Informe o digito da Conta:");
                    digito = entrada.nextInt();

                    for (ContaCorrente contaCorrente : contas) {

                        if (contaCorrente.getnumeroConta() == numero && contaCorrente.getdigitoConta() == digito) {
                            System.out.println(contaCorrente);
                            break;
                        }
                    }

                 case 7:
                    
                    System.out.println("Até mais tarde");
                    break;
                 
                default:// CASO CONTRARIO
                    System.out.println("OPÇÃO INVALIDA!");
            }

        } while (menu != 7);
        entrada.close();
    }
}
