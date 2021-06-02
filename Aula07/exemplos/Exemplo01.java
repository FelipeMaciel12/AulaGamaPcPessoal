package exemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numero;
        boolean validar;
        validar = false;

        while (validar == false) {

            try {
                System.out.println("Digite um numero:");
                numero = entrada.nextInt();
                System.out.println("Voce Digitou:" + numero);
                validar = true;
            }

            catch (InputMismatchException e) {
                System.out.println("Entrada invalida");
                entrada.nextLine();
            }


        }

        System.out.println("FIM");

        entrada.close();

    }
}