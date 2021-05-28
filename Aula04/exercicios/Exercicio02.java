package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
                
        Scanner teclado = new Scanner(System.in);
        int n1, n2, n3, teste;

        System.out.print("Digite o primeiro numero: " );
        n1=teclado.nextInt();
        System.out.print("Digite o segundo numero: ");
        n2=teclado.nextInt();
        System.out.print("Digite o terceiro numero: ");
        n3=teclado.nextInt();
        
        teste=menor(n1, n2, n3);
        
        System.out.println("O menor número digitado: "+teste);
        
        
        teclado.close();
    }

    static int menor (int n1, int n2, int n3){

        if (n1<=n2 && n1<=n3) {
            return n1;
        } else{
            if (n2<=n1&&n2<=n3) {
                return n2;
            } else{
                return n3;
            }
        }

    }
}
