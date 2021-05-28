package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        double salario;

        System.out.print("Informe o valor do Salário: ");
        salario=entrada.nextDouble();

        if (salario<=600.00) {

            System.out.println("Desconto Imposto de Renda: Isento");
        }
        else {

            if(salario>600.00 && salario<=1200.00){
                System.out.println("Desconto Imposto de Renda: 20%");
            }

            if(salario>1200.00 && salario<=2000.00){
                System.out.println("Desconto Imposto de Renda: 25%");
            } 

            if(salario>2000.00){
                System.out.println("Desconto Imposto de Renda: 30%");
            } 
            
        }
        entrada.close();
    }
}
