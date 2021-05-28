package exercicios;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numero;

        numero = entrada.nextInt();
        
        if (testepi(numero)) {
            System.out.println("numero par");
        } else {
            System.out.println("numero impar");
        }

        entrada.close();
    }

    static boolean testepi(int numero) {
        boolean teste;
        if (numero % 2 == 0) {
            teste = true;
        } else {
            teste = false;
        }
        return teste;
    }

}
