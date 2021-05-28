package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int cont, numero;

        System.out.print("DIGITE UM NUMERO: ");
        numero = entrada.nextInt();

        cont = 1;

        while (cont <= numero) {
            if (cont * 2 <= numero) {
                System.out.print(cont + ", ");
            } else {
                System.out.print(cont);
            }
            cont = cont * 2;
        }

        entrada.close();

    }
}
