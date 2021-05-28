package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        double n1, n2;
        System.out.print("Entre com o numero 01: ");
        n1=entrada.nextDouble();
        System.out.print("Entre com o numero 02: ");
        n2=entrada.nextDouble();

        if (n1>=n2) {
            System.out.println("01: "+ n2+ "\n02: "+n1);
        }
        else{
            System.out.println("01: "+ n1+ "\n02: "+n2);
        }
        
        entrada.close();

    }
}
