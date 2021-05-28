package exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        double n1,n2,media;
        System.out.print("Entre com a nota da primeira prova: ");
        n1=entrada.nextDouble();
        System.out.print("Entre com a nota da segunda prova: ");
        n2=entrada.nextDouble();

        media=((n1*0.4) + (n2*0.6));

        

        if (media>=6.0){
            System.out.println("Aprovado: "+ media);
        }

        else {
            System.out.println("Reprovado: " + media);

        }

        entrada.close();

    }
}
