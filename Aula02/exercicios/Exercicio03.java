package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        double salario, prestacao;
        System.out.print("Entre com o valor do salario: ");
        salario=entrada.nextDouble();
        System.out.print("Entre com o vaor da prestação: ");
        prestacao=entrada.nextDouble();

        System.out.println("SALÁRIO: "+ salario);
        System.out.println("PRESTAÇÃO: "+ prestacao);
        if (prestacao<=salario*0.3) {
            System.out.println("EMPRESTIMO AUTORIZADO");
        }
        else{
            System.out.println ("EMPRESTIMO NEGADO SUPERA 30% DA RENDA");
        }
        
        entrada.close();

    }
}
