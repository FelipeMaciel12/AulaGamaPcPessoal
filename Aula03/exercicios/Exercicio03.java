package exercicios;

import java.util.Scanner;

/**
 * Exercicio03
 */
public class Exercicio03 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int numero, cont;

        System.out.print("Insira o numero que deseja imprimir a tabuada:");
        numero=entrada.nextInt();
        cont=0;

        while (cont<=10) {
            
            System.out.println(numero +" x "+cont+" = "+ (numero*cont));
            cont++;

        }

       entrada.close(); 

    }
}