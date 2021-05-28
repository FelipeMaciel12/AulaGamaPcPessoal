package exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);      
        int cont, numero, soma, aux;
        cont=1;
        soma=0;
        aux=1;
        while (cont!=0) {
            System.out.print("Digite o "+ aux + "o numero:");
            numero=entrada.nextInt();
            cont=numero;
            soma=soma+numero;
            aux++;
          
        }     
        System.out.println("A soma dos valores é: "+soma);
        entrada.close();

    }
}
